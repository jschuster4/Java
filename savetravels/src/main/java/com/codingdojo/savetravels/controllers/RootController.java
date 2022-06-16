package com.codingdojo.savetravels.controllers;

import javax.validation.Valid;
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.services.ExpenseService;

@Controller
@RequestMapping("/expense")
public class RootController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("")
	public String index(Model model) {
		model.addAttribute("expense", new Expense());
		model.addAttribute("expenses", expenseService.findAll());
		return "index";
	}
	
	@PostMapping("")
	public String createExpense(@Valid @ModelAttribute("") Expense expense, BindingResult res) {
		
		if (res.hasErrors()) {
			return "index";
		}
		expenseService.create(expense);
		return "redirect:/expense";
	}
		
	@GetMapping("/show/{id}")
	public String show() {
		return "show";
	}
	
	@GetMapping("/edit/{id}")
	public String edit() {
		return "edit";
	}
	
	@GetMapping("/delete/{id}")
	public String delete() {
		return "redirect:/expense";
	}
}
