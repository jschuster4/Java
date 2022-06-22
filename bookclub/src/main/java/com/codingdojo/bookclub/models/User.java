package com.codingdojo.bookclub.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="You must include a username")
	@Size(min=3, max=30, message="User name must be between 3 and 30 characters")
	private String name;
	
	@NotEmpty(message="Email field must not be left blank")
	@Email(message="Invalid Email, must match this formatting: example@example.com")
	private String email;
	
	@NotEmpty(message="you must enter an Email")
	@Size(min=8, max=128, message="password must be between 8 and 128 characters long")
	private String password;
	
	@Transient
	@NotEmpty(message="Confirm password field must be filled out")
	@Size(min=8, max=128, message="password must be between 8 and 128 characters long")
	private String confirm;
	
	@OneToMany(mappedBy="user", fetch = FetchType.LAZY)
	private List<Book> books;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirmPassword) {
		this.confirm = confirmPassword;
	}

	public User() {
		
	}
	
	
	
}


