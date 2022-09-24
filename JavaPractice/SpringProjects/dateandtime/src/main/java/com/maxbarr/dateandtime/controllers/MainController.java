package com.maxbarr.dateandtime.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String home(Model model) {
		return "home.jsp";
	}
	
	@GetMapping("/date")
	public String date(Model model) {
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		return "time.jsp";
	}

}
