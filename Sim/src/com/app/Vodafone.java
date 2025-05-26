package com.app;

public class Vodafone implements Sim {
	
	public Vodafone()
	{
		System.out.println("Vodafone Constructor calling");
	}

	@Override
	public void Calling() {
		
		System.out.println("Calling Using Vodafone Sim");
	}

	@Override
	public void Data() {
		
		System.out.println("Browsing Data Using Vodafone Sim");
	}

}
