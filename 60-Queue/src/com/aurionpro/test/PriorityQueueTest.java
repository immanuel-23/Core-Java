package com.aurionpro.test;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueTest {
	static Scanner sc = new Scanner(System.in);
	static PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

	public static void main(String[] args) {
		int start = 1;
		System.out.println("Enter 1 to start and 0 to Exit");
		start = sc.nextInt();
		while (start == 1) {
			int option;
			System.out.println("Enter 1:insert 2:Delete 3:peek 4:Display");
			option = sc.nextInt();
			if (option == 1)
				insert();
			else if (option == 2)
				delete();
			else if (option == 3)
				peek();
			else
				display();

			System.out.println("Enter 1 to start and 0 to Exit");
			start = sc.nextInt();

		}

	}

	private static void display() {
		System.out.println(pq);
	}

	private static void peek() {
		System.out.println("Peek of the PriorityQueue is " + pq.peek());
		display();
	}

	private static void delete() {
		System.out.println("Deletd element is " + pq.poll());
		display();
	}

	private static void insert() {
		int userinput;
		System.out.println("Enter Your number:");
		userinput = sc.nextInt();
		pq.add(userinput);
		display();
	}

}
