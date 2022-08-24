package com.aurionpro.test;

import java.util.Scanner;

import com.aurionpro.model.*;

public class PlayerTest {

	public static void main(String[] args) {
		System.out.println("**********welcome to Book cricke game**********");
		System.out.println("Rules and regulation");
		System.out.println("1)Assume a book of 300 pages\n"
				+ "2)Player 1 opens the book to read a page number (Randomly generated)\n"
				+ "3)Total score of a player = page number % 7 (number % 7 will always be between 0 - 6)\n"
				+ "4)Player 1 continues and keeps adding to the score untill page number results in a 0 score\n"
				+ "5)Player 2 starts the game and tries to beat the score of player 1\n");
		Scanner sc = new Scanner(System.in);
		Player p1 = new Player();
		Player p2 = new Player();
		Player[] p = { p1, p2 };
		System.out.println("Enter the name of player 1:");
		p1.setName(sc.next());
		System.out.println("Enter the name of  player 2:");
		p2.setName(sc.next());
		int startGame;
		System.out.println("Enter 1 to start 0 to Exit");
		startGame = sc.nextInt();
		if (startGame == 1) {
			System.out.println("Game started ");
			p1.player1();
			Player.p1Score = p1.getScore();// in this case we are storing a player one value into static variable to compare with player 2 score
			System.out.println(p2.getName()+" requires "+(p1.getScore()+1) +" to win");
			p2.player2();
			Player.checkWhowins(p);
		} else
			System.out.println("Thanks you for playing");

		Player.displayMathHighlights(p);

	}

}
