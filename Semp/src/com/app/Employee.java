package com.app;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	private Date date;
	
	public Employee() {}

	public Employee(int id, String name, float salary, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + " Rs , date=" + date + "]";
	}
	
	

}
