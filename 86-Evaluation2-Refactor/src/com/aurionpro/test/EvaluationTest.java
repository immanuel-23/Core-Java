package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.aurionpro.model.Country;
import com.aurionpro.model.Region;

public class EvaluationTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Country> countries = countryList();
		List<Region> regions = getRegionList();
		
		for(Region x:regions) {
			int regionId=x.getId();
			List<Country> regionCountries = getCountriesByRegion(countries,regionId);
			regions.get(regionId-1).setCountries(regionCountries);
			System.out.println(x);
		}
		
		
		System.out.println("Enter country code to get country name");
		String countryCode=sc.nextLine();
		String countryDetailsByCode = getCountryDetailsByCode(regions, countryCode);
		
		if(countryDetailsByCode!=null) {
			System.out.println(countryDetailsByCode);
		}
		else {
			System.out.println("Invlaid country code!!");
		}
	}
	
	private static List<Region> getRegionList() {
		List<Region> regions=Arrays.asList(
				new Region(1, "Europe"),
				new Region(2, "Americas"),
				new Region(3, "Asia"),
				new Region(4, "Middle East and Africa")
				);
		return regions;
	}

	private static List<Country> countryList() {
		List<Country> countries=Arrays.asList(
				new Country("IT", "Italy", 1),
				new Country("JP", "Japan", 3),
				new Country("US", "United States of America", 2),
				new Country("CA", "Canada", 2),
				new Country("CN", "China", 3),
				new Country("IN", "India", 3),
				new Country("AU", "Australia", 3),
				new Country("ZW", "Zimbabwe",4),
				new Country("SG", "Singapore", 3),
				new Country("UK", "United Kingdom", 1),
				new Country("FR", "France", 1),
				new Country("DE", "Germany", 1),
				new Country("ZM", "Zambia", 4),
				new Country("EG", "Egypt", 4),
				new Country("BR", "Brazil", 2),
				new Country("CH", "Switzerland", 1),
				new Country("NL", "Netherlands", 1),
				new Country("MX", "Mexico", 2),
				new Country("KW", "Kuwait", 4),
				new Country("IL", "Israel", 4),
				new Country("DK", "Denmark", 1),
				new Country("HK", "HongKong", 3),
				new Country("NG", "Nigeria", 4),
				new Country("AR", "Argentina", 2),
				new Country("BE", "Belgium", 1)
				);
		return countries;
	}

	private static String getCountryDetailsByCode(List<Region> regions, String countryCode) {
		for(Region x:regions) {
			List<Country> regionCountries=x.getCountries();
			List<Country> collect = regionCountries.stream().
				filter(country->country.getCode().equalsIgnoreCase(countryCode))
				.collect(Collectors.toList());
			if(collect.size()!=0) {
				String regionNameByCountry = x.getName();
				return "Country Name :"+collect.get(0).getName() 
						+ "\nRegion Name :"+ regionNameByCountry;
			}
		}
		return null;
	}

	private static List<Country> getCountriesByRegion(List<Country> countries,int id) {
		return countries.stream()
				.filter((country)->country.regionId==id)
				.collect(Collectors.toList());
	}
}
