package com.maxbarr.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.maxbarr.relationships.models.Dojo;
import com.maxbarr.relationships.models.Ninja;
import com.maxbarr.relationships.services.DojoService;
import com.maxbarr.relationships.services.NinjaService;

@Controller
public class NinjaController {

	@Autowired
	private NinjaService ninjaService;
	
	@Autowired
	private DojoService dojoService;
	
	@RequestMapping("ninjas/new")
	public String index(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "relationships/ninja.jsp";
	}
	
	@PostMapping("ninjas/new")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "relationships/ninja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/dojos/new";
		}
	}
}
