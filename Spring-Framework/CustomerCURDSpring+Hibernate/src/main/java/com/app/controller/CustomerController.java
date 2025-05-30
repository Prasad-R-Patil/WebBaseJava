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
	
	//need to inject our Customer Service
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("list")
	public String listCustomer(Model theModel)
	{
		
		List<Customer> theCustomer= customerService.getCustomer();
		//add the Customer to the model
		theModel.addAttribute("Customer",theCustomer);
		
		return "list-customer";
	}
	
	@GetMapping("/ShowFormForAdd")
	public String ShowFormForAdd(Model theModel)
	{
		//create module Attribute to bind form data
		Customer theCustomer=new Customer();
		
		theModel.addAttribute("Customer",theCustomer);
		
		return "Customer-Form";
	}
	
	@PostMapping("/SaveCustomer")
	public String saveCustomer(@ModelAttribute("Customer") Customer theCustomer)
	{
		//save the Customer using our Services
		
		customerService.saveCustomer(theCustomer);
		
		return "redirect:/Customer/list";
	}
	
	@GetMapping("/ShowFormForUpdate")
	public String ShowFormForUpdate(@RequestParam("CustomerId") int theId,Model theModel)
	{
		//get the customer form our service
		
		Customer theCustomer = customerService.getCustomer(theId);
		
		//set Customer as  a model attribute to update form
		
		theModel.addAttribute("Customer",theCustomer);
		
		//send over to form
		
		return "Customer-Form";
	}
}
