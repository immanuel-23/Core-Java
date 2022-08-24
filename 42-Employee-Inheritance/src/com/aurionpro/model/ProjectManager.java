package com.aurionpro.model;

public class ProjectManager extends Employee {
	private double hra;
	private double da;
	private double ta;

	public ProjectManager(int employeeNumber, String employeeName, double salary) {
		
		super(employeeNumber, employeeName, salary);
		this.hra=0.3*salary;
		this.da=0.2*salary;
		this.ta=0.1*salary;
		
		
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTa() {
		return ta;
	}
	@Override
	public double calculateAnnualCtc() {
		double ctc=(this.basicsalary+hra+da+ta)*12;
		return ctc;
		
	}
	@Override
	public void printSalarySlip() {
		System.out.println("Id    :"+this.employeeId);
		System.out.println("Name  :"+this.employeeName);
		System.out.println("Salary:"+this.basicsalary);
		System.out.println("HRA   :"+this.hra);
		System.out.println("DA    :"+this.da);
		System.out.println("TA    :"+this.ta);
		System.out.println("CTC   :"+this.calculateAnnualCtc());
	}
	

}
