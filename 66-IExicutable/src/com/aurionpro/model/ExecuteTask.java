package com.aurionpro.model;

public class ExecuteTask implements Iexicutable {

	@Override
	public void execute(String arg) {
		System.out.println("Executing task "+arg);
		
	}

}
