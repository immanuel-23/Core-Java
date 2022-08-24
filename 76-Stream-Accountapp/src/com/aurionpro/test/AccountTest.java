package com.aurionpro.test;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import com.aurionpro.model.*;

public class AccountTest {
	public static void main(String args[]) {

		Account [] account= {
									   new Account(1, "Immanuel", 4000),
									   new Account(12, "rOHIT", 4000),
									   new Account(13, "Raj", 4000)
		};
		
		Stream<Account>stream1=Arrays.stream(account);
		Optional<Account> minbalance;
		
		minbalance=stream1.min(Comparator.comparingDouble(n->n.getSalary()));
		minbalance.ifPresent(System.out::println);

	}

}
