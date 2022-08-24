package com.aurionpro.test;

public class ExceptionTest {

	public static void main(String[] args) {
		int c=0;

		try {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		c=a/b;
		}catch(ArithmeticException e) {
			System.out.println("Exception handled");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception handled");
		}catch(NumberFormatException e) {
			System.out.println("Exception handled");
		}
		finally {
			System.out.println("in FINALLY");
			
		}
		System.out.println("Divison is "+c);
		
		
		
	}

}
