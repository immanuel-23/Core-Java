package com.aurionpro.test;
import com.aurionpro.model.*;
public class CircleTest {

	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.setRadius(20);
		c1.setColor("Red");
		c1.setBorder("solid");
		double ans=c1.calarea();
		System.out.println("DEATIAL OF FIRST CIRCLE");
		System.out.println("The Radius of the circle is :"+c1.getRadius());
		System.out.println("The Color  of the circle is :"+c1.getColor());
		System.out.println("The Border of the circle is :"+c1.getBorder());
		System.out.println("The Area of the circle is :"+ans);
		Circle c2=new Circle();
		c2.setRadius(25);
		c2.setColor("Blue");
		c2.setBorder("Dash");
		ans=c2.calarea();
		System.out.println("********************************8");
		System.out.println("DEATIAL OF SECOND CIRCLE");
		System.out.println("The Radius of the circle is :"+c2.getRadius());
		System.out.println("The Color  of the circle is :"+c2.getColor());
		System.out.println("The Border of the circle is :"+c2.getBorder());
		System.out.println("The Area of the circle is :"+ans);

	}

}
