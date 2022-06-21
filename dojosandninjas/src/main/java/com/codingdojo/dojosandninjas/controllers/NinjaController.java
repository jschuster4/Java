package com.codingdojo.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosandninjas.models.Dojo;
import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.services.DojoService;
import com.codingdojo.dojosandninjas.services.NinjaService;

@Controller
@RequestMapping("/ninja")
public class NinjaController {

	
	@Autowired 
	private NinjaService ninjaService;
	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/new")
	public String createNinja(Model model) {
		model.addAttribute("ninja", new Ninja());
		model.addAttribute("dojo", dojoService.findAll());
		return "newNinja";
	}
	
	@PostMapping("/new")
	public String addNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult res, Model model) {
		if(res.hasErrors()) {
			model.addAttribute("dojo", dojoService.findAll());
			return "newNinja";
		}
		ninjaService.create(ninja);
		return "redirect:/dojo/new";
	}
	
}
	
	

