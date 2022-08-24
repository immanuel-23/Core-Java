package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

public class UnBoundedWildCardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1, 2, 34, 456);
		wildCardPrint(list1);
		
		List<Double> list2= Arrays.asList(20.1,34.5,56.8,78.0);
		wildCardPrint(list2);
		
	}

	public static void wildCardPrint(List<?> list) {
		System.out.println(list);
	}

}
