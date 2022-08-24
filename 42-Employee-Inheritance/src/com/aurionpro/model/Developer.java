package com.aurionpro.model;

public class Developer extends Employee{
	private double pa;
	private double ot;
	public Developer(int employeeNumber, String employeeName, double salary) {
		super(employeeNumber, employeeName, salary);
		this.pa=0.3*salary;
		this.ot=0.2*salary;
		
	}
	public double getPa() {
		return pa;
	}
	public double getOt() {
		return ot;
	}
	@Override
	public double calculateAnnualCtc() {
		double ctc=(this.basicsalary+pa+ot)*12;
		return ctc;
		
	}
	@Override
	public void printSalarySlip() {
		System.out.println("Id    :"+this.employeeId);
		System.out.println("Name  :"+this.employeeName);
		System.out.println("Salary:"+this.basicsalary);
		System.out.println("HRA   :"+this.pa);
		System.out.println("DA    :"+this.ot);
		System.out.println("CTC   :"+this.calculateAnnualCtc());
	}
	
	
}
