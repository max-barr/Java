package com.maxbarr.greatideas.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maxbarr.greatideas.models.User;
import com.maxbarr.greatideas.services.UserService;
import com.maxbarr.greatideas.validator.UserValidator;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private UserValidator userValidator;
	
//	Get request for Login/Registration page
	
	@GetMapping("/home")
	public String index(@ModelAttribute("user") User user) {
		return "login.jsp";
	}
	
//	Post request for Registration
	
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		userValidator.validate(user, result);
		
		if (result.hasErrors()) {
			return "login.jsp";
		} else {
			User u = userService.registerUser(user);
			session.setAttribute("userId", u.getId());
			return "redirect:/ideas";
		}
	}
	
//	Post request for Login
	
	@PostMapping("/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
		// if the user is authenticated, save their user id in session
		boolean isAuthenticated = userService.authenticateUser(email, password);
		if (isAuthenticated) {
			User u = userService.findByEmail(email);
			session.setAttribute("userId", u.getId());
			return "redirect:/ideas";
		} else {
        // else, add error messages and return the login page
			model.addAttribute("user", new User());
			model.addAttribute("error", "Invalid credentials. Please try again.");
			return "login.jsp";
		}
	}
	
//	GET request for logout
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/home";
	}
}
