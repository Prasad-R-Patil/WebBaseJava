package com.app;

public class Human {
	
	private Heart heart;
	
	public Human()
	{
		System.out.println("In Constructor...");
	}
	
	public Human(Heart heart)
	{
		this.heart = heart;
	}
	
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
