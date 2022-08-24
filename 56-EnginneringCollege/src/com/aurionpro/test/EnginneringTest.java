package com.aurionpro.test;

import com.aurionpro.model.Professor;
import com.aurionpro.model.Student;
import com.aurionpro.model.branchType;

public class EnginneringTest {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Immanuel","23-03-2000",branchType.CS);
		Professor p1= new Professor(102,"Rahul","20-08-1996",40000);
		System.out.println("***** Student details*****");
		s1.printDetails();
		System.out.println("***** Professor details*****");

		p1.printDetails();
		
	}

	

}
