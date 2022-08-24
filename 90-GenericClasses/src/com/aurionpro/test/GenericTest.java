package com.aurionpro.test;

public class GenericTest<T> {
	private T area;
	
	public T getArea() {
		return area;
	}
	
	public void setArea(T area) {
		this.area = area;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericTest<Integer> rectangle= new GenericTest<Integer>();
		rectangle.setArea(32);
		System.out.println("Area of rectangle is :"+rectangle.getArea());
		
		GenericTest<Double> circle= new GenericTest<Double>();
		circle.setArea(45.6);
		
		System.out.println("Area of circle is :"+circle.getArea());
	}

}
