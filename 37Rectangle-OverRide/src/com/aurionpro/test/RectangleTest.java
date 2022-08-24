package com.aurionpro.test;
import com.aurionpro.model.*;
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect1=new Rectangle(10,200);
		Rectangle rect2=new Rectangle(10,200);
		
		System.out.println(rect1.equals(rect2));
		System.out.println(rect1.hashCode());
		System.out.println(rect2.hashCode());
	}
	

}
