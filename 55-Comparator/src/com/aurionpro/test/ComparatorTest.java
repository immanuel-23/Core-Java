package com.aurionpro.test;

import java.io.*;
import java.lang.*;
import java.util.*;

class Student {

	int rollno;
	String name;

	public Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}

	public String toString() {

		return this.rollno + " " + this.name + " ";

	}
}

class Sortbyroll implements Comparator<Student> {

	public int compare(Student a, Student b) {

		return a.rollno - b.rollno;
	}
}

class Sortbyname implements Comparator<Student> {

	public int compare(Student a, Student b) {
		return a.name.compareTo(b.name);
	}
}

class ComparatorTest {

	public static void main(String[] args) {

		// Creating an empty ArrayList of Student type
		ArrayList<Student> ar = new ArrayList<Student>();

		ar.add(new Student(111, "Mayank"));
		ar.add(new Student(131, "Anshul"));
		ar.add(new Student(121, "Solanki"));
		ar.add(new Student(101, "Aggarwal"));

		System.out.println("Unsorted");

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyroll());

		System.out.println("\nSorted by rollno");

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));

		Collections.sort(ar, new Sortbyname());

		System.out.println("\nSorted by name");

		for (int i = 0; i < ar.size(); i++)
			System.out.println(ar.get(i));
	}
}
