package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.Task1;
import com.aurionpro.model.Task2;

public class SingleThreadExecutorTest {

	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task1());
		executorService.execute(new Task2());
		//System.out.println("End of main");
		
		//single thread executor is used when we want to execute something in sequential ordr
		executorService.shutdown();

		
	}

}
