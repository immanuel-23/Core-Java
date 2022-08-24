package com.aurionpro.model;

public abstract  class Account {
	private int accNo;
	private String name;
	protected double balance;

	public Account(int i, String string, int j) {
		this.accNo = i;
		this.name = string;
		this.balance = j;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double ammount) {
		this.balance=this.balance +ammount;
		System.out.println("Deposited");
			
	}
	
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	public abstract void withdraw(double ammount);

	



}
