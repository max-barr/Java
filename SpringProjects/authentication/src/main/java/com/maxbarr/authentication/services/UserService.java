package com.maxbarr.authentication.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import com.maxbarr.authentication.models.User;
import com.maxbarr.authentication.repositories.UserRepository;

@Service
public class UserService {
	private final UserRepository userRepository;
	
//	Constructor
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
//	Register a user and hash their password
	
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return userRepository.save(user);
	}
	
//	Find a user by email
	
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
//	Find a user by id
	
	public User findById(Long id) {
		Optional<User> u = userRepository.findById(id);
		
		if (u.isPresent()) {
			return u.get();
		} else {
			return null;
		}
	}
	
//	Authenticate a user
	
	public boolean authenticateUser(String email, String password) {

//		First, find the user by email
		User user = userRepository.findByEmail(email);
		
//		If we can't find the user by email, return false
		if (user == null) {
			return false;
		} else {
//			If the passwords match, return true. Else, return false
			if (BCrypt.checkpw(password, user.getPassword())) {
				return true;
			} else {
				return false;
			}
		}
	}
}
