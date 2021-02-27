package com.topupsandbox.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topupsandbox.entities.request.GPRequest;
import com.topupsandbox.repos.GPRequestRepo;

@Service
public class GPRequestServiceImpl implements GPRequestService {

	@Autowired
	public GPRequestRepo gpRequestRepo;
	
	@Override
	public List<GPRequest> getGpRequests() {
		return gpRequestRepo.findAll();
	}

	@Override
	public GPRequest getGpRequest(int gpRequestId) {
		return gpRequestRepo.findById(gpRequestId).get();
	}

	@Override
	public GPRequest getGpRequestByTxnId(String gpextrefnum) {
		return gpRequestRepo.findByextrefnum(gpextrefnum);
	}
	
	@Override
	public GPRequest addGpRequest(GPRequest gpRequest) {
		return gpRequestRepo.save(gpRequest);
		
	}

	@Override
	public GPRequest updateGpRequest(GPRequest gpRequest) {
		return gpRequestRepo.save(gpRequest);
	}

	@Override
	public void deleteGpRequest(int gpRequestId) {
		GPRequest gpRequest = gpRequestRepo.getOne(gpRequestId);
		gpRequestRepo.delete(gpRequest);
	}

}
