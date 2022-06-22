package com.codingdojo.bookclub.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.bookclub.models.Book;
import com.codingdojo.bookclub.services.BookService;
import com.codingdojo.bookclub.services.UserService;

@Controller
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@Autowired 
	private UserService userService;
	
	public BookController() {};
	

    
    @GetMapping("/new")
    public String showAddBook(Model model, HttpSession session ) {
    	if(session.getAttribute("user")==null) {
			return "redirect:/user";
		}
    	model.addAttribute("bookRegister", new Book());
    	return "addBook";
    }
    
    @PostMapping("/new")
    public String addBook(@Valid @ModelAttribute("bookRegister") Book book, BindingResult res, Model model,  HttpSession session) {
    	if(res.hasErrors()) {
    		model.addAttribute("book", new Book());
    		return "addBook";
    	}
//    	book.setUser((User) session.getAttribute("user"));
    	bookService.create(book);
    	return "redirect:/user/dashboard";
    }
    
    @GetMapping("/{id}")
    public String showOneBook(@PathVariable("id") Long id, Model model, HttpSession session) {
    	if(session.getAttribute("user")==null) {
			return "redirect:/user";
		}
    	Book dbBook = bookService.findById(id);
    	model.addAttribute("book", dbBook);
    	return "showBook";
    }
    
    @GetMapping("/{id}/edit")
    public String editBook(@PathVariable("id") Long id, Model model, HttpSession session) {
    	if(session.getAttribute("user")==null) {
			return "redirect:/user";
		}
    	Book dbBook = bookService.findById(id);
    	model.addAttribute("bookUpdate", dbBook);
    	return "editBook";
    }
    
    @PostMapping("/{id}/edit")
    public String updateBook(@PathVariable("id") Long id, @Valid @ModelAttribute("bookUpdate") Book book , BindingResult res, Model model, HttpSession session) {
    	if(res.hasErrors()) {
//    		******THIs will delete the error messages**********
//    		Book dbBook = bookService.findById(id);
//        	model.addAttribute("bookUpdate", dbBook);
        	return "editBook";
    	}
    	bookService.update(book);
    	return "redirect:/user/dashboard";
    }
    
    @DeleteMapping("/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
    	bookService.delete(id);
    	return "redirect:/user/dashboard";
    }


	
//	@GetMapping("")
//	public String showBooks(Model model, HttpSession session) {
//		if(session.getAttribute("user")==null) {
//			return "redirect:/user";
//		}
//		model.addAttribute("book", bookService.findAllBooks());
//		return "dashboard";
//	}
	
//    @DeleteMapping("/{id}")
//    public String destroy(@PathVariable("id") Long id) {
//        bookService.delete(id);
//        return "redirect:/user/dashboard";
//    }
	
}
