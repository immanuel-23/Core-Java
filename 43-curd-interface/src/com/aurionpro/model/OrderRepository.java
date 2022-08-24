package com.aurionpro.model;

public class OrderRepository implements Irepository {

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Created Order Repository");

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("updated order Repository");

	}

	@Override
	public void delete() {
		System.out.println("deleted order Repository");

	}

	@Override
	public void read() {
		System.out.println("Write order Repository");

	}

}
