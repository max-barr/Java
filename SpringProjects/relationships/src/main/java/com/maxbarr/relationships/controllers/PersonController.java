package com.maxbarr.relationships.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maxbarr.relationships.models.Person;
import com.maxbarr.relationships.services.PersonService;

@Controller
public class PersonController {
	private final PersonService personService;

	
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@RequestMapping("/persons/new")
	public String index(Model model, @ModelAttribute("person") Person person) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		return "relationships/person.jsp";
	}
	
	@RequestMapping(value="/persons/new", method=RequestMethod.POST)
	public String create(@ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "relationships/person.jsp";
		} else {
			personService.createPerson(person);
			return "redirect:/licenses/new";
		}
	}
	
	@RequestMapping(value="/persons/{id}")
	public String show(Model model, @PathVariable("id") Long id) {
		Person person = personService.findPerson(id);
		model.addAttribute("person", person);
		return "/relationships/profile.jsp";
	}
	
}
