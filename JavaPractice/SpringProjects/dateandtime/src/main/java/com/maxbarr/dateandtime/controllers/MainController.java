package com.maxbarr.dateandtime.controllers;

import java.util.Date;
import java.text.SimpleDateFormat;

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
		Date rawDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, yyyy");
		String myFormattedDate = formatter.format(rawDate);
		model.addAttribute("date", myFormattedDate);
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		Date rawTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
		String myFormattedTime = formatter.format(rawTime);
		model.addAttribute("time", myFormattedTime);
		return "time.jsp";
	}

}
