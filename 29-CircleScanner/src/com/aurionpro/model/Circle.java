package com.aurionpro.model;

public class Circle {
	private double radius;
	private String color;
	private String border;
	
	public Circle(double radius ,String border, String color) {
		this.radius=radius;
		this.color=color;
		this.border=border;
	}
	public double calarea() {
		return this.radius*this.radius*3.142;
	}
	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}

	public String getBorder() {
		return border;
	}

	
}
