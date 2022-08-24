package com.aurionpro.test;

import com.aurionpro.model.ThreadExtends;

public class ThreadExtendsTest {

	public static void main(String[] args) {
		ThreadExtends te = new ThreadExtends();
		System.out.println("First Thread started");
		te.start();
		ThreadExtends te1 = new ThreadExtends();
		System.out.println("Second thread started");
		te1.start();
		System.out.println("End of main");

	}

}
