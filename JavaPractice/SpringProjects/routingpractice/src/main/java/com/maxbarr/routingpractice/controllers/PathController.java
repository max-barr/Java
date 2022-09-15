package com.maxbarr.routingpractice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")
public class PathController {
	
	@GetMapping(value="")
	public String dojo() {
		return "Welcome to the dojo.";
	}
	
	@GetMapping(value="/{name}")
	public String dojoName(@PathVariable("name") String dojoName) {
		return "Welcome to the " + dojoName + " dojo.";
	}
	
	@GetMapping(value="/{name}/{location}")
	public String dojoLocation(@PathVariable("name") String dojoName, @PathVariable("location") String dojoLocation) {
		return "Welcome to the " + dojoName + " dojo. We are located in beautiful " + dojoLocation;
	}

}
