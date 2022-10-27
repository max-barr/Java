package com.maxbarr.surveyform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String submitForm(HttpSession session, @RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="sport") String sport, @RequestParam(value="comment") String comment) {
//		Store submissions in session
		session.setAttribute("name", name);
		session.setAttribute("location", location);
		session.setAttribute("sport", sport);
		session.setAttribute("comment", comment);
		return "redirect:/result";
	}

}
