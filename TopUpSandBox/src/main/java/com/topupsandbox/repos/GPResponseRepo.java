package com.topupsandbox.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.topupsandbox.entities.response.GPResponse;

@Repository
public interface GPResponseRepo extends JpaRepository<GPResponse, Integer> {

	GPResponse findByTxnid(String txnid);
	
}
