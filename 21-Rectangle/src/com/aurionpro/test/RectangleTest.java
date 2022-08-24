package com.aurionpro.test;

import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle(100, -10,ColorType.RED);
		printRectangle(smallRectangle);


		Rectangle bigRectangle = new Rectangle(300, 300,ColorType.GREEN);
		printRectangle(bigRectangle);
	}

	private static void printRectangle(Rectangle rectangle) {
		System.out.println("Height of rectangel is  :" + rectangle.getHeight());
		System.out.println("Width of a rectangle is :" + rectangle.getWidth());
		System.out.println("Color of a rectangle  :" + rectangle.getColor());
		System.out.println("Area of a rectangle :" + rectangle.calculateArea());
	}
}