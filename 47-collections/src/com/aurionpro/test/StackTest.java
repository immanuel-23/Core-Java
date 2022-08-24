package com.aurionpro.test;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		Stack<String>color=new Stack<String>();
		color.push("Red");
		color.push("Green");
		color.push("Purple");
		color.push("Black");
		System.out.println("Printing stack:"+color);
		System.out.println("The peek of the stack is :"+color.peek());
		System.out.println("Pop :"+color.pop());
		System.out.println("Printing stack after pop operation:"+color);

		
	}

}
