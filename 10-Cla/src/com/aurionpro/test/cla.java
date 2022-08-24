package com.aurionpro.test;

public class cla {
	public static void main(String args[]) {
		System.out.println(args);
		int sum =0;
		for(int i=0;i<args.length;i++) {	
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println(sum);
	}
}
