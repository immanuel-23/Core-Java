package com.aurionpro.test;

import java.time.LocalDate;
import java.time.LocalTime;

import com.aurionpro.model.Employee;

public class DateTimeTest {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now();
		System.out.println("Current date:" + ld1.now());
		LocalTime lt1 = LocalTime.now();
		System.out.println("Current time:" + lt1);
		
		Employee e1= new Employee(1,"Immanuel",300000,"06/06/2022");
		System.out.println(e1.toString());

	}

}
