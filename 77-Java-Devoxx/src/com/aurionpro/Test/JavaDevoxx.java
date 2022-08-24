package com.aurionpro.Test;

import java.awt.List;
import java.util.Arrays;

public class JavaDevoxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.List<Integer> li= Arrays.asList(8,9,0,7);
	        li.forEach(System.out::println);
	        
	        li.forEach(n->System.out.println(n));
	        java.util.List<Integer> 	l1=  (java.util.List<Integer>) li.stream()
	        															.filter(n->n>5)
	        															.limit(4);
	       l1.forEach(System.out::println);

	}

}
