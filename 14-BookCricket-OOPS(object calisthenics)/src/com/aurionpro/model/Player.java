package com.aurionpro.model;

import java.util.*;

public class Player {
	public static int p1Score;
//	public static String wineer;
	private String name;
	private int score = 0;
	private int turn;

	public static void displayMathHighlights(Player[] p) {
		System.out.println("\n**** Displaying Match Highlights ****");
		System.out.println("----------------------------------------");
		System.out.println("Details of player "+p[0].name+" and "+p[1].name);
		System.out.println("Scores:		"+ p[0].score+ "|" + p[1].score);
		System.out.println("Turns:		"+ p[0].turn+ "|" + p[1].turn);
		System.out.println("----------------------------------------");
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public String getName() {
		return name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void player1(){
		System.out.println(name + " should play");
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to open book");
		int openBook = sc.nextInt();
		int point = 1;
		int randomPage;
		while (point != 0 && openBook == 1){
			turn++;
			randomPage = rand.nextInt(300);
			point = randomPage % 7;
			this.score = this.score + point;
			System.out.println("Page Number:" + randomPage + " Point : " + point + " Score:" + this.score+"\n");
			if (point != 0){
				System.out.println("Enter 1 to open book");
				openBook = sc.nextInt();
				while (openBook != 1){
					System.out.println("Please enter only 1 to continue");
					System.out.println("Enter 1 to open book");
					openBook = sc.nextInt();
				}
			} else
				System.out.println("oops your Point is :" + point + " and your final score is " + this.score+"\n");

		}

	}

	public void player2(){
		System.out.println(name + " should start  playing \n");
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to open book");
		int openBook = sc.nextInt();
		int point = 1;
		int randomPage;
		while (point != 0 && openBook == 1 && this.score <= Player.p1Score) {
			// System.out.println("Enter 1 to open book");
			turn++;
			randomPage = rand.nextInt(300);
			point = randomPage % 7;
			this.score = this.score + point;
			System.out.println("Page Number:" + randomPage + " Point : " + point + " Score:" + this.score);
			if (point != 0 && this.score<=Player.p1Score) {
				System.out.println("Enter 1 to open book");
				openBook = sc.nextInt();
				while(openBook!=1) {
					System.out.println("Please enter only 1 to continue");
					System.out.println("Enter 1 to open book");
					openBook = sc.nextInt();
					break;
				}

			} if(point ==0)
				System.out.println("oops your Point is :" + point + " and your final score is " + this.score);

		}

	}

	public static void checkWhowins(Player[] p) {
		if (p[0].getScore() > p[1].getScore())
			System.out.println(" Congratulation " + p[0].getName() + " you won the game in " + p[0].getTurn() + " turns");
		else if (p[0].getScore() < p[1].getScore())
			System.out.println(" Congratulation " + p[1].getName() + " you won the game in " + p[1].getTurn() + " turns");
		else if (p[0].getScore() == p[1].getScore()) {
			if (p[0].getTurn() > p[1].getTurn())
				System.out.println(
						" Congratulation " + p[0].getName() + " you won the game in " + p[0].getTurn() + " turns");
			if (p[0].getTurn() < p[1].getTurn())
				System.out.println(
						" Congratulation " + p[0].getName() + " you won the game in " + p[0].getTurn() + " turns");
			if (p[0].getTurn() == p[1].getTurn())
				System.out.println("It is a draw between " + p[0].getName() + " and " + p[1].getName());

		}

	}
}
