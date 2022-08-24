package com.aurionpro.model;

public class Employee implements Cloneable {

	public int id;
	public String name;

	public Employee(int i, String string) {
		this.id = i;
		this.name = string;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
