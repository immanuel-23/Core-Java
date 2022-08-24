package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		/*Rectangle smallRectangle = new Rectangle(100, -10,ColorType.RED);
		printRectangle(smallRectangle);
		

		Rectangle bigRectangle = new Rectangle(300, 300,ColorType.GREEN);
		printRectangle(bigRectangle);*/
		Rectangle[] rectangles= {  new Rectangle(10, -10,ColorType.RED),
								   new Rectangle(40, -1,ColorType.GREEN),
								   new Rectangle(400, 0,ColorType.BLUE),
								   new Rectangle(900, -50,ColorType.RED),
								   new Rectangle(400, -1,ColorType.RED)
									 };// this will create array of objects of type rectangle
		for(Rectangle r:rectangles) {
			System.out.println(r.getHeight());
			System.out.println(r.getWidth());
			System.out.println(r.getColor());
		}

	}

	

	/*private static void printRectangle(Rectangle rectangle) {
		System.out.println("Height of rectangel is  :" + rectangle.getHeight());
		System.out.println("Width of a rectangle is :" + rectangle.getWidth());
		System.out.println("Color of a rectangle  :" + rectangle.getColor());
		System.out.println("Area of a rectangle :" + rectangle.calculateArea());
	}*/
}