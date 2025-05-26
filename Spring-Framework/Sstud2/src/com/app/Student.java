package com.app;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	@Value("${Student.name}")
	private String name;
	@Value("${Student.name}")
	private String interstedCourse;
	@Value("Coding")
	private String Hobby;
	
	public Student() {}
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setInterstedCourse(String interstedCourse) {
		this.interstedCourse = interstedCourse;
	}


	public void setHobby(String hobby) {
		Hobby = hobby;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", interstedCourse=" + interstedCourse + ", Hobby=" + Hobby + "]";
	}
	
	

}
