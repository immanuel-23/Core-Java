package com.aurionpro.model;

public class Printer {
	DelegatPrinter dp = new DelegatPrinter();

	public void print() {
		System.out.println("print");
		dp.print();
		
	}

}
