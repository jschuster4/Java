package com.codingdojo.savetravels.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.savetravels.models.Expense;
import com.codingdojo.savetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	
	@Autowired
	private ExpenseRepository expenseRepository;
	
	public ArrayList<Expense> findAll(){
		return (ArrayList<Expense>) expenseRepository.findAll();
	}
	
	public Expense findOne(Long id) {
		Optional<Expense> expense = expenseRepository.findById(id);
		return expense.isPresent()?expense.get():null;
	}
	
	public void create(Expense expense) {
		expenseRepository.save(expense);
	}
	
	public void update(Expense expense) {
		expenseRepository.save(expense);
	}
	
	public void deleteOne(Long id) {
		expenseRepository.deleteById(id);
	}
//	public ExpenseService(ExpenseRepository expenseRepository) {
//		this.expenseRepository = expenseRepository;
//	}
}
