package com.aurionpro.model;

public class Circle {
	private final double radius;
	private final ColorType color;
	private final BorderType border;
	
	public Circle(double radius , ColorType color, BorderType border) {
		this.radius=radius;
		this.color=color;
		this.border=border;
	}
	
	public Circle(double radius , ColorType color) {
		
		this(radius,color,BorderType.DASH);
	}
	
	public Circle(double radius) {
		this(radius,ColorType.GREEN,BorderType.SOLID);
		
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
	@Override
	public String toString() {
		System.out.println("hii");
		return "Circle [radius=" + radius + ", color=" + color + ", border=" + border + "]";
	}
	
	
}
