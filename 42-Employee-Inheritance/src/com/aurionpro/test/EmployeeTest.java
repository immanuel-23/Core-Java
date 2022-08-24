package com.aurionpro.test;

import com.aurionpro.model.Accountant;
import com.aurionpro.model.Developer;
import com.aurionpro.model.Employee;
import com.aurionpro.model.ProjectManager;

public class EmployeeTest {

	public static void main(String[] args) {
		ProjectManager pm = new ProjectManager(1,"RAJ",30000);
		Developer devp= new Developer(2,"Immanuel",40000);
		Accountant acc=new Accountant(3,"Ajay",50000);
//		System.out.println("ctc of project manager :"+ pm.calculateAnnualCtc());
//		System.out.println("ctc of Developer :"+ devp.calculateAnnualCtc());
//		System.out.println("ctc of accountant :"+ acc.calculateAnnualCtc());
		System.out.println("************** DETAILS*************");
		System.out.println("PROJECT MANAGER");
		//pm.toString();
		Employee.hii();
		pm.printSalarySlip();
		System.out.println("************** DETAILS*************");
		System.out.println("DEVELOPER");
		devp.printSalarySlip();
		System.out.println("************** DETAILS*************");
		System.out.println("ACCOUNTANT");
		acc.printSalarySlip();
		


	}

}
