package com.codingdojo.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.services.DojoService;

@Controller
@RequestMapping("/dojo")
public class DojoController {

	@Autowired
	private DojoService dojoService;
	
	
//	@PostMapping("")
	
	@GetMapping("/{id}")
	public String findDojoById(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.findById(id));
		return "ninjasInDojo";
	}
	
	@GetMapping("/new")
	public String addDojo(Model model) {
		model.addAttribute("dojo", new Dojo());
		return "newDojo";
	}
	
	@PostMapping("/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult res) {
		if(res.hasErrors()) {
			return "newDojo";
		}
		dojoService.create(dojo);
		return "redirect:/dojo/new";
	}
	
	
	
}
