package com.aurionpro.test;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import com.aurionpro.model.Employee;

public class EmployeeTest {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "ABC", 8500));
		employees.add(new Employee(2, "DEF", 49000));
		employees.add(new Employee(3, "GHI", 17000));
		employees.add(new Employee(4, "JKL", 15000));
		
		Collections.sort(employees);
		for(Employee e:employees)
			System.out.println(e);
		
			
	}
	
	
	
	
}