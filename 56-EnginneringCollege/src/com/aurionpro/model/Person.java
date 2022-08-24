package com.aurionpro.model;

public abstract class Person {
	private int id;
	private String name;
	private String dob;
	

	public Person(int id, String name, String dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public abstract void printDetails();

	

}
