package com.aurionpro.test;

import com.aurionpro.model.CustomerRepository;
import com.aurionpro.model.Irepository;
import com.aurionpro.model.OrderRepository;
import com.aurionpro.model.ProductRepository;

public class RepositoryTest {
	public static void main(String args[]) {
		Irepository customer = new CustomerRepository();
		printDetails(customer);
		System.out.println("*******************************************");
		Irepository order= new OrderRepository();
		printDetails(order);
		System.out.println("*******************************************");
		Irepository product= new ProductRepository();
		printDetails(product);



		
	}

	private static void printDetails(Irepository repo) {// run time polymorphisam
		repo.create();
		repo.delete();
		repo.read();
		repo.update();
	}

}
