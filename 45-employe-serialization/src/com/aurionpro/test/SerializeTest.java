package com.aurionpro.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class SerializeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Employee employee = new Employee(1,"Immanuel",40000);
			FileOutputStream file = new FileOutputStream("test1.txt");
			ObjectOutputStream out =new ObjectOutputStream(file);
			out.writeObject(employee);
			out.close();
			file.close();
			System.out.println("Object serialized");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
