package com.app.validation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/Customer")
public class CustomerController {
	
	@RequestMapping("/ShowForm")
	public String ShowForm(Model model)
	{
		model.addAttribute("customer",new Customer());
		return "customer-form";
	}
	
	@RequestMapping("/ProcessForm")
	public String ProcessForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult theBindingResult)
	{
		if(theBindingResult.hasErrors())
		{
			return "customer-form";
		}
		else 
		{
			return "customer-confirmation";
		}
	}

}
