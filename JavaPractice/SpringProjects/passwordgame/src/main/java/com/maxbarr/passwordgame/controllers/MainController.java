package com.maxbarr.passwordgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	
	@GetMapping("/password")
	public String accept() {
		
		return "dashboard.jsp";
	}
	
	
	@PostMapping("/login")
	public String enterPassword() {
		
		return "redirect:/password";
	}
	
	

}
