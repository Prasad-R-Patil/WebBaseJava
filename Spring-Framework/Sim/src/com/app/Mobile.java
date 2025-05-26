package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	
	public static void main(String[] args) {
		
		
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("Beans.xml");
		
		Sim sim = contex.getBean(Sim.class,"Sim");
		sim.Calling();
		sim.Data();
		
		
	}

}
