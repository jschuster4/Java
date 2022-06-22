package com.codingdojo.bookclub.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.bookclub.models.Book;
//import com.codingdojo.bookclub.models.User;

@Repository
public interface BookRepository extends CrudRepository<Book, Long>{
	
	ArrayList<Book> findAll();
	public Book findByTitle(String title);
}
