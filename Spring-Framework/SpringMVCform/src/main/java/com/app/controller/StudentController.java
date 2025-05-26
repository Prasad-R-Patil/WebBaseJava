package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.model.Student;

@Controller
@RequestMapping("/Student")
public class StudentController {
	
	@RequestMapping("/ShowForm")
	public String ShowForm(Model model)
		{
			Student s = new Student();
			model.addAttribute("theStudent",s);
			return "Student-Form";
		}
	
	@RequestMapping("/StudentConfirm")
	public String StudentConfirm(@ModelAttribute("theStudent") Student stud)
	{
		return "Student-Confirmation";
	}
	

}
