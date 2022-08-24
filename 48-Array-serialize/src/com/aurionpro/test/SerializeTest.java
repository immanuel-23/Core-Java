package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class SerializeTest {

	public static void main(String[] args) {
		try {

			Employee[] employees = {
					new Employee(101,"kkkk",50000),
					new Employee(102,"pppp",60000),
					new Employee(103,"hhhhht",70000),
					new Employee(104, "oooooj", 80000)
					
			};

			FileOutputStream file = new FileOutputStream("./lib/test.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employees);
			
			out.close();
			file.close();
			System.out.println("Employee object serialized");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}