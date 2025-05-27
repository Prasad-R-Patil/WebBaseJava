package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Customer;
import com.app.service.CustomerService;


@Controller
@RequestMapping("/Customer")
public class CustomerController {
	
	// need to inject our customer service
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String listCustomer(Model theModel)
	{
		List<Customer> theCustomer = customerService.getCustomer();
		
		//Add the customer to the model
		theModel.addAttribute("Customer", theCustomer);
		
		return "list-customer";
	}
	
	
	@GetMapping("/ShowFormForAdd")
	public String ShowFormForAdd(Model theModel)
	{
		// Create module Attribute to bind from data
		
		Customer theCustomer = new Customer();
		
		theModel.addAttribute("Customer", theCustomer);
		
		return "Customer-Form";
		
				
	}
	
	@PostMapping("/SaveCustomer")
	public String saveCustomer(@ModelAttribute("Customer") Customer theCustomer)
	{
		// Save the customer using our services
		
		customerService.saveCustomer(theCustomer);
		return "redirect:/Customer/list";
	}
	
	@GetMapping("/ShowFormForUpdate")
	public String ShowFormForUpdate(@RequestParam("CustomerId") int theId, Model theModel)
	{
		// Get The Customer form using our services
		Customer theCustomer = customerService.getCustomer(theId);
		//set Customer as a model attribute to update from
		
		theModel.addAttribute("Customer",theCustomer);
		
		//send Over to form
		return"Customer-Form";
	}
	

}
