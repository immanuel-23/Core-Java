package com.aurionpro.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.plaf.synth.Region;

import com.aurionpro.model.Regions;

public class RegionTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated me
//		FileInputStream fis=new FileInputStream("./config/Region.txt");       
//		Scanner sc=new Scanner(fis);    //file to be scanned  
//		ArrayList<Regions> regions = new ArrayList<>();
//		ArrayList<String> arr= new ArrayList<String>();
//		
//		while(sc.hasNextLine())  
//		{  
//			StringTokenizer st = new StringTokenizer(sc.nextLine());
//	         System.out.println(st.nextToken()); 
//	         
//		}  
		List<String> result = new ArrayList<>();
		BufferedReader br = null;

		try {

			br = new BufferedReader(new FileReader("./config/Region.txt"));

			String line;
			while ((line = br.readLine()) != null) {
				result.add(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				br.close();
			}

		}
		
		System.out.println(result);
		
		List<String> country = new ArrayList<>();

		try {

			br = new BufferedReader(new FileReader("./config/Country.txt"));

			String line;
			while ((line = br.readLine()) != null) {
				country.add(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				br.close();
			}

		}
		System.out.println(country);
//		StringTokenizer st = new StringTokenizer("HEY ");
//
//		System.out.println(country);
//		for(String c: country) {
//			st = new StringTokenizer(c);
//		}
//		
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextElement());
//		}
//		System.out.println("List of countrys in europe");
		
//		
		
		
		
		
	}

}
