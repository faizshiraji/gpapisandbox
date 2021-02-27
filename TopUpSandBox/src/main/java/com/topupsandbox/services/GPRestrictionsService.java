package com.topupsandbox.services;

import java.util.List;

import com.topupsandbox.entities.request.GPRestrictions;

public interface GPRestrictionsService {

	public List<GPRestrictions> getGpRestrictions();
	
	public GPRestrictions getGpRestrictionById(int gpRestrictionId);
	
	public GPRestrictions getGpRestrictionByTelco(String gpRestrictionTelco);
	
	public GPRestrictions addGpRestriction(GPRestrictions gpRestrictions);
	
	public GPRestrictions updateGpRestrictions(GPRestrictions gpRestrictions);
	
	public void deleteGpRestriction(int gpRestrictionId);
	
}
