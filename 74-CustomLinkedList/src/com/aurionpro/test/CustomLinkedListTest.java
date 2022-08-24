package com.aurionpro.test;

import java.util.Iterator;
import java.util.Scanner;

import com.aurionpro.model.CustomLinkedList;

public class CustomLinkedListTest {

	public static void main(String[] args) {
		CustomLinkedList l1 = new CustomLinkedList();
		Scanner sc = new Scanner(System.in);
		int option;
		int userInput;
		int startGame=1;
		while(startGame==1) {
			System.out.println("1: INSERT\t 2)REMOVE\t 3)DISPLAY\t 4) ITERATOR");
			option=sc.nextInt();
			if(option==1) {
				System.out.println("Enter the number you want to insert\n");
				userInput=sc.nextInt();
				l1.insert(userInput);
			}
			else if(option==2) {
				System.out.println("Enter the positon that  You want to delete");
				userInput=sc.nextInt();
				l1.remove(userInput);
			}
			else if(option==3) 
				l1.display();
			else if(option==4) {
				Iterator<Integer> it=l1.iterator();
				it.forEachRemaining(System.out::println);
			}
			
			System.out.println("Enter 1 to continue  and 0 to exit");
			startGame =sc.nextInt();
		}
		
//		l1.insert(5);
//		l1.insert(6);
//		l1.insert(9);
//		l1.insert(11);
//		System.out.println("Removing 5");
//		l1.remove(3);
//		System.out.println("Displaying");
//		l1.display();
		
		
	}

}
