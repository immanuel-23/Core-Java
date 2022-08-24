package com.aurionpro.model;

public class manager implements Ipresentation {

	@Override
	public void show() {
		System.out.println("Inside manager ");
	}
	@Override
	public void present() {
		System.out.println("Inside default present of manager");
	} 

}
