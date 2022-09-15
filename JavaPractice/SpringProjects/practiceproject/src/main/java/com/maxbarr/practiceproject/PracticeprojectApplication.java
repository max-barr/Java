package com.maxbarr.practiceproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PracticeprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeprojectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hello there! How are you doing?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is fun and easy to use.";
	}

}
