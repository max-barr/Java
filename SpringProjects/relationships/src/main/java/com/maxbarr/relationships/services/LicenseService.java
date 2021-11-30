package com.maxbarr.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.maxbarr.relationships.models.License;
import com.maxbarr.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	// returns all the licenses
    public List<License> allLicenses() {
        return licenseRepository.findAll();
    }
    // creates a license
    public License createLicense(License license) {
    		license.setNumber(findNewestLicense());
        return licenseRepository.save(license);
    }
    // retrieves a license
    public License findLicense(Long id) {
        Optional<License> optionalLicense = licenseRepository.findById(id);
        if(optionalLicense.isPresent()) {
            return optionalLicense.get();
        } else {
            return null;
        }
    }
    
    public int findNewestLicense() {
    		License license = licenseRepository.findTopByOrderByIdDesc();
    		if(license == null) {
    			return 1;
    		} else {
    			Long num = license.getId();
    			num += 1;
    			int result = num.intValue();
    			System.out.println(result);
    			return result;
    		}
        
    }

    public License updateLicense(License license) {
    		return licenseRepository.save(license);
    }
	
	public void deleteLicense(Long id) {
		licenseRepository.deleteById(id);
	}
}
