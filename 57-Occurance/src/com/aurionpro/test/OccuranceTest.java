package com.aurionpro.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class OccuranceTest {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 50, 10, 50, 50, 80, 90));
		HashMap<Integer, Integer> hash = new HashMap<>();
		System.out.println(number);

		int count = 0;
		for (int i = 0; i < number.size(); i++) {
			for (int j = 0; j < number.size(); j++) {
				if (number.get(i) == number.get(j))
					count++;
			}
			hash.put(number.get(i), count);
			count = 0;
		}
		System.out.println(hash);
		//countOccureance(number);

	}

//	private static void countOccureance(ArrayList<Integer> number) {
//		// TODO Auto-generated method stub
//		for (Integer a : number) {
//			if (a != a + 1) {
//				System.out.println("" + a + "occurs:" + Collections.frequency(number, a));
//			}
//		}
//	}

}
