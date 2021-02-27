package com.topupsandbox.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topupsandbox.entities.request.GPRestrictions;
import com.topupsandbox.repos.GPRestrictionsRepo;

@Service
public class GPRestrictionsServiceImpl implements GPRestrictionsService {

	@Autowired
	public GPRestrictionsRepo gpRestrictionsRepo;

	@Override
	public List<GPRestrictions> getGpRestrictions() {
		return gpRestrictionsRepo.findAll();
	}

	@Override
	public GPRestrictions getGpRestrictionById(int gpRestrictionId) {
		return gpRestrictionsRepo.findById(gpRestrictionId).get();
	}

	@Override
	public GPRestrictions getGpRestrictionByTelco(String gpRestrictionTelco) {
		return gpRestrictionsRepo.findByTelco(gpRestrictionTelco);
	}

	@Override
	public GPRestrictions addGpRestriction(GPRestrictions gpRestrictions) {
		return gpRestrictionsRepo.save(gpRestrictions);
	}

	@Override
	public GPRestrictions updateGpRestrictions(GPRestrictions gpRestrictions) {
		return gpRestrictionsRepo.save(gpRestrictions);
	}

	@Override
	public void deleteGpRestriction(int gpRestrictionId) {
		GPRestrictions gpRestrictions = gpRestrictionsRepo.getOne(gpRestrictionId);
		gpRestrictionsRepo.delete(gpRestrictions);
	}
	
}
