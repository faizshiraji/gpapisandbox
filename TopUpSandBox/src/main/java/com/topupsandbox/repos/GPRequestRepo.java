package com.topupsandbox.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.topupsandbox.entities.request.GPRequest;

@Repository
public interface GPRequestRepo extends JpaRepository<GPRequest, Integer> {

}
