package com.aurionpro.model;

public class Circle {
	private double radius;
	private String color;
	private String border;
	
	public double calarea(){
		return 3.142*this.radius*this.radius;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBorder() {
		return border;
	}

	public void setBorder(String border) {
		this.border = border;
	}
	
}
