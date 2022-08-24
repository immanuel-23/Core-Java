package com.aurionpro.model;

public class Bmi {
	private double bmiValue;
	public Bmi(Person p) {
		p.heigth = 0.01 * p.getHeigth();// converting into meters
		// System.out.println(p);
		//p.weight = 0.001 * p.getWeight();// converting into height
		// System.out.println(p);
		bmiValue = getBmi(p);
		System.out.println("Bmi of " + p.getName() + "is " + bmiValue);
		bodyType(bmiValue);

	}

	private void bodyType(double bmiValue) {
		if (bmiValue < 18.50)
			System.out.println("Under Weight");

		if (bmiValue > 18.50 && bmiValue <= 24.99)
			System.out.println("Normal");

		if (bmiValue > 25)
			System.out.println("Obese");

	}

	private double getBmi(Person p) {
		return p.getWeight() /( p.getHeigth()*p.getHeigth());
	}

}
