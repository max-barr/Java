package com.maxbarr.sessioncounter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		} else {
			Integer currentCount = (Integer) session.getAttribute("count");
			session.setAttribute("count", currentCount + 1);
		}
		return "home.jsp";
	}
	
	@GetMapping("/count")
	public String showCount(HttpSession session, Model model) {
		Integer currentCount = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCount);
		return "count.jsp";
	}
	
	@GetMapping("/reset")
	public String resetCount(HttpSession session) {
		session.invalidate();
		return "redirect:/count";
	}

}
