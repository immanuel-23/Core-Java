package com.aurionpro.test;

import com.aurionpro.model.AddInteger;
import com.aurionpro.model.IAddable;

public class IAddableTest {

	public static void main(String[] args) {
		AddInteger a1= new AddInteger();
		System.out.println("Addition of a+b is "+a1.addInteger(5, 6));
		
		IAddable a2= new IAddable() {// example of anonymous class

			@Override
			public int addInteger(int a, int b) {
				return a+b;
			}
			
		};
		System.out.println("Addition of a2 by uisng anonymous class is :"+a2.addInteger(5, 9));
		
		IAddable a3=(a,b)->{
			System.out.println("Inside lamda");
			return a+b;
		};
		System.out.println(a3.addInteger(6, 7));
		
		//IAddable a4=IAddableTest::addInteger1;
		//a4.addInteger(5, 6);
		
	}
	public void addInteger1(int a, int b) {
		System.out.println("Inside static reference addition is "+(a+b));
	}

}
