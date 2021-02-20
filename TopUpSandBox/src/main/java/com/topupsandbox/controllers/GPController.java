package com.topupsandbox.controllers;

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

import com.topupsandbox.entities.request.GPRequest;
import com.topupsandbox.entities.response.GPResponse;
import com.topupsandbox.services.GPRequestService;
import com.topupsandbox.services.GPResponseService;

@RestController
public class GPController {
	
	@Autowired
	private GPResponseService gpResponseService;
	
	@Autowired
	private GPRequestService gpRequestService;
	
	
	@GetMapping("/gpresponse")
	public List<GPResponse> getGpResponses() {
		return this.gpResponseService.getGpResponses();
		
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
	public ResponseEntity<?> addGPRequest(@RequestBody GPRequest gpRequest, GPResponse gpResponse) {
		gpRequestService
		return null;
		
	}
}
