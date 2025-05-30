package com.app.dao;

import java.util.List;

import com.app.model.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	
	public Customer getCustomer(int id);
	
	public void saveCustomer(Customer theCustomer);
	
	public void deleteCustomer(int id);

}
