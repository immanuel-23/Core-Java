package com.aurionpro.test;

public class MemberInnerClass {
	class Inner{
		void display() {
			System.out.println("Hii iam Member Inner Class");
		}
	}

	public static void main(String[] args) {
		
		MemberInnerClass m=new MemberInnerClass();//  creating object of outer class
		MemberInnerClass.Inner in = m.new Inner();// creating object of inner class  using outer class
		in.display();
				
		

	}

}
