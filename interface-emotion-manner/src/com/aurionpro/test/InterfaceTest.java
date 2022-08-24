package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotional;
import com.aurionpro.model.IMannarable;
import com.aurionpro.model.Man;

public class InterfaceTest {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy= new Boy();
		System.out.println("***********");
		atTheParty(man);
		System.out.println("***********");
		atTheMovie(man);
		System.out.println("***********");
		atTheMovie(boy);
	}

	private static void atTheMovie(IMannarable person) {
		System.out.println("At the movie");
		person.greet();
		person.depart();
		person.hii();
		
	}

	private static void atTheParty(IEmotional person) {
		System.out.println("At the party");
		person.cry();
		person.laugh();
		person.hii();
	}

}
