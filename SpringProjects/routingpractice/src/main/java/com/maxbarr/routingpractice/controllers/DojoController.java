package com.maxbarr.routingpractice.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo")
	public String dojo() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("dojo/{id}")
	public String dojoLocation(@PathVariable("id") String id) {
		switch(id) {
		case "burbank":
			return "Burbank Dojo is located in Southern California.";
		case "san-jose":
			return "SJ Dojo is the headquarters.";
		default:
			return "Location required.";
		}
	}
}
