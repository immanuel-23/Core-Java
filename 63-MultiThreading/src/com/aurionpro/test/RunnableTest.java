package com.aurionpro.test;

import com.aurionpro.model.RunnableThread;

public class RunnableTest {
	public static void main(String args[]) {
		RunnableThread rt1 = new RunnableThread();
		Thread t1 = new Thread(rt1);
		t1.start();
		RunnableThread rt2 = new RunnableThread();
		Thread t2 = new Thread(rt2);
		t2.start();
		System.out.println("End of main");

	}
}
