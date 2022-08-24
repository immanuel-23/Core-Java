package com.aurionpro.model;

public class Professor extends Person implements Isalary {
	private double basicSalary;
	private double hra;
	private double da;
	private double ta;

	public Professor(int id, String name, String dob, double basicSalary) {
		super(id, name, dob);
		this.basicSalary = basicSalary;
		this.hra = 0.3 * basicSalary;
		this.da = 0.2 * basicSalary;
		this.ta = 0.1 * basicSalary;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	@Override
	public double calculateSalary() {

		return (basicSalary * hra * da * ta) * 12;

	}

	@Override
	public void printDetails() {
		System.out.println("Id: " + getId());
		System.out.println("Name: " + getName());
		System.out.println("DOB: " + getDob());
		System.out.println("Basic salary: " + getBasicSalary());
		System.out.println("Calculate ctc:" + calculateSalary());
	}

}
