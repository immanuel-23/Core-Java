package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aurionpro.model.Countries;
import com.aurionpro.model.Regions;

public class RegionCountryTest {

	//private static ArrayList<Regions> europe;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Regions> regions = new ArrayList<>();
		regions.add(new Regions(1, "Europe"));
		regions.add(new Regions(2, "Americas"));
		regions.add(new Regions(3, "Asia"));
		regions.add(new Regions(4, "Middle east and asia"));

		ArrayList<Countries> countries = new ArrayList<>();
		countries.add(new Countries("IT", "Italy", 1));
		countries.add(new Countries("JP", "Japan", 3));
		countries.add(new Countries("US", "United States of America", 2));
		countries.add(new Countries("CA", "Canada", 2));
		countries.add(new Countries("CN", "China", 3));
		countries.add(new Countries("IN", "India", 3));
		countries.add(new Countries("AU", "Australia", 3));
		countries.add(new Countries("ZW", "Zimbabwe", 4));
		countries.add(new Countries("SG", "Singapore", 3));
		countries.add(new Countries("UK", "United Kingdom", 1));
		countries.add(new Countries("FR", "France", 1));
		countries.add(new Countries("DE", "Germany", 1));
		countries.add(new Countries("ZM", "Zambia", 4));
		countries.add(new Countries("EG", "Egypt", 4));
		countries.add(new Countries("BR", "Brazil", 2));
		countries.add(new Countries("CH", "Switzerland", 1));
		countries.add(new Countries("NL", "Netherlands", 1));
		countries.add(new Countries("MX", "Mexico", 2));
		countries.add(new Countries("IL", "Israel", 4));
		countries.add(new Countries("DK", "Denmark", 1));
		countries.add(new Countries("HK", "HongKong", 3));
		countries.add(new Countries("NG", "Nigeria", 4));
		countries.add(new Countries("AR", "Argentina", 2));
		countries.add(new Countries("BE", "Belgium", 1));
		System.out.println("List of countrys in europe");
		List<Countries> europeRegion = countries.stream()
												.filter(n -> n.getCountryId() == 1)
												.collect(Collectors.toList());

		europeRegion.forEach(System.out::println);
		System.out.println(
				"*************************************************************************************************");
		System.out.println("List of countrys in Americas");

		List<Countries> americas = countries.stream()
											.filter(n -> n.getCountryId() == 2)
											.collect(Collectors.toList());

		americas.forEach(System.out::println);
		
		System.out.println(
				"*************************************************************************************************");

		System.out.println("List of countrys in Asia");
		List<Countries> asias = countries.stream()
										 .filter(n -> n.getCountryId() == 3)
										 .collect(Collectors.toList());
		asias.forEach(System.out::println);
		System.out.println(
				"*************************************************************************************************");
		System.out.println("List of countrys in Middle east");
		
		List<Countries> middleEast = countries.stream()
										      .filter(n -> n.getCountryId() == 4)
										      .collect(Collectors.toList());
		middleEast.forEach(System.out::println);
		System.out.println(
				"*************************************************************************************************");

		System.out.println("Total no of country in Europe is :" + europeRegion.size());
		System.out.println("Total no of country in Asia is :" + asias.size());
		System.out.println("Total no of country in Americas is :" + americas.size());
		System.out.println("Total no of country in Middle eadt is :" + middleEast.size());
		Scanner sc = new Scanner(System.in);
		int Start = 1;
		String userInput;
		System.out.println("Enter country code");
		userInput = sc.next();
//			List<Countries> find =countries.stream()
//					.filter(n -> n.getCode()==userInput.toUpperCase())
//					.collect(Collectors.toList());
//			System.out.println(find.toString());
//			System.out.println(find.size());
//			System.out.println("Enter 1 to start and 0 to continue");

//			Start =sc.nextInt();
		for (Countries c : countries) {
			if (userInput.equals(c.getCode())) {
				System.out.println("Country name:" + c.getCountryName());
				System.out.println("Country Id:" + c.getCountryId());
				System.out.println("Country Code:" + c.getCode());
				
			}
		}

	}

}
