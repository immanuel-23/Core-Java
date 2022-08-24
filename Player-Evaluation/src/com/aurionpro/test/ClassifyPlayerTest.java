package com.aurionpro.test;

import java.util.ArrayList;

import com.aurionpro.model.*;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
		// System.out.println("hii");
		ArrayList<Player> p = new ArrayList<Player>();
		
		p.add(new Player(1, "Immanuel", 101, 6000, 190));
		p.add(new Player(2, "Raj", 0, 3501, 105));
		p.add(new Player(2, "Raj", 90, 3501, 105));
		p.add(new Player(4, "Dhoni", 49, 600, 10));
		p.add(new Player(5, "Bhumra", 20, 200, 31));
		p.add(new Player(6, "Rahul", 12, 178, 20));

		ClassifyPlayers obj = new ClassifyPlayers(p);

		ArrayList<Player> aLister = obj.getAlister();

		System.out.println("A list\n");

		for (Player a : aLister) {
			System.out.println(a.toString());
		}

		ArrayList<Player> bLister = obj.getBlister();

		System.out.println("B list\n");

		for (Player b : bLister) {
			System.out.println(b.toString());
		}

		ArrayList<Player> cLister = obj.getClister();

		System.out.println("c list\n");
		for (Player c : cLister) {

			System.out.println(c.toString());
		}
//		int index=obj.getMax();
//		System.out.println("\nMaximum of players is "+p[index].getName()+" with details ");
//		System.out.println(p[index].toString()+"\n");
//		index=obj.getMin();
//		System.out.println("Mainimum of players is "+p[index].getName()+" with details ");
//		System.out.println(p[index].toString());

	}
}
