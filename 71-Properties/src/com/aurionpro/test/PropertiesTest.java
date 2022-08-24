package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader r = new FileReader("./config/db.properties");
			Properties p = new Properties();
			p.load(r);

			// System.out.println(p);
			System.out.println(p.getProperty("user"));
			System.out.println(p.getProperty("password"));
			System.out.println(p.getProperty("localhost"));

			System.out.println(p.isEmpty());

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
