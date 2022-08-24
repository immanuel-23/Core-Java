package com.aurionpro.test;

import com.aurionpro.model.*;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(10, ColorType.BLUE, BorderType.DASH);
		Circle c2 = new Circle(30, ColorType.RED, BorderType.SOLID);
		double area;
		double radius;
		radius = c1.getRadius();
		System.out.println("DEATIAL OF FIRST CIRCLE");
		System.out.println("The Radius of the circle is :" + c1.getRadius());
		System.out.println("The Color  of the circle is :" + c1.getColor());
		System.out.println("The Border of the circle is :" + c1.getBorder());
		System.out.println("The Area " + "of the circle is :" + c1.calarea());
		System.out.println("********************************8");
		System.out.println("DEATIAL OF S" + "ECOND CIRCLE");
		System.out.println("The Radius of the circle is :" + c2.getRadius());
		System.out.println("The Color  of the circle is :" + c2.getColor());
		System.out.println("The Border of the circle is :" + c2.getBorder());
		area = c2.calarea();
		System.out.println("The Area of the circle is :" + c2.calarea());

	}

}
