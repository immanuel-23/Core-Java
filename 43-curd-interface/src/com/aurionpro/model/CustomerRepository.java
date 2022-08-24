package com.aurionpro.model;

public class CustomerRepository implements Irepository {

	@Override
	public void create() {
		System.out.println("Created Customer Repository");
	}

	@Override
	public void update() {
		System.out.println("updated Customer Repository");

	}

	@Override
	public void delete() {
		System.out.println("Deleted Customer Repository");

	}

	@Override
	public void read() {
		System.out.println("write Customer Repository");

	}

}
