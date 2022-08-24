package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

public class UpperBound {
	public static void main(String args[]) {

		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
		
		List<String>list3=Arrays.asList("I","B","C","D");

		System.out.println("Total sum of int is:" + sum(list1));
		System.out.print("Total sum of double is:" + sum(list2));
		
		//System.out.println(sum(list3));

	}

	private static double sum(List<? extends Number> list) {
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}

		return sum;
	}

}
