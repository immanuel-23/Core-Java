package com.aurionpro.test;


public class IncrementNumber{

	public static void main(String[] args) {
		int a=10;
		System.out.println(a);
		incrementbyone(a);
		System.out.println(a);
		int marks[]= {50,60,70,80};
		int i;
		System.out.println("Before making zero");
		for(i=0;i<4;i++) {
			System.out.println(marks[i]);
		}
		updatemarkstozero(marks);
		System.out.println("After making all zero");
		for(i=0;i<4;i++) {
			System.out.println(marks[i]);
		}
	}
	
	static void incrementbyone(int num) {
		num=num+1;
	}
	static void updatemarkstozero(int[]marks) {
		for(int i=0;i<4;i++) {
			marks[i]=0;
		}
	}
	
}
