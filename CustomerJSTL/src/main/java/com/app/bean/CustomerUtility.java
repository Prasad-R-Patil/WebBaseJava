package com.app.bean;

import java.util.ArrayList;
import java.util.List;

public class CustomerUtility {
	
	public static List<Customer> getCustomer()
	{
		List<Customer> l = new ArrayList<Customer>();
		
		l.add(new Customer("Prasad","Patil","prasad@gmail.com",true));
		l.add(new Customer("Sagar","mali","sagar@gmail.com",true));
		l.add(new Customer("tejas","jadhav","tejas@gmail.com",false));
		l.add(new Customer("viki","kambli","viki@gmail.com",false));
		l.add(new Customer("zakan","zulya","zaknzuly@gmail.com",false));
		
		
		return l;
		
	}

}
