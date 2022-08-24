package com.aurionpro.model;

public class Circle {
	private double radius;
	private ColorType color;
	private BorderType border;
	
	public Circle(double radius , ColorType color, BorderType border) {
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

	public ColorType getColor() {
		return color;
	}

	public BorderType getBorder() {
		return border;
	}

	
}
