package com.aurionpro.test;

import com.aurionpro.model.Anonymous;

public class AnonymousTest {

	public static void main(String[] args) {
		Anonymous a1 = new Anonymous() {

			@Override // in this anonymous class we dont required any class to override a method
			// usualy in interface we only declare a method but d\dont writes its defination
			// example void print();
			// then we implemet the interface and then we define it but dont required in the
			// enonymous class to create a class

			public void print() {
				System.out.println("Inside a1 print method ");
			}

			@Override
			public void display() {
				System.out.println("Insdie  a1 display method ");
			}

		};
		a1.display();
		a1.print();
		Anonymous a2 = new Anonymous() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Inside a2 print method ");

			}

			@Override
			public void display() {
				// TODO Auto-generated method stub
				System.out.println("Inside a2 dispaly method ");

			}

		};

		a2.print();
		a2.display();
		

	}

}
