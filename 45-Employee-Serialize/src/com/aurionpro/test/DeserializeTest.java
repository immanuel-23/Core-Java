package com.aurionpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.aurionpro.model.Employee;

public class DeserializeTest {
	public static void main(String args[]) {
		Employee employee=null;
		try {
			FileInputStream file = new FileInputStream("test.txt");
			ObjectInputStream out =new ObjectInputStream(file);
			employee=(Employee)out.readObject();
			out.close();
			file.close();
			System.out.println(employee.getId());
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
