package com.maxbarr.surveyform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
	
//	Home page route
	@GetMapping("/")
	public String form() {
		return "form.jsp"; 
	}
	
//	Results page route
	@GetMapping("/result")
	public String result() {
		return "result.jsp";
	}
	
//	POST route to grab data from form
	@PostMapping(path="/submit")
	public String submitForm() {
		return "redirect:/result";
	}

}
