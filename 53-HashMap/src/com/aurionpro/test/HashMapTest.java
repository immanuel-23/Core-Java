package com.aurionpro.test;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {
	public static void main(String args[]) {
		HashMap<Integer,String> empName=new HashMap<Integer,String>();
		
		empName.put(101,"Immanuel");
		empName.put(102,"Rohit");
		empName.put(103,"Ajay");
		empName.put(104,"Raj");
		System.out.println(empName);
		HashMap<Integer,String>empNameClone=(HashMap<Integer, String>) empName.clone();
		System.out.println("New HashMap cloning");
		System.out.println(empNameClone);
		empName.remove(101);
		System.out.println("After removing");
		System.out.println(empName);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name= sc.next();
		System.out.println("Enter your id");
		int id=sc.nextInt();
		empName.put(id,name);
		System.out.println(empName);
		System.out.println("Enter your name:");
		name= sc.next();
		System.out.println("Enter your id");
		id=sc.nextInt();
		empName.put(id,name);
		System.out.println(empName);
		
		
	}

}
