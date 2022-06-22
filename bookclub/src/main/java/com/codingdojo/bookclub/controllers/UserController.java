package com.codingdojo.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.bookclub.models.TempUser;
import com.codingdojo.bookclub.models.User;
import com.codingdojo.bookclub.services.BookService;
import com.codingdojo.bookclub.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController
{
	/* flash attribute redirect fix: */
	/* org.springframework.validation.BindingResult.model_name */
	@Autowired
	private BookService bookService;
	
	@Autowired
	private UserService userService;

	@GetMapping("")
	public String loginandregister( Model model){
		
		model.addAttribute("userRegister", new User());
		model.addAttribute("userLogin", new TempUser());
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("userRegister") User user, BindingResult res, Model model) {
		if(res.hasErrors()) {
			model.addAttribute("userLogin", new TempUser());
			return "index";
		}
		User dbUser= userService.register(user, res);
		if(dbUser == null) {
			model.addAttribute("userLogin", new TempUser());
			return "index";
		}
		
		return "redirect:/user";
	}
	
	@GetMapping("/dashboard")
	public String showDashboard(Model model, HttpSession session) {
		
		if(session.getAttribute("user")==null) {
			return "redirect:/user";
		}
		model.addAttribute("book", bookService.findAllBooks());
		return "dashboard";
	}
	
	
	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("userLogin") TempUser tempUser, BindingResult res, Model model, HttpSession session) {
	
		if(res.hasErrors()) {
			model.addAttribute("userRegister", new User());
			return "index";
		}
		User user=userService.login(tempUser, res);
		if(user==null) {
			model.addAttribute("userRegister", new User());
			return "index";
		}
		session.setAttribute("user", user);
		return"redirect:/user/dashboard";
	}
	
	@GetMapping("/logout")
		public String logout(HttpSession session) {
			
			userService.logout(session);
			return "redirect:/user";
	}
	
		
	
};
