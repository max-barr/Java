package com.maxbarr.controllerspractice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String hello() {
		return "Hello Controller! How are you?";
	}
	
	@RequestMapping("/goodbye")
	public String goodbye() {
		return "Goodbye. It's been fun.";
	}

}
