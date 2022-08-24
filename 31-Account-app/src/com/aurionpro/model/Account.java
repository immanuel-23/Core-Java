package com.aurionpro.model;

public class Account {
	private int id;
	private String name;
	private double balance;
	
	

	public Account(int i, String string, int j) {
		this.id=i;
		this.name=string;
		this.balance=j;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	public  boolean withdraw(double ammount){
		if(this.balance-ammount>=1000) {
			balance=balance-ammount;
			return true;
		}
		return false;
		
	}
	
	public boolean deposite(double ammount){
		if(ammount>0) {
			this.balance=this.balance+ammount;
			return true;
		}
		return false;
	}
	

}
