package com.topupsandbox.services;

import java.util.List;

import com.topupsandbox.entities.response.GPResponse;

public interface GPResponseService {

	public List<GPResponse> getGpResponses();
	
	public GPResponse getGpResponse(int gpResponseId);
	
	public GPResponse getGpResponseByTxnId(String gpResponseTxnId);
	
	public GPResponse addGpResponse(GPResponse gpResponse);
	
	public GPResponse updateGpResponse(GPResponse gpResponse);
	
	public void deleteGpResponse(int gpResponseId);
}
