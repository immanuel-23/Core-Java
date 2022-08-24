package com.aurionpro.test;

public class ThreadTest {

	public static void main(String[] args) {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside run anonymous class");
			}
		
		};
		Thread t1= new Thread(r);
		t1.start();
		
		Runnable r1 = ThreadTest::execute;// static reference
		Thread t2= new Thread(r1);
		t2.start();
		
		Runnable r2=()->{
			System.out.println("Inside run lamda");
		};
		Thread t3= new Thread(r2);
		t3.start();
		
		
	}
	public static void execute() {
		System.out.println("Inside run static reference");
	}
	

}
