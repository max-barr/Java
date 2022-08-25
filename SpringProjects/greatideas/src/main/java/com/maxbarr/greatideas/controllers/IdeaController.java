package com.maxbarr.greatideas.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.maxbarr.greatideas.models.Idea;
import com.maxbarr.greatideas.models.User;
import com.maxbarr.greatideas.services.IdeaService;
import com.maxbarr.greatideas.services.UserService;

@Controller
public class IdeaController {

	@Autowired
	private IdeaService ideaService;
	
	@Autowired
	private UserService userService;
	
//	Get request for ideas dash board
	
	@GetMapping("/ideas")
	public String showIdeas(@ModelAttribute("idea") Idea idea, Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/home";
		}
		List<Idea> ideas = ideaService.allIdeas();
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findById(userId);
		model.addAttribute("user", u);
		model.addAttribute("ideas", ideas);
		return "ideas.jsp";
	}
	
//	Get request for new idea page
	
	@GetMapping("ideas/new")
	public String newIdea(@ModelAttribute("idea") Idea idea, Model model) {
		List<Idea> ideas = ideaService.allIdeas();
		model.addAttribute("ideas", ideas);
		return "newIdea.jsp";
	}
	
//	Post request for creating new idea
	
	@PostMapping("ideas/add")
	public String createIdea(@Valid @ModelAttribute("idea") Idea idea, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "newIdea.jsp";
		} else {
			Long userId = (Long) session.getAttribute("userId");
			User u = userService.findById(userId);
			idea.setUser(u);
			ideaService.createIdea(idea);
			return "redirect:/ideas";
		}
	}
	
//	Get request for viewing idea page
	
	@GetMapping("/ideas/{ideaId}")
	public String viewIdea(Model model, @PathVariable("ideaId") Long ideaId, HttpSession session) {
		Idea idea = ideaService.findIdea(ideaId);
		model.addAttribute("idea", idea);
		
		return "viewIdea.jsp";
	}
	
//	Get request for edit idea page
	
	@GetMapping("/ideas/{ideaId}/edit")
	public String editIdea(Model model, @PathVariable("ideaId") Long ideaId) {
		Idea idea = ideaService.findIdea(ideaId);
		model.addAttribute("idea", idea);
		
		return "editIdea.jsp";
	}
	
//	PUT request for updating an idea
	
	@PutMapping("/ideas/update")
	public String updateIdea(@Valid @ModelAttribute("idea") Idea idea, BindingResult result) {
		if (result.hasErrors()) {
			return "editIdea.jsp";
		} else {
			ideaService.saveIdea(idea);
			return "redirect:/ideas";
		}
	}
	
//	Delete route for deleting ideas
	
	@GetMapping("/ideas/{ideaId}/delete")
	public String destroy(@PathVariable("ideaId") Long ideaId) {
		ideaService.delete(ideaId);
		return "redirect:/ideas";
	}
}
