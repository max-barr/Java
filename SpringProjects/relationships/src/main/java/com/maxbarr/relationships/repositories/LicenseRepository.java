package com.maxbarr.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maxbarr.relationships.models.License;


@Repository
public interface LicenseRepository extends CrudRepository<License, Long> {
	// this method retrieves all the languages from the database
    List<License> findAll();
    
    License findTopByOrderByIdDesc();
    	
}
