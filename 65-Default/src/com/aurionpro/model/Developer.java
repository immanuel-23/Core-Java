package com.aurionpro.model;

public class Developer implements Ipresentation {

	@Override
	public void show() {
		System.out.println("Inside developer");
	}

	@Override
	public void present() {
		System.out.println("Inside default present developer");
	}

}
