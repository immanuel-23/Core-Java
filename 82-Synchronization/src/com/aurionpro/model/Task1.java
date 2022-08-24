package com.aurionpro.model;

public class Task1 extends Thread{
	@Override
	public void run() {
		System.out.println("Task 1 has started");
		for(int i=1;i<5;i++) {
			System.out.println("Inside task1 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println("Task 1 has ended");

	}
	
	
}
