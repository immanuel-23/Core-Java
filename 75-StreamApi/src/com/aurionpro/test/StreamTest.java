package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
//		Stream <Integer>st = Stream.of(1,2,3,4,4);
//		//st.forEach(n->System.out.println(n));
//		 Stream<Integer>st1=st.filter(n->n>3);
//		 st1.forEach(n->System.out.println(n));
//		 
//		 Stream st2= Stream.of("Immanuel","Demo","Hey","OK");
//		 st2.forEach(n->System.out.println(n));
//		 
//		 List<String>l1= Arrays.asList("Immanuel","Jesvin","Rahul","Tanmay");
//		 l1.forEach(n->System.out.println(n));
//		 
//		 Stream <String> str3= Stream.generate(()->"Some text").limit(6);
//		 str3.forEach(n->System.out.println(n));
//		 
//		 List<Integer>list=Arrays.asList(10,20,30,40,50,60,70,88,99,77,66);
//		 List<Integer>listEven= list.stream()
//				 					.distinct()
//		 	 				  					   .filter(n->n%2==0);
//		 listEven.forEach(n->System.out.println(n));
		  
		
//		Stream<Integer> st = Stream.of(10, 20, 30, 40);
//		// st.forEach(n -> System.out.println(n));
//
//		Stream<String> st1 = Stream.of("Immanuel", "HUII", "ajay");
//		// st1.forEach(n -> System.out.println(n));
//
//		// st1.forEach(n -> System.out.println(n)); // this will throw exception because its an terminal operation if we use it once then we cant use it again 
//
//		List<String> player = Arrays.asList("Dhoni", "Sachin");
//		// player.forEach(n->System.out.println(n));
//
//		Stream<String> str = Stream.generate(() -> "Some text").limit(6);
//		// str.forEach(n->System.out.println(n));
//
//		List<Integer> list = Arrays.asList(10, 30,30,30,30,20, 23, 34, 45, 66, 76, 77);
//		System.out.println("Even number");
//		
//		List<Integer>evenList=list.stream()
//		.distinct()
//		.filter(n -> n % 2 == 0)
//		.limit(4)
//		.collect(Collectors.toList());
//		
//		evenList.stream().forEach(n->System.out.println(n));
//		
//		System.out.println("odd numbers");
//		List<Integer>oddList=list.stream()
//								 .distinct()
//								 .filter(n->n%2!=0)
//								 .limit(4)
//								 .collect(Collectors.toList());
		
		
		//oddList.forEach(System.out::println);
		
		String []names = {"Immanuel","Rahul","Israel","Jesvin"};
		List<String>name=Arrays.asList(names);
		System.out.println("Printing Assending");
		name.stream()
			.sorted()
			.forEach(System.out::println);
		
		System.out.println("Printing Assending with a");
		
		name.stream()
			.sorted()
			.filter(n->n.toLowerCase().contains("a"))
			.forEach(System.out::println);

		
		
		
////		
////		System.out.println("Odd number");
////		List<Integer>oddList=list.stream()
////				.distinct()
////				.filter(n -> n % 2 != 0)
////				.limit(4)
////				.collect(Collectors.toList());
////				
////				oddList.stream().forEach(n->System.out.println(n));
////				
////				
////				BufferedReader br = null;
////				try {
////					br = Files.newBufferedReader(Paths.get("./txt/test.txt"));
////				} catch (IOException e) {
////					// TODO Auto-generated catch block
////					e.printStackTrace();
////				}
////				Stream<String> lines = br.lines();
////				lines.forEach(System.out::println);
////				System.out.println();
//		String[] names = { "Jay", "Nimesh", "Mark", "Mahesh", "Ramesh" };
//		List<String> name = Arrays.asList(names);
//		System.out.println("--------Assending--------");
//
//		name.stream().sorted().limit(3).forEach(System.out::println);
//		System.out.println("----------Assending with a---------");
//		name.stream().filter(n -> n.toLowerCase().contains("a")).limit(3).forEach(System.out::println);
//		System.out.println("--------Desending ----------");
//		name.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//		System.out.println("---------First 3 char----------");
//		name.stream().map(n -> n.substring(0, 3)).sorted().forEach(System.out::println);
//		System.out.println("--------less then or = to 4-----------");
//		name.stream().filter(n -> n.length() <= 4).forEach(System.out::println);

	}

}
