package com.aurionpro.model;

public class Account {
	private int id;
	private String name;
	private double balance;
	public Account(int id,String name,double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void withDraw(double ammount) throws InsufficentFundException {
		if(ammount>this.balance) {
			throw new InsufficentFundException("Insufficient exception");
		}
	}
	

}
