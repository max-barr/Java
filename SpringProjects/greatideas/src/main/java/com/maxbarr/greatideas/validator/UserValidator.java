package com.maxbarr.greatideas.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.maxbarr.greatideas.models.User;
import com.maxbarr.greatideas.repositories.UserRepository;

@Component
public class UserValidator implements Validator {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		
		if (!user.getPasswordConfirmation().equals(user.getPassword())) {
			errors.rejectValue("passwordConfirmation", "Match");
		}
		
		if (this.userRepository.findByEmail(user.getEmail()) != null) {
        	errors.rejectValue("email", "Unique");
        }
	}
}
