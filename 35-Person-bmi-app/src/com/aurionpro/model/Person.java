package com.aurionpro.model;

public class Person {
	public  String name;
	public int age;
	public double heigth;
	public double weight;
	public GenderType gender;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getHeigth() {
		return heigth;
	}

	public double getWeight() {
		return weight;
	}

	public GenderType getGender() {
		return gender;
	}

	public Person(String name, int age, double heigth, double weight, GenderType gender) {
		this.name = name;
		this.age = age;
		this.heigth = heigth;
		this.weight = weight;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", heigth=" + heigth + ", weight=" + weight + ", gender="
				+ gender + "]";
	}
	
	

}
