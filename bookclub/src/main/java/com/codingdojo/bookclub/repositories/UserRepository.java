package com.codingdojo.bookclub.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.bookclub.models.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Long>{
	
	public ArrayList<User> findAll();
	public User findByName(String username);
	public User findByEmail(String email);
}
