package com.aurionpro.test;

import com.aurionpro.model.*;

public class PlayerTest {

	public static void main(String[] args) {
		Player p1 = new Player("Immanuel", 22);
		Player p2 = new Player("Jay", 20);
		Player p3 =new Player("Dhoni",33);

		Player elderPlayer = p1.whoIsElder(p2);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

		printElder(elderPlayer);
	}

	private static void printElder(Player elder) {

		System.out.println("The elder of 2 player is " + elder.getName());
		System.out.println("The details of elder player is ");
		System.out.println("Name of the player is " + elder.getName());
		System.out.println("ID of the player is " + elder.getId());
		System.out.println("Age of the player is " + elder.getAge());

	}

}
