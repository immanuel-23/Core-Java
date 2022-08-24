package com.aurionpro.test;
import com.aurionpro.model.*;
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle(10,200);
		Rectangle rect1=new Rectangle(30,40);
		double ans=rect.calculatearea();
		rect.display();
		System.out.println("The area is "+ans);
		ans=rect1.calculatearea();
		rect1.display();
		System.out.println("The area of second rect is "+ans);
		
	}
	

}
