package com.codingdojo.fruityloops;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class fruitycontroller {

	@GetMapping("/")
	public String index(Model model) {
		
		ArrayList<Item> items = new ArrayList<Item>();
		items.add((new Item("Kiwi", 1.25)));
		items.add((new Item("Bananas", 2.00)));
		items.add((new Item("Apple", 1.75)));
		items.add((new Item("Cantelope", 4.25)));
		items.add((new Item("Watermelon", 3.85)));

		model.addAttribute("cart", items);
		return "index";
	}
}
