package com.app;

import java.io.File;
import java.io.IOException;

import com.app.bean.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Student student = objectMapper.readValue(new File("Data/Sample.json"), Student.class);
		
		System.out.println("First_Name => "+student.getFirstName());
		System.out.println("Last_Name => "+student.getLastName());
		System.out.println("Active => "+student.isActive());
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
