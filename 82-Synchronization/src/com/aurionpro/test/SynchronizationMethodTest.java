package com.aurionpro.test;

class Counter {
	int count = 0;
	int count2=0;

	public void increment() {
		
		count = count + 1;
		
		synchronized(this) {
			count2=count2+1;
		}
		
	}
// we will write synchronized to a method if we want to make entire method tho be synchronized but if we want to only  syncronized we will be using block
}

public class SynchronizationMethodTest {

	public static void main(String[] args) throws Exception {
		Counter c = new Counter();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i= 1; i <= 1000; i++) {
					c.increment();
				}
			}

		});
		// t1.join();// join say main method to wait until t1 thread is finished

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}

		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();// we will be getting sometime 2000 and sometime another value because both the thread are using it at the same time

		System.out.println("Count1:" + c.count);
		System.out.println("Count2:" + c.count2);
	}

}
