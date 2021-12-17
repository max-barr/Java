package com.maxbarr.events.controllers;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.maxbarr.events.models.Event;
import com.maxbarr.events.models.User;
import com.maxbarr.events.services.EventService;
import com.maxbarr.events.services.UserService;
import com.maxbarr.events.validator.UserValidator;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private EventService eventService;
	
	@Autowired
	private UserValidator userValidator;
	
//	Get request for Home page
	
	@GetMapping("/home")
	public String index(@ModelAttribute("user") User user) {
		return "home.jsp";
	}
	
//	Post request for Registration
	
	@PostMapping("/registration")
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
//		If the result has errors, return the registration page 
//		Else, save the user in the database, save their user id in session, and redirect them to the home route
				
		userValidator.validate(user, result);
				
		if (result.hasErrors()) {
			return "home.jsp";
		} else {
			User u = userService.registerUser(user);
			session.setAttribute("userId", u.getId());
			return "redirect:/events";
		}
	}
	
//	Post request for Login
	
	@PostMapping("/login")
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
		boolean isAuthenticated = userService.authenticateUser(email, password);
		if (isAuthenticated) {
			User u = userService.findByEmail(email);
			session.setAttribute("userId", u.getId());
			return "redirect:/events";
		} else {
			model.addAttribute("user", new User());
			model.addAttribute("error", "Invalid credentials. Please try again.");
			return "home.jsp";
		}
	}
	
//	Get request for events page
	
	@GetMapping("/events")
	public String showEvents(@ModelAttribute("event") Event event, Model model, HttpSession session) {
		if (session.getAttribute("userId") == null) {
			return "redirect:/home";
		}
		List<Event> events = eventService.allEvents();
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findById(userId);
		model.addAttribute("user", u);
		model.addAttribute("events", events);
		return "events.jsp";
	}
	
//	Post request for events
	
	@PostMapping("/events/new")
	public String create(@Valid @ModelAttribute("event") Event event, BindingResult result, HttpSession session) {
		if (result.hasErrors()) {
			return "events.jsp";
		} else {
			Long userId = (Long) session.getAttribute("userId");
			User u = userService.findById(userId);
			event.setUser(u);
			eventService.createEvent(event);
			return "redirect:/events";
		}
	}
	
//	Get request for a user joining an event
	
	@GetMapping("/events/join/{eventId}")
	public String joinEvent(@PathVariable("eventId") Long eventId, HttpSession session) {
		
//		Retrieving user logged into session
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findById(userId);
		
//		Retrieving event user will join
		Event event = eventService.findEvent(eventId);
		
//		Adding user to event
		
		List<User> users = event.getUsers();
		users.add(u);
		
//		Adding event to list of events user is attending
		
//		List<Event> events = u.getAttendingEvents();
//		events.add(event);
		
		eventService.saveEvent(event);
		
		return "redirect:/events";
	}
	
//	Get request for view event page
	
	@GetMapping("/events/{eventId}")
	public String viewEvent(Model model, @PathVariable("eventId") Long eventId, HttpSession session) {
		Event event = eventService.findEvent(eventId);
		model.addAttribute("event", event);
		
		model.addAttribute("users", event.getUsers());
		
		return "viewEvent.jsp";
	}
	
//	Get request for edit event page
	
	@GetMapping("/events/{eventId}/edit")
	public String editEvent(@PathVariable("eventId") Long eventId, Model model) {
		Event event = eventService.findEvent(eventId);
		model.addAttribute("event", event);
		return "editEvent.jsp";
	}
	
//	PUT request for updating event
	
	@PutMapping("/events/update")
	public String updateEvent(@Valid @ModelAttribute("event") Event event, BindingResult result) {
		if (result.hasErrors()) {
			return "editEvent.jsp";
		} else {
			eventService.updateEvent(event);
			return "redirect:/events";
		}
	}
	
//	Delete route for deleting events
	
	@GetMapping(value="/events/{eventId}/delete")
	public String destroy(@PathVariable("eventId") Long eventId) {
		eventService.delete(eventId);
		return "redirect:/events";
	}
	
//	Get request Logout 
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/home";
	}
}
