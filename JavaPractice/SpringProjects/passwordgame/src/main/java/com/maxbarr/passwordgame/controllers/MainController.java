package com.maxbarr.passwordgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home() {
		
	}
	
	
	@GetMapping("/password")
	
	
	@PostMapping("/")
	public String enterPassword() {
		
		return "redirect:/password";
	}
	
	

}
