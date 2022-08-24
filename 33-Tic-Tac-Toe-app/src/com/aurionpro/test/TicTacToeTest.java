package com.aurionpro.test;

import java.util.*;
import com.aurionpro.model.*;

public class TicTacToeTest {
	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tic-Tac-Toe game!");
		String player1 = "x";
		String player2 = "0";
		System.out.println("Player 1 is x");
		System.out.println("Player 2 is 0");
		System.out.println("Enter position from 0 - 8");
		System.out.println("This is how board looks");
		t.displayBoard();
		int position;
		int repeat = 1;
		System.out.println("Player 1 goes first:");
		int key = 1;// is used to stop the game after wining

		while (key == 1) {
			try {
				System.out.println("Enter your position player 1");
				position = sc.nextInt();
				if (t.checkVisited(position) == false) {
					key = t.playeGame(position, player1);
					repeat = 1;
				} else {
					System.out.println("The entered position is already filled try different position");
					repeat = -1;
				}
				if (key == 1 && repeat == 1) {
					System.out.println("Enter your position player 2");
					position = sc.nextInt();
					if (t.checkVisited(position) == false) {
						key = t.playeGame(position, player2);
						repeat = 1;
					} else {
						System.out.println("The entered position is already filled try different position");
					}

				}
			} catch (Exception e) {
				System.out.println("Enter number between 0-8");
			}

		}
	}

}
