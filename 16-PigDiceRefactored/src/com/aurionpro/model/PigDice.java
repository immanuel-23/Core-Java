package com.aurionpro.model;

import java.util.*;

public class PigDice {
	private int turnScore;
	private int totalFinalScore;
	public int turn=1;
	

	Random rand = new Random();

	public int getTurnScore() {
		return turnScore;
	}

	public int getTotalFinalScore() {
		return totalFinalScore;
	}

	public int getTurn() {
		return turn;
	}
	
	public void setTurnScore(int turnScore) {
		this.turnScore = turnScore;
	}

	public void setTotalFinalScore(int totalFinalScore) {
		this.totalFinalScore = totalFinalScore;
	}
	
	public void incrementTurn() {
		this.turn++;
	}

	public int generateRandom() {
		Random rand = new Random();
		return (1+rand.nextInt(6));		
	}
	public static void displayDetails(PigDice p) {

		System.out.println("****************************************");
		System.out.println("TURN :" + (p.getTurn()));
		System.out.println("TURN SCORE:" + p.getTurnScore());
		System.out.println("FINAL SCORE:" + p.getTotalFinalScore());
		System.out.println("****************************************\n");

	}

	public static void hold(PigDice p) {
		System.out.println("SCORE AFTER HOLD");
		displayDetails(p);
		p.setTurnScore(0);
		p.incrementTurn();

	}

	public static int roll(PigDice p) {
		int dice = p.generateRandom();
		System.out.println("DICE:" + dice);
		int score = 0;
		if (dice != 1) {
			score = dice + score;
			p.setTurnScore(p.getTurnScore()+score);
		}
		if (dice == 1) {
			reset(p);
		}
		return score;

	}

	public  static void reset(PigDice p) {
		System.out.println("OOPS YOUR SCORE IS 1 YOU LOST THE TURN SCORE ");
		p.incrementTurn();
		int turnScore = 0;
		//displayDetails(p);
		p.setTurnScore(turnScore);

	}
	public  static void starTurn(PigDice p) {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("Enter your choice : Roll or Hold ?(r/h) ");
		input = sc.next();
		if (input.equalsIgnoreCase("r")) {
			int score = PigDice.roll(p);
			p.setTotalFinalScore(score+p.getTotalFinalScore());
			PigDice.displayDetails(p);
		}
		if (input.equalsIgnoreCase("h"))
			PigDice.hold(p);
	}

}
