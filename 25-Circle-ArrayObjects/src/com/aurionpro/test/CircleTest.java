package com.aurionpro.test;

import com.aurionpro.model.*;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle(10, ColorType.BLUE, BorderType.DASH);
		Circle c2 = new Circle(30, ColorType.RED, BorderType.SOLID);

		Circle[] circles = { 
				new Circle(10, ColorType.BLUE, BorderType.SOLID),
				new Circle(30, ColorType.GREEN, BorderType.DOTTED),
				new Circle(50, ColorType.RED, BorderType.SOLID),
				new Circle(9, ColorType.BLUE, BorderType.DASH), 
				new Circle(6, ColorType.GREEN, BorderType.DOTTED) };

		for (Circle c : circles) {
			System.out.println("*********************************************");
			System.out.println("The Radius of the circle is :" + c.getRadius());
			System.out.println("The Color  of the circle is :" + c.getColor());
			System.out.println("The Border of the circle is :" + c.getBorder());
			System.out.println("The Area of the circle is :" + c.calarea());
		}

	}
}
