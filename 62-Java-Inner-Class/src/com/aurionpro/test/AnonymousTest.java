package com.aurionpro.test;

abstract class Person {
	abstract void eat();
}

public class AnonymousTest {

	public static void main(String[] args) {
		Person p = new Person() {

			@Override
			void eat() {
				System.out.println("Person is eating");
			}

		};
		p.eat();
		Person p1 = new Person() {

			@Override
			void eat() {
				System.out.println("Person is eating fruit");
			}

		};
		p1.eat();

	}

}
