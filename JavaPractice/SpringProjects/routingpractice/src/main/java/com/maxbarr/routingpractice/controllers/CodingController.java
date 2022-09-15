package com.maxbarr.routingpractice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")
public class CodingController {

	@RequestMapping("")
	public String index() {
		return "Routing practice";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Python was fun!";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java is fun too!";
	}
	
	
}
