package com.maxbarr.authentication.controllers;

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

import com.maxbarr.authentication.models.User;
import com.maxbarr.authentication.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
//	GET request for registration page
	
	@GetMapping("/registration")
	public String registerForm(@ModelAttribute("user") User user) {
		return "registrationPage.jsp";
	}
	
//	GET request for login page
	
	@GetMapping("/login")
	public String login() {
		return "loginPage.jsp";
	}
	
//	POST request for registration page
	
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
//		If the result has errors, return the registration page (don't worry about validations yet)
//		Else, save the user in the database, save their user id in session, and redirect them to the home route
		
		if (result.hasErrors()) {
			return "registrationPage.jsp";
		} else {
		User u = userService.registerUser(user);
		session.setAttribute("userId", u.getId());
		return "redirect:/home";
		}
	}
	
//	POST request for login page
	
	@PostMapping("/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
		// if the user is authenticated, save their user id in session
		boolean isAuthenticated = userService.authenticateUser(email, password);
		if (isAuthenticated) {
			User u = userService.findByEmail(email);
			session.setAttribute("userId", u.getId());
			return "redirect:/home";
		} else {
        // else, add error messages and return the login page
			model.addAttribute("error", "Invalid credentials. Please try again.");
			return "loginPage.jsp";
		}
	}
	
//	GET request for home page
	
	@GetMapping("/home")
	public String home(HttpSession session, Model model) {
//		Get user from session, save them in the model and return to the home page
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findById(userId);
		model.addAttribute("user", u);
		return "homePage.jsp";
	}
	
//	GET request for logout
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	
}
