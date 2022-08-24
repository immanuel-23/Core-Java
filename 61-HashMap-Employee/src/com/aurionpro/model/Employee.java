package com.aurionpro.model;

public class Employee {
	private String name;
	
	public Employee(String name) {
		super();
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Employee [ name=" + name + "]";
	}
	
	
}
