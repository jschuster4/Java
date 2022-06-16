package com.codingdojo.savetravels.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="expenses")
public class Expense {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="name is required")
	@Size(min=2, max=255, message="name must be between 2 and 255 characters")
	private String name;
	
	@NotNull(message="vendor is required")
	@Size(min=2, max=255, message="vendor must be between 2 and 255 characters")
	private String vendor;
	
	@Min(value=1, message="The expense item needs to be at least $1")
	@Max(value=20000, message="The expense needs to be less than $20K")
	private double amount;
	
	@NotNull(message="description is required")
	@Size(min=2, max=255, message="description must be between 2 and 255 characters")
	private String description;
	
	public Expense() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
