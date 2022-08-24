package com.aurionpro.test;

import java.util.*;
import com.aurionpro.model.*;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total_object;
		int ht;
		int wt;
		String clr;
		ColorType color;

		System.out.println("Enter total number of triangles");
		total_object = sc.nextInt();
		Rectangle[] rectangle = new Rectangle[total_object];
		for (int i = 0; i < total_object; i++) {
			System.out.println("Enter the hight of the rectangle");
			ht = sc.nextInt();
			System.out.println("Enter the width of the rectangle");
			wt = sc.nextInt();
			System.out.println("Enter the color of the rectangle");
			try {
				color = ColorType.valueOf(sc.next().toUpperCase());
			} catch (IllegalArgumentException e) {
				color = ColorType.RED;
			}
			rectangle[i] = new Rectangle(ht, wt, color);

		}

		for (Rectangle r : rectangle) {
			printRectangle(r);

		}
	}

	private static void printRectangle(Rectangle rectangle) {
		System.out.println("Height of rectangel is  :" + rectangle.getHeight());
		System.out.println("Width of a rectangle is :" + rectangle.getWidth());
		System.out.println("Color of a rectangle  :" + rectangle.getColor());
		System.out.println("Area of a rectangle :" + rectangle.calculateArea());
	}

}