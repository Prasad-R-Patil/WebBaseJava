package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.utility.Coach;
import com.app.utility.FortuneService;
@Component
public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public CricketCoach() 
	{ 
		System.out.println("In Cricket Constructor");
	}
	
	
	@Autowired
	public CricketCoach(@Qualifier("sadFortuneService")FortuneService fortuneService) {
		super();
		System.out.println("In Cricket param Constructor");
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkOut() {
		
		return "Practise Balling";
	}

	@Override
	public String GetFortuneService() {

		return fortuneService.GetFortune();
	}

}
