package com.aurionpro.test;

import com.aurionpro.model.Account;
import com.aurionpro.model.InsufficentFundException;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account(1,"Immanuel",900);
		try {
			acc.withDraw(80000);
		} catch (InsufficentFundException e) {
			System.out.println(e);
		}
		System.out.println("Account app");
	}

}
