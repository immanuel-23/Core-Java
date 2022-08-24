package com.aurionpro.model;

public interface Ipresentation {
	
	abstract void show();
	default void present() {
		System.out.println("Inside default present");
	}

}
