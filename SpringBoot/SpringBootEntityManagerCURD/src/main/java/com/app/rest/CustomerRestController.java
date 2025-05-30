package com.app.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Customer;
import com.app.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@Autowired
	private CustomerService customerService;
	
	public CustomerRestController() {}

	public CustomerRestController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/customer")
	public List<Customer> getCustomer()
	{
		return customerService.getCustomer();
	}
	
	@GetMapping("customers/{id}")
	public Customer getCustomerById(@PathVariable int id) throws Exception
	{
		Customer customer = customerService.getCustomerById(id);
		
		if(customer == null)
		{
			throw new Exception("Customer Not Found"+id);
		}
		else
		{
			return customer;
		}
	}
	
	@PostMapping("/customers")
	public void saveCustomer(@RequestBody Customer theCustomer)
	{
		customerService.saveCustomer(theCustomer);
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer theCustomer)
	{
		customerService.updateCustomer(theCustomer);
		return theCustomer;
	}
	
	@DeleteMapping("customers/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		Customer c = customerService.getCustomerById(id);
		
		if(c == null)
		{
			return "Customer Not Found"+id;
		}
		
		customerService.deleteCustomer(c);
		
		return "Customer Deleted"+id;
	}
	
	

}
