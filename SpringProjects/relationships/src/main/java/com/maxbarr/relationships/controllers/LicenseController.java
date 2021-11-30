package com.maxbarr.relationships.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.maxbarr.relationships.models.License;
import com.maxbarr.relationships.models.Person;
import com.maxbarr.relationships.services.LicenseService;
import com.maxbarr.relationships.services.PersonService;



@Controller
public class LicenseController {
	private final LicenseService licenseService;
	private final PersonService personService;
	
	public LicenseController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	
	@RequestMapping("/licenses/new")
	public String index(Model model, @ModelAttribute("license") License license) {
		List<Person> persons = personService.allPersons();
		model.addAttribute("persons", persons);
		return "relationships/license.jsp";
	}
	
	@RequestMapping(value="/licenses/new", method=RequestMethod.POST)
	public String create(@ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
			return "relationships/license.jsp";
		} else {
			License l = licenseService.createLicense(license);
			return "redirect:/persons/" + l.getId();
		}
	}
}
