package com.maxbarr.authentication.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maxbarr.authentication.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

//	Retrieve a specific user by email
	
	User findByEmail(String email);
	
}
