package com.codingdojo.dojosandninjas.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.Ninja;
import com.codingdojo.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	@Autowired
	private NinjaRepository ninjaRepository;
	
	public void create(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	
	public Ninja findById(Long id) {
		return ninjaRepository.findById(id).orElse(null);
	}
	
	public ArrayList<Ninja> findAll(){
		return ninjaRepository.findAll();
	}
	
	public void update(Ninja ninja) {
		ninjaRepository.save(ninja);
	}
	
	public void delete(Long id) {
		ninjaRepository.deleteById(id);
	}
}
