package com.aurionpro.test;

import java.lang.reflect.Executable;

import com.aurionpro.model.ExecuteTask;
import com.aurionpro.model.Iexicutable;

public class ExecuteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecuteTask et=new ExecuteTask();
		et.execute("hiii");
		Iexicutable ex= new Iexicutable() {
			@Override
			public void execute(String args) {
				System.out.println("Inside anonymous  execute "+args);
			}
			
		
		};
		ex.execute("Happy");
		
		Iexicutable ex1=(arg)->{
		System.out.println("Executing lamda"+arg);//example of lambda
		};
		ex1.execute("Happy lambda");
		
		Iexicutable ex2=ExecuteTest::showMessage;
		ex2.execute("happy");
		
		

	}
	public static void showMessage(String args) {
		System.out.println("Message is "+args);
	}

}
