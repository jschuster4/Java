package com.codingdojo.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class omikujiController
{
	/* flash attribute redirect fix: */
	/* org.springframework.validation.BindingResult.model_name */

	@GetMapping("/")
	public String index(HttpSession session)
	{
		return "index";
	}
	
	@GetMapping("/show")
	public String show(HttpSession session) {
		
		return "show";
	}
	
	@PostMapping("/submit")
	public String process
	(
		@RequestParam("number") int number, 
		@RequestParam("city_name") String city_name,
		@RequestParam("person_name") String person_name,
		@RequestParam("hobby") String hobby,
		@RequestParam("nice") String nice,
		@RequestParam("living_thing") String living_thing,
		HttpSession session
	) {
//		System.out.println(number);
//		System.out.println(city_name);
//		System.out.println(hobby);
//		System.out.println(nice);
		session.setAttribute("number", number);
		session.setAttribute("city_name", city_name);
		session.setAttribute("person_name", person_name);
		session.setAttribute("hobby", hobby);
		session.setAttribute("nice", nice);
		session.setAttribute("living_thing",living_thing);
		return "redirect:/show";
	}
};
