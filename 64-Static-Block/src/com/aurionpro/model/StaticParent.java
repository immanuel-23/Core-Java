package com.aurionpro.model;

public class StaticParent {
	
	public StaticParent() {
		super();
		System.out.println("Inside parent Constructor");
	}

	static {
		System.out.println("Inside parent static ");
	}
}
