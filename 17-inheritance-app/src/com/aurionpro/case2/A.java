package com.aurionpro.case2;

public class A {
	private int foo=100;
	public A(int foo) {
		System.out.println("Inside parent class");
		this.foo=foo;
	}
	public A() {
		System.out.println("Inside same constructor ");
	}
	public int getFoo() {
		return foo;
	}
	
}
