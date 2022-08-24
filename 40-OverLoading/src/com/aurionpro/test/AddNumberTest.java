package com.aurionpro.test;

import com.aurionpro.model.AddNumber;

public class AddNumberTest {

	public static void main(String[] args) {
		AddNumber obj=new AddNumber();
		System.out.println(obj.add(10, 11));
		System.out.println(obj.add(0.01,9.0));
		System.out.println(obj.add(6, 7, 8));

	}

}
