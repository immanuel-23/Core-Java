package com.aurionpro.test;

import java.util.*;

import com.aurionpro.model.Student;

public class StudentTest {
	public static void main(String args[]) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Rahul", 23));
		al.add(new Student(106, "Immanuel", 27));
		al.add(new Student(105, "Jay", 21));

		Collections.sort(al);

		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}