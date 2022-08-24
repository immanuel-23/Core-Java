package com.aurionpro.model;

public class Student implements Comparable <Student>{
	public int rollno;
	public String name;
	public int age;
	

	public Student(int rollNo, String name, int age) {
		super();
		this.rollno = rollNo;
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(Student st) {
		if(age==st.age)  
			return 0;  
		else if(age<st.age)  
			return 1;  
		else  
			return -1;  
	}
	

}
