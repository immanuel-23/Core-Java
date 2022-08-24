package com.aurionpro.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.aurionpro.model.Task1;
import com.aurionpro.model.Task2;

public class FixedThreadTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task1());
		executorService.execute(new Task2());
		executorService.shutdown();



	}

}
