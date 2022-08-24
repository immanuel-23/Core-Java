package com.aurionpro.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StackTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		Deque<String> dq = new ArrayDeque<String>();
		System.out.println(dq);
		int user_input;
		String name;
		System.out.println("Enter 1 to start and 0 to end");
		int startGame = sc.nextInt();
		while (startGame == 1) {
			System.out.println("To Do PUSH operation press 1 and to POP PRESS 0");
			user_input = sc.nextInt();
			if (user_input == 1) {
				System.out.println("Enter your name:");
				name = sc.next();
				dq.addLast(name);
				System.out.println("Stack after push:" + dq);
			}
			if (user_input == 0 && dq.size() > 0) {
				System.out.println("The pop element is " + dq.removeLast());
				System.out.println("Stack after pop:" + dq);
			}else
				System.out.println("No element in stack try to push");

			System.out.println("Enter 1 to start and 0 to end");
			startGame = sc.nextInt();

		}
	}
}
