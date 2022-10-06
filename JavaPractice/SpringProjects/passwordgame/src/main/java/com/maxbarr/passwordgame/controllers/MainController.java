package com.maxbarr.passwordgame.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	
//	home page route
	@GetMapping("/")
	public String home(@ModelAttribute("error") String error) {
		return "home.jsp";
	}
	
//	Errors
	@GetMapping("/errors")
	public String error(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "That is incorrect!")
		return "redirect:/";
	}
	
//	Password success route
	@GetMapping("/password")
	public String accept() {
		return "dashboard.jsp";
	}
	
//	Post route to grab data from form
	@PostMapping("/login")
	public String enterPassword(@RequestParam(value="password") String password) {
		if (password.equals("code")) {
			System.out.println("That is correct");
			return "redirect:/password";
		} else {
			return "redirect:/error";
		}
	}
	
	

}
