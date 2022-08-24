package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	private ColorType color;
	
	public double calculatearea() {
		double area=height*width;
		return area;
	}
	public void display() {
		System.out.println("The Height of the rectangle is "+height);
		System.out.println("The width of the rectnagle is  "+width);
		System.out.println("The color of the rectangle is "+color);
	}
	
	public Rectangle(double ht,double wt) {
		//validatevaluehw( ht);
		
	}
	public ColorType getcolor() {
		return color;
	}
	
	
	
	
	private  void validatevaluehw(double ht, double wt) {
		if(ht<0) {
			this.height=1;// this is used to identify the instance varaibale in this case
		}
		if(ht>100) {
			this.height=100;
		}
		if(wt<0) {
			this.width=1;

		}if(wt>100) {
			this.width=100;

		}
	}
	
	

}
