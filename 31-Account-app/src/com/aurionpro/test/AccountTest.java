package com.aurionpro.test;
import com.aurionpro.model.*;
public class AccountTest {

	public static void main(String[] args) {
		Account acc=new Account(1,"Immanuel",900000);
		//System.out.println(acc.toString());
		accountDetails(acc);
		
		printTransactionWithdraw(acc.withdraw(2000));

		
		System.out.println(acc.toString());
		printTransactionDeposite(acc.deposite(3000));

		//System.out.println(acc.toString());

	}

	private static void accountDetails(Account acc) {
		System.out.println("Account id:"+acc.getId());
		System.out.println("Customer name:"+acc.getName());
		System.out.println("Balance:"+acc.getBalance());

	}

	private static void printTransactionWithdraw(boolean withdraw) {
		if(withdraw){
			System.out.println("Transaction done succesfully");
		}else {
			System.out.println("Transaction fail ");
		}
	}
	private static void printTransactionDeposite(boolean deposite) {
		if(deposite) {
			System.out.println("Transaction done succesfully deposited ");
		}else {
			System.out.println("sorry deposite failes");
		}
	}
	
}
