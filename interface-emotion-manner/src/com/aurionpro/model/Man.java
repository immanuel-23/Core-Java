package com.aurionpro.model;

public class Man implements IMannarable, IEmotional {
	@Override
	public void cry() {
		System.out.println("Man crys");
	}

	@Override
	public void laugh() {
		System.out.println("Man laugh");
	}

	@Override
	public void greet() {
		System.out.println("Man greet");
	}

	@Override
	public void depart() {
		System.out.println("Man says bye");
	}

	@Override
	public void hii() {
		System.out.println("man");

	}

}
