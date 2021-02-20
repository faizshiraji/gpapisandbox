package com.topupsandbox.services;

import java.util.List;

import com.topupsandbox.entities.request.GPRequest;

public interface GPRequestService {
	
	public List<GPRequest> getGpRequests();
	
	public GPRequest getGpRequest(int gpRequestId);
	
	public GPRequest getGpRequestByTxnId(String gpRequestTxnId);
	
	public GPRequest addGpRequest(GPRequest gpRequest);
	
	public GPRequest updateGpRequest(GPRequest gpRequest);
	
	public void deleteGpRequest(int gpRequestId);
}
