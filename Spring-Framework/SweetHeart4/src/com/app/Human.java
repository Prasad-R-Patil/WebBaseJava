package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	
	@Autowired
	private Heart heart;
	
	
	public Human()
	{
		System.out.println("In Constructor...");
	}
	
	//@Autowired
	public Human(Heart heart)
	{
		this.heart = heart;
	}
	
	//@Autowired
	public void setHeart(Heart heart) {
		System.out.println("In Setter...");
		this.heart = heart;
	}
	
	public void pump()
	{
		if(heart != null)
		{
			heart.Pumping();
		}
		else
		{
			System.out.println("You are Dead...");
		}
	}

}
