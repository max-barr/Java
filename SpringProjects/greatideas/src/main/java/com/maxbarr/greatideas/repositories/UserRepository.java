package com.maxbarr.greatideas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.maxbarr.greatideas.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//	Retrieve a user by email
	
	User findByEmail(String email);
	
//	Find all users
	
	List<User> findAll();
}
