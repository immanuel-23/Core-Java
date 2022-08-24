package com.aurionpro.model;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.text.DateFormatter;

public class Employee {
	int id;
	String name;
	double salary;
	Date doj;
	
	DateFormat df= new SimpleDateFormat("MM/dd/yyyy");
	
	public Employee(int id, String name, double salary, String doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		//this.doj = doj;
		
		try {
			this.doj=(Date) df.parse(doj);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}
	
	
}
