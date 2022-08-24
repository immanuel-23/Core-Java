package com.aurionpro.test;

import com.aurionpro.model.*;

public class AccountTest {

	public static void main(String[] args) {
		//Account acc = new CurrentAccount(0, null, 0); in abstract we cant create a object of abstract class but can make reference of it

		SavingAccount saving = new SavingAccount(101, "Immanuel", 10000);
		printDetails(saving);
		saving.deposit(50000);
		printDetails(saving);
		CurrentAccount current = new CurrentAccount(104, "Raj", 1010);
		printDetails(current);
		current.withdraw(500);
		printDetails(current);

	}

	private static void printDetails(Account acc) {

		System.out.println("Account no :" + acc.getAccNo());
		System.out.println("Name :" + acc.getName());
		System.out.println("Balance :" + acc.getBalance());

	}

}
