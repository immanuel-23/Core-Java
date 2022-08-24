package com.aurionpro.model;

public class Player {
	private String name;
	private String id;
	private int age;
	private static int count=101;

	public Player(String name, int age) {
		this.name = name;
		this.id = "p"+count++;
		this.age = age;
	}

	

	public Player(String name) {
		this(name, 30);
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", id=" + id + ", age=" + age + "]";
	}



	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getId() {
		return id;
	}

	public Player whoIsElder(Player p2) {
		if (this.age > p2.age)
			return this;// by using this we have passed the actual object that has called the method
		return p2;
	}

}
