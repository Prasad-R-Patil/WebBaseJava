package com.app.beans;

import org.springframework.stereotype.Component;

import com.app.utility.FortuneService;
@Component
public class HappyFortuneService implements FortuneService {

	
	public HappyFortuneService()
	{
		System.out.println("In HappyFortuneService Constructor");
	}


	@Override
	public String GetFortune() {
		// TODO Auto-generated method stub
		return "Happy Fortune";
	}


}
