package com.maxbarr.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date rawDate = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, yyyy");
		String myFormattedDate = formatter.format(rawDate);
		model.addAttribute("date", myFormattedDate);
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date rawTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
		String myFormattedTime = formatter.format(rawTime);
		model.addAttribute("time", myFormattedTime);
		return "time.jsp";
	}
}
