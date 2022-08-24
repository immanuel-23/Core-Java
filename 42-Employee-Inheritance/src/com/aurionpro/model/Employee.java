package com.aurionpro.model;

public abstract class Employee {
	public int employeeId;
	public String employeeName;
	public double basicsalary;

	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicsalary = salary;
	}

	public int getEmployeeNumber() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double getSalary() {
		return basicsalary;
	}

	public abstract double calculateAnnualCtc();
	public abstract void printSalarySlip();
	
	public static void hii() {
		System.out.println("hii");
	}

}
