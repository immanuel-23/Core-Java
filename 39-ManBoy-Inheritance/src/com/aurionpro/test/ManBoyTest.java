package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Kid;
import com.aurionpro.model.Man;
import com.aurionpro.model.Infants;

public class ManBoyTest {

	public static void main(String[] args) {
		/*case1();//reference and object is of same type parent
		case2();// reference and object is of same type child
		case3();// reference is of parent class and object of chil
		case4();// reference is*/
		//case5();// is an example of polymorphism were we are creating reference of parent and pointing to child
		case6();// automatic type casting
		case7();
	}

	private static void case7() {
		// Boy b= new Infants() a class cant refer to anaother class unless and untill there parent class relationship
		//Boy b = new Infants();//similarly a child class cant refer to another child class
	}
	

	private static void case6() {
		Object obj;
		obj=10;

		System.out.println(obj.getClass());
		obj="String";
		System.out.println(obj.getClass());
		obj=10>4;
		System.out.println(obj.getClass());
	}

	private static void case5() {
		toThePark(new Man());
		toThePark(new Kid());
		//toThePark(new Boy());
		//toThePark(new Infants());

	}

	private static void toThePark(Man man) {
		man.read();
	}

	private static void case4() {
		Kid kid = (Kid) new Man();
		kid.read();
		kid.play();
	}

	private static void case3() {
		Man man=new Kid();
		man.read();
		man.play();
	}

	private static void case2() {
		Boy boy= new Boy();
		boy.read();
		boy.play();
	}

	private static void case1() {
		Man man = new Man();
		man.read();
		man.play();
	}

}
