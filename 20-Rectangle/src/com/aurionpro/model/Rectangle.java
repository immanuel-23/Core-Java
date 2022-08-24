package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	
	
	public double calculatearea() {
		
		double area=height*width;
		return area;
	}
	public void display() {
		System.out.println("The Height of the rectangle is "+height);
		System.out.println("The width of the rectnagle is  "+width);
	}
	
	public Rectangle(double ht,double wt) { // aurionpro
		height=ht;
		width=wt;
	}

}
