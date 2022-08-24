package com.aurionpro.test;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> empName = new LinkedList<String>();

		System.out.println("Linked list");
		
		empName.add("Immanuel");
		empName.add("Israel");
		empName.add("Ajay");
		empName.add("Rohan");
		empName.add("Shubham");
		
		printDetails(empName);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		empName.add(sc.next());
		System.out.println("New list");
		printDetails(empName);
		System.out.println("Enter the location that you want to delete:");
		empName.remove(sc.nextInt());
		printDetails(empName);
	}

	private static void printDetails(LinkedList<String> empName) {
		for (String e : empName) {
			System.out.println(e);
		}
	}

}
