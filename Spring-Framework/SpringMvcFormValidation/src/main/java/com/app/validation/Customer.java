package com.app.validation;

import org.springframework.lang.NonNull;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
	@NotNull
	@Size(min=1,message="atlist 1 Ccharacter Required")
	private String firstName;
	
	
	@NotNull
	@Size(min=1,message="atlist 1 Character Required")
	private String lastName;


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
