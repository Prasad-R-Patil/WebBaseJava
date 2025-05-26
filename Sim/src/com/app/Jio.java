package com.app;

public class Jio implements Sim {
	
	public Jio()
	{
		System.out.println("Vodafone Constructor calling");
	}

	@Override
	public void Calling() {
		
		System.out.println("Calling Using jio Sim");
	}

	@Override
	public void Data() {
		
		System.out.println("Browsing Data Using jio Sim");
	}

}
