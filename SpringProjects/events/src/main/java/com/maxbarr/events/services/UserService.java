package com.maxbarr.events.services;

import java.util.List;
import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maxbarr.events.models.User;
import com.maxbarr.events.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
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
	
//	Find all users
	
	public List<User> allUsers() {
		return userRepository.findAll();
	}
	
//	Save a user
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
//	Delete a user
	
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}
}
