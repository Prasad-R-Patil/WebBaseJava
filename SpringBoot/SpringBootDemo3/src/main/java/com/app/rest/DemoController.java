package com.app.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/")
	public String  getDateTime()
	{
		
		return "Today DateTime is = "+LocalDateTime.now();
	}
	
	@GetMapping("/hello/{id}")
	public String sayHello(@PathVariable int id)
	{
		return "My ID Is---->>> "+id;
	}

	

}
