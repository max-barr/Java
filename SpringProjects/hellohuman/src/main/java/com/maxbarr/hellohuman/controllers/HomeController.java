package com.maxbarr.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping("/")
	public String index(@RequestParam(value="name", defaultValue = "human") String firstName, @RequestParam(value="lastName", defaultValue="") String lastName) {
		return "Hello " + firstName + " " + lastName;
	}
}

