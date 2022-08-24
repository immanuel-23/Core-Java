package com.aurionpro.model;

public class CurrentAccount extends Account {
	public static  final int overDraft=5000;

	public CurrentAccount(int accNo, String name, int balance) {
		super(accNo, name, balance);
		
	}
	
	@Override
	public void withdraw(double amount) {
		if (this.getBalance() - amount < -overDraft)
			System.out.println("Insufficient balance");
		else{
			this.setBalance(this.getBalance() - amount);
		}
	}

	
}
