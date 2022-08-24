package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.model.*;

public class CircleTest {

	private static final char[][] Circle = null;
	private static Object circles;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int total_object;
		System.out.println("Enter how many object do you eant to create ");
		total_object=sc.nextInt();
		int radius;
		String border;
		String color;
		for(int i=1;i<=total_object;i++) {
			System.out.println("Enter the radius of the circle");
			radius=sc.nextInt();
			System.out.println("Enter the border of the circle");
			border=sc.next();
			System.out.println("Enter the color of the circle");
			color=sc.next();
			Circle[] circles= {
					new Circle(radius,border,color)
					};
			}
		
		/*Circle c1 = new Circle(10, ColorType.BLUE, BorderType.DASH);
		Circle c2 = new Circle(30, ColorType.RED, BorderType.SOLID);

		Circle[] circles = { 
				new Circle(10, ColorType.BLUE, BorderType.SOLID),
				new Circle(30, ColorType.GREEN, BorderType.DOTTED),
				new Circle(50, ColorType.RED, BorderType.SOLID),
				new Circle(9, ColorType.BLUE, BorderType.DASH), 
				new Circle(6, ColorType.GREEN, BorderType.DOTTED) };
*/
		for (Circle c : circles) {
			System.out.println("*********************************************");
			System.out.println("The Radius of the circle is :" + c.getRadius());
			System.out.println("The Color  of the circle is :" + c.getColor());
			System.out.println("The Border of the circle is :" + c.getBorder());
			System.out.println("The Area of the circle is :" + c.calarea());
		}

		

	}
}
