package com.aurionpro.model;

public class Student extends Person {
	branchType branch;

	public Student(int id, String name, String dob, branchType branch) {
		super(id, name, dob);
		this.branch = branch;
	}
	@Override
	public void  printDetails() {
		System.out.println("id:"+getId());
		System.out.println("Name:"+getName());
		System.out.println("DOB:"+getDob());
		System.out.println("Branch :"+branch);

	}

	

}
