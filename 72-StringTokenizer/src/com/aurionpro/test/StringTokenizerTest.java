package com.aurionpro.test;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hey i am stringtokenizer");
		System.out.println("Total count of token in string: "+st.countTokens());
		
		System.out.println();
		
		ArrayList<String> arr= new ArrayList<String>();
		
		while(st.hasMoreTokens()) {
			arr.add(st.nextToken());
		}
		System.out.println(arr);
	
	}

}
