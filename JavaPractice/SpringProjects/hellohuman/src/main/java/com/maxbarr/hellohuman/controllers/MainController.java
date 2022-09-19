package com.maxbarr.hellohuman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping(value="/")
	public String showName(@RequestParam(value="firstName", defaultValue="human") String firstName, @RequestParam(value="lastName", defaultValue="") String lastName) {
		return ("Hello, " + firstName + " " + lastName);
	}
	
}
