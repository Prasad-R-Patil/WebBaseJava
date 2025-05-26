package com.app.model;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private Map<String,String> countryOption;
	private String favoriteLanguage;
	private String[] operatingSystem;
	
	public Student()
	{
		countryOption = new HashMap<String, String>();
		
		countryOption.put("IN", "India");
		countryOption.put("DE", "Germany");
		countryOption.put("BR", "Brazil");
		countryOption.put("FR", "France");
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryOption() {
		return countryOption;
	}

	public void setCountryOption(Map<String, String> countryOption) {
		this.countryOption = countryOption;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String[] operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	
	

}
