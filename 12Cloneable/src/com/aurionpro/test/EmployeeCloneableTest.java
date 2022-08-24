package com.aurionpro.test;

import com.aurionpro.model.Employee;

public class EmployeeCloneableTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee(1, "Immanuel");
		Employee e2 = (Employee) e1.clone();
		Employee e3 = (Employee) e2.clone();

		System.out.println("Printing details of e1");
		printDetails(e1);
		System.out.println("Printing details of e2 which is cloneable");
		printDetails(e2);
		System.out.println("Printing details of e3 which is cloneable");
		printDetails(e3);
		

	}

	private static void printDetails(Employee e) {
		System.out.println("*******************************");
		System.out.println("Employe id " + e.id);
		System.out.println("Employe Name " + e.name);
		System.out.println("*******************************");
	}

}
