package com.codingdojo.bookclub.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.codingdojo.bookclub.models.Book;
import com.codingdojo.bookclub.repositories.BookRepository;

@Service
public class BookService {

		@Autowired 
		private BookRepository bookRepository;
		
		public ArrayList<Book> findAllBooks(){
			return bookRepository.findAll();
		}
		
		public void create(Book book) {
			bookRepository.save(book);
		}
		
		public Book findById(Long id) {
			return bookRepository.findById(id).orElse(null);
		}
		
		public void update(Book book) {
			bookRepository.save(book);
		}
		
		public void delete(Long id) {
			bookRepository.deleteById(id);
		}
}
