package com.app.rest;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
	
	@GetMapping("/")
	public String  getDateTime()
	{
		
		return "Today DateTime is = "+LocalDateTime.now();
	}

}
