package com.aurionpro.test;

public class ThrowsTest {

	public static void main(String[] args) {
		
		method1();

		System.out.println("End of main");
	}

	private static void method1()throws RuntimeException {
		try {
		method2();
		}catch(RuntimeException e) {
			System.out.println(e);
			
		}
		System.out.println("End of method 1");
	}

	private static void method2() throws RuntimeException{
		method3();
		System.out.println("End of method 2");
	}

	private static void method3() throws RuntimeException {
		throw new RuntimeException("Error in method 3");
	}

}
