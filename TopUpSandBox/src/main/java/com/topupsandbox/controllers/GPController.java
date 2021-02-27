package com.topupsandbox.controllers;

import java.sql.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;

import com.topupsandbox.entities.request.GPRequest;
import com.topupsandbox.entities.request.GPRestrictions;
import com.topupsandbox.entities.response.GPResponse;
import com.topupsandbox.services.GPRequestService;
import com.topupsandbox.services.GPResponseService;
import com.topupsandbox.services.GPRestrictionsService;
import com.topupsandbox.services.SnowFlacks;

@RestController
public class GPController {

	@Autowired
	private GPResponseService gpResponseService;

	@Autowired
	private GPRequestService gpRequestService;

	@Autowired
	private GPRestrictionsService gpRestrictionsService;

	@Autowired
	private SnowFlacks randomTranId;

	@GetMapping("/gpresponse")
	public List<GPResponse> getGpResponses() {
		return this.gpResponseService.getGpResponses();

	}

	@GetMapping("/gprequest")
	public List<GPRequest> getGpRequests() {
		return this.gpRequestService.getGpRequests();
	}

	@GetMapping("/gpresponse/{gpResponseId}")
	public GPResponse getGpResponse(@PathVariable String gpResponseId) {
		return this.gpResponseService.getGpResponse(Integer.parseInt(gpResponseId));

	}

//	txnid

//	@GetMapping("/gpresponsequery/{gpResponseTxnId}")
//	public GPResponse getGpResponseByTxnId(@PathVariable String gpResponseTxnId) {
//		return this.gpResponseService.getGpResponseByTxnId(gpResponseTxnId);
//		
//	}

	@GetMapping("/gpresponsequery/{gpResponseTxnId}")
	public ResponseEntity<GPResponse> getGpResponseByTxnId(@PathVariable String gpResponseTxnId) {
		try {
			GPResponse gpResponseByTxnId = this.gpResponseService.getGpResponseByTxnId(gpResponseTxnId);
			return new ResponseEntity<GPResponse>(gpResponseByTxnId, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<GPResponse>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/gprequest")
	public ResponseEntity<GPResponse> addGPRequest(@RequestBody GPRequest gpRequest, GPResponse gpResponse) {
		GPRequest addGpRequest = gpRequestService.addGpRequest(gpRequest);
		double amount = addGpRequest.getAmount();
		int msisdn2 = addGpRequest.getMsisdn2();
		gpResponse.setAmount(amount);
		Date currentSqlDate = new Date(System.currentTimeMillis());
		gpResponse.setDate(currentSqlDate);
		gpResponse.setExtrefnum(addGpRequest.getExtrefnum());
		gpResponse.setServicetype("RC");
		gpResponse.setTxndate(currentSqlDate);
		gpResponse.setType(addGpRequest.getType());
		long nextId = randomTranId.nextId();
//		BD12171356120068
		String trxFrst = "BD" + nextId;

		gpResponse.setTxnid(trxFrst);

		gpResponse.setTxnstatus(200);
//		210:Recharge request of TK 99 for mobile no. 1764793982, transaction ID BD12171356120068 is successful. Your account balance is TK 1312326.28.
		double accBalance = 1312326.28;
		String msg = "210:Recharge request of TK" + amount + " for mobile no. " + msisdn2 + ", transaction ID "
				+ trxFrst + " is successful. Your account balance is TK" + accBalance + ".";
		gpResponse.setMessage(msg);

		GPResponse addGpResponse = gpResponseService.addGpResponse(gpResponse);
		return new ResponseEntity<GPResponse>(addGpResponse, HttpStatus.CREATED);

	}

	@PostMapping("/gprequesttest")
	public ResponseEntity<GPResponse> addTestGPRequest(@RequestBody GPRequest gpRequest, GPResponse gpResponse,
			GPRestrictions gpRestrictions) {
		GPRequest addGpRequest = gpRequestService.addGpRequest(gpRequest);
		double amount = addGpRequest.getAmount();

		GPRestrictions gpRestrictionByTelco = gpRestrictionsService.getGpRestrictionByTelco("gp");

		int msisdn2 = addGpRequest.getMsisdn2();
		gpResponse.setAmount(amount);
		Date currentSqlDate = new Date(System.currentTimeMillis());
		gpResponse.setDate(currentSqlDate);
		gpResponse.setExtrefnum(addGpRequest.getExtrefnum());
		gpResponse.setServicetype("RC");
		gpResponse.setTxndate(currentSqlDate);
		gpResponse.setType(addGpRequest.getType());
		long nextId = randomTranId.nextId();
		String trxFrst = "BD" + nextId;

		gpResponse.setTxnid(trxFrst);

		
		double accBalance = 1312326.28;
		
		
		if (gpRestrictionByTelco.getMax() < amount) {
			gpResponse.setTxnstatus(300);
			String msgError = "Your request is not valid.";
			GPResponse addGpResponse = gpResponseService.addGpResponse(gpResponse);
			return new ResponseEntity<GPResponse>(addGpResponse, HttpStatus.FAILED_DEPENDENCY);
		} else {
			String msg = "210:Recharge request of TK" + amount + " for mobile no. " + msisdn2 + ", transaction ID "
					+ trxFrst + " is successful. Your account balance is TK" + accBalance + ".";
			GPResponse addGpResponse = gpResponseService.addGpResponse(gpResponse);
			return new ResponseEntity<GPResponse>(addGpResponse, HttpStatus.CREATED);
		}

//		System.out.println(gpRestrictionByTelco);

		

		

//		return new ResponseEntity<GPResponse>(addGpResponse, HttpStatus.CREATED);

	}
}
