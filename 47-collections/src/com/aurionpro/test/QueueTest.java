package com.aurionpro.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<String>carName= new PriorityQueue<String>();
		carName.add("Honda");
		carName.add("Toyota");
		carName.add("BMW");
		carName.add("RR");
		System.out.println("Queue elements are :"+carName);
		System.out.println("Head of the queue is :"+carName.peek());
		System.out.println("Removing one element:"+carName.remove());
		System.out.println("Queue elemnts are "+carName);



	}

}
