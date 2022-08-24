package com.aurionpro.model;

public class Accountant extends Employee {
	private double perks;

	public Accountant(int employeeNumber, String employeeName, double salary) {
		super(employeeNumber, employeeName, salary);
		this.perks=0.5*salary;
	}

	public double getPerks() {
		return perks;
	}
	@Override
	public double calculateAnnualCtc() {
		double ctc=(this.basicsalary+perks)*12;
		return ctc;
		
	}

	@Override
	public void printSalarySlip() {
		System.out.println("Id    :"+this.employeeId);
		System.out.println("Name  :"+this.employeeName);
		System.out.println("Salary:"+this.basicsalary);
		System.out.println("HRA   :"+this.perks);
		System.out.println("CTC   :"+this.calculateAnnualCtc());
	}
	

}
