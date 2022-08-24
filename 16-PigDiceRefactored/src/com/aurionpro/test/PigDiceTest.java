package com.aurionpro.test;

import java.util.*;
import com.aurionpro.model.*;

public class PigDiceTest {

	public static void main(String[] args) {

		System.out.println("Lets play pig dice");
		PigDice p = new PigDice();
		PigDice.displayDetails(p);
		while ((p.getTotalFinalScore()) < 20) {
			PigDice.starTurn(p);
		}
		System.out.println("Finished the game in " + p.getTurn() + " turns");

	}

	

	
}
