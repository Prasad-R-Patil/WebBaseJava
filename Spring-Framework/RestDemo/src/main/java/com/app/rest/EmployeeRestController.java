package com.app.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.bean.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	
	List<Employee> list = new ArrayList<Employee>();
	
	public EmployeeRestController()
	{
		
		list.add(new Employee(1, "Prasad", "Prasad.Patil@gmail.com"));
		list.add(new Employee(2, "Ananya", "Ananya.S@gmail.com"));
		list.add(new Employee(3, "Diya", "Diya.K@gmail.com"));
		list.add(new Employee(4, "Siya", "Siya.D@gmail.com"));
		list.add(new Employee(5, "Pooja", "Pooja.P@gmail.com"));
		list.add(new Employee(6, "Miya", "Miya.G@gmail.com"));
		list.add(new Employee(7, "Rhea", "Rhea.M@gmail.com"));
		list.add(new Employee(8, "Zara", "Zara.L@gmail.com"));
		list.add(new Employee(9, "Kiara", "Kiara.B@gmail.com"));
		list.add(new Employee(10, "Disha", "Disha.R@gmail.com"));
		list.add(new Employee(11, "Sana", "Sana.V@gmail.com"));
		list.add(new Employee(12, "Tia", "Tia.J@gmail.com"));
		list.add(new Employee(13, "Riya", "Riya.A@gmail.com"));
		list.add(new Employee(14, "Kriti", "Kriti.C@gmail.com"));
		list.add(new Employee(15, "Aditi", "Aditi.F@gmail.com"));
		list.add(new Employee(16, "Meera", "Meera.S@gmail.com"));
		list.add(new Employee(17, "Aisha", "Aisha.R@gmail.com"));
		list.add(new Employee(18, "Simran", "Simran.K@gmail.com"));
		list.add(new Employee(19, "Pari", "Pari.D@gmail.com"));
		list.add(new Employee(20, "Shanaya", "Shanaya.P@gmail.com"));
		list.add(new Employee(21, "Zara", "Zara.G@gmail.com")); // Name reuse, but distinct ID/email
		list.add(new Employee(22, "Nisha", "Nisha.M@gmail.com"));
		list.add(new Employee(23, "Kavya", "Kavya.L@gmail.com"));
		list.add(new Employee(24, "Jhanvi", "Jhanvi.B@gmail.com"));
		list.add(new Employee(25, "Avani", "Avani.R@gmail.com"));
		list.add(new Employee(26, "Isha", "Isha.V@gmail.com"));
		list.add(new Employee(27, "Khushi", "Khushi.J@gmail.com"));
		list.add(new Employee(28, "Myra", "Myra.A@gmail.com"));
		list.add(new Employee(29, "Naina", "Naina@gmail.com"));
		list.add(new Employee(30, "Aaradhya", "Aaradhya.T@gmail.com"));
		list.add(new Employee(31, "Ishika", "Ishika.M@gmail.com"));
		list.add(new Employee(32, "Samaira", "Samaira.V@gmail.com"));
		list.add(new Employee(33, "Vaishnavi", "Vaishnavi.K@gmail.com"));
		list.add(new Employee(34, "Anvi", "Anvi.B@gmail.com"));
		list.add(new Employee(35, "Mahika", "Mahika.P@gmail.com"));
		list.add(new Employee(36, "Charvi", "Charvi.S@gmail.com"));
		list.add(new Employee(37, "Navya", "Navya.D@gmail.com"));
		list.add(new Employee(38, "Tanvi", "Tanvi.J@gmail.com"));
		list.add(new Employee(39, "Yashika", "Yashika.L@gmail.com"));
		list.add(new Employee(40, "Ridhima", "Ridhima.A@gmail.com"));
		list.add(new Employee(41, "Suhani", "Suhani.F@gmail.com"));
		list.add(new Employee(42, "Tanya", "Tanya.R@gmail.com"));
		list.add(new Employee(43, "Esha", "Esha.C@gmail.com"));
		list.add(new Employee(44, "Neha", "Neha.G@gmail.com"));
		list.add(new Employee(45, "Mannat", "Mannat.M@gmail.com"));
		list.add(new Employee(46, "Harini", "Harini.V@gmail.com"));
		list.add(new Employee(47, "Bhavya", "Bhavya.N@gmail.com"));
		list.add(new Employee(48, "Shreya", "Shreya.T@gmail.com"));
		list.add(new Employee(49, "Anusha", "Anusha.L@gmail.com"));
		list.add(new Employee(50, "Sanjana", "Sanjana.B@gmail.com"));

	}
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Your belief in yourself can move mountains. Don't underestimate the power of a positive mind and a determined heart.";
	}
	
	@GetMapping("/employees")
	public List<Employee> getEmployees()
	{
		return list;
		
	}
	
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployeeById(@PathVariable("employeeId") int id)
	
	{
		return list.get(id-11);
	}
	
	@GetMapping("/employees/remove/{employeeId}")
	public Employee removeEmployeeById(@PathVariable("employeeId") int id)
	
	{
		return list.remove(id);
	}
	
	@GetMapping("/employees/update/{employeeId}")
	public Employee updateEmployeeById(@PathVariable("employeeId") int id)
	
	{
		return list.remove(id);
	}

}
