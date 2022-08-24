package com.aurionpro.model;

public class SavingAccount extends Account {
	
	public static  final int MIN_BAL=5000;
	public SavingAccount(int accNo, String name, int balance) {
		super(accNo, name, balance);// 
	}

	
	@Override
	public void withdraw(double ammount) {
		// TODO Auto-generated method stub
		
	}
	
	
}
