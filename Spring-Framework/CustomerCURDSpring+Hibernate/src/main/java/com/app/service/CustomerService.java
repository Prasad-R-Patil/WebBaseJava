package com.app.service;

import java.util.List;

import com.app.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomer();
	
	public void saveCustomer(Customer theCustomer);
	
	public Customer getCustomer(int theID);
}
