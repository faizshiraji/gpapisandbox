package com.topupsandbox.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topupsandbox.entities.response.GPResponse;
import com.topupsandbox.repos.GPResponseRepo;

@Service
public class GPResponseServiceImpl implements GPResponseService {

	@Autowired
	public GPResponseRepo gpResponseRepo;


	@Override
	public List<GPResponse> getGpResponses() {
		return gpResponseRepo.findAll();
	}


	@Override
	public GPResponse getGpResponse(int gpResponseId) {
		return gpResponseRepo.findById(gpResponseId).get();
	}

	@Override
	public GPResponse getGpResponseByTxnId(String gpResponseTxnId) {
		return gpResponseRepo.findByTxnid(gpResponseTxnId);
	}

	@Override
	public GPResponse addGpResponse(GPResponse gpResponse) {
		return gpResponseRepo.save(gpResponse);
	}


	@Override
	public GPResponse updateGpResponse(GPResponse gpResponse) {
		return gpResponseRepo.save(gpResponse);
	}


	@Override
	public void deleteGpResponse(int gpResponseId) {
		GPResponse gpResponse = gpResponseRepo.getOne(gpResponseId);
		gpResponseRepo.delete(gpResponse);
		
	}




	
	
}
