package com.topupsandbox.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.topupsandbox.entities.request.GPRestrictions;

@Repository
public interface GPRestrictionsRepo extends JpaRepository<GPRestrictions, Integer> {
	
	GPRestrictions findByTelco(String telco);
}
