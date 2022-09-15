package com.maxbarr.controllerspractice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery) {
		return "You searched for: " + searchQuery;
	}
	
	@RequestMapping("/goodbye")
	public String goodbye() {
		return "Goodbye. It's been fun.";
	}
	
	@RequestMapping("/users/{name}")
	public String showName(@PathVariable("name") String userName) {
		System.out.println(userName);
		return "The user name is: " + userName;
	}
	
}
