package com.aurionpro.model;

public class StaticChild  extends StaticParent{
	
	public StaticChild() {
		System.out.println("Inside child constructor");
	}

	static {
		System.out.println("Inside Child Static");
	}
}
