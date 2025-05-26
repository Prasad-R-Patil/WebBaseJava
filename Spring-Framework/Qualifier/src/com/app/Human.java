package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	//@Autowired
	//@Qualifier("octopusHeart")
	Heart heart;
	
	public Human()
	{
		System.out.println("In Constructor Human");
	}
	/*
	@Autowired
	public Human(@Qualifier("humanHeart")Heart heart )
	{	super();
		System.out.println("In Param Const Human");
		this.heart=heart;
	}
	*/
	
	@Autowired
	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void pump()
	{
		if(heart != null)
		{
			heart.Pumping();
			System.err.println("NameOfAnimal => "+heart.getNameofAnimal() +"  <->  No of Heart => "+heart.getNoOfHeart());
		}
		else
		{
			System.out.println("Your Heart Is Not Pumping....");
			System.out.println("You are Dead...");
		}
		
	}



}
