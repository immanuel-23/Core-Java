package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.aurionpro.model.Employee;

public class Deserialize {

	public static void main(String[] args) {
		Employee[] employees = null;
		try {
			
			FileInputStream file = new FileInputStream("./lib/test.bin");
			ObjectInputStream in = new ObjectInputStream(file);
			
			employees = (Employee[]) in.readObject();
			
			in.close();
			file.close();
			System.out.println("Employee object deserialized");
			for(Employee e:employees)
				System.out.println(e);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}