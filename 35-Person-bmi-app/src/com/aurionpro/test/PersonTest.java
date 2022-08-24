package com.aurionpro.test;
import com.aurionpro.model.*;


public class PersonTest {

	public static void main(String[] args) {
		Person p1=new Person("Raj",20,300,100000,GenderType.MALE);
		Person p2=new Person("Pooja",22,6000,2500,GenderType.FEMALE);
		Person p3=new Person("Immanuel",23,350,650000,GenderType.MALE);
		/*System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		*/
		System.out.println("Bmi of each one ");
		Bmi b1=new Bmi(p1);
		Bmi b2=new Bmi(p2);
		Bmi b3=new Bmi(p3);



	}

}
