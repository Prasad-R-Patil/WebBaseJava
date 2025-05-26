package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.utility.Coach;
import com.app.utility.FortuneService;
@Component	
public class TeniseCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public TeniseCoach() 
	{ 
		System.out.println("In Tenise Constructor");
	}
	
	
	@Autowired
	public TeniseCoach(@Qualifier("happyFortuneService")FortuneService fortuneService) {
		super();
		System.out.println("In Tenise param Constructor");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkOut() {
		
		return "Run 5 km";
	}

	@Override
	public String GetFortuneService() {

		return fortuneService.GetFortune();
	}
}
