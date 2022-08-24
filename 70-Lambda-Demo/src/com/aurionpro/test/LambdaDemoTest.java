package com.aurionpro.test;

import com.aurionpro.model.LambdaDemo;

public class LambdaDemoTest {

	public static void main(String[] args) {
		LambdaDemo l=()->{
			System.out.println("Inside lambda demo");
		};
		l.run();
		LambdaDemo l1=()->{
			System.out.println("Inside lambda1 demo");
			System.out.println("second lamdba");
		};
		l1.run();
	}

}
