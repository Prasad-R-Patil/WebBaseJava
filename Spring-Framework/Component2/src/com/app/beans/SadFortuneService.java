package com.app.beans;

import org.springframework.stereotype.Component;

import com.app.utility.FortuneService;
@Component
public class SadFortuneService implements FortuneService {


	public SadFortuneService()
	{
		System.out.println("In SadFortuneService Constructor");
	}
	


	@Override
	public String GetFortune() {
		// TODO Auto-generated method stub
		return "Sad Fortune";
	}

}
