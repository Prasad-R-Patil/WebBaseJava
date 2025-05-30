package com.app.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.app.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomer();
	public Customer getCustomerById( int id);
	public void saveCustomer( Customer theCustomer);
	public Customer updateCustomer( Customer theCustomer);
	public void deleteCustomer( Customer theCustomer);
}
