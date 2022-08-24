package com.aurionpro.model;

public class Task2 extends Thread {
	@Override
	public void run() {
		System.out.println("Task2 started");
		for(int i=1;i<5;i++) {
			System.out.println("Inside task2 "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Task2 ended");

	}

}
