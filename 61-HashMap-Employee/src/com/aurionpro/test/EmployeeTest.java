package com.aurionpro.test;

import java.util.HashMap;

import com.aurionpro.model.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		HashMap<Integer, Employee> empName = new HashMap<Integer, Employee>();
		
		empName.put(1, new Employee("Raj"));
		empName.put(2, new Employee("rahul"));
		empName.put(3, new Employee("ajay"));
		System.out.println(empName.toString());

	}

}
