package com.aurionpro.model;

public class TicTacToe {
	char board[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8' };
	public boolean check[] = { false, false, false, false, false, false, false, false, false };
	public static int count = 0;

	public void displayBoard() {
		System.out.println("  " + board[0] + "   |   " + board[1] + "   |\t   " + board[2]);
		System.out.println("--------------------------");
		System.out.println("  " + board[3] + "   |   " + board[4] + "   |\t   " + board[5]);
		System.out.println("--------------------------");
		System.out.println("  " + board[6] + "   |   " + board[7] + "   |\t   " + board[8]);

	}

	public int playeGame(int position, String player) {
		int key;
		if (player == "x") {
			this.board[position] = 'x';
			this.check[position] = true;
			displayBoard();
		} else {
			this.board[position] = 'o';
			this.check[position] = true;
			displayBoard();
		}
		count++;
		key = (checkWhoWins(position, player));// we have written this outside because both if and else requires i
		return key;
	}

	public boolean checkVisited(int position) {
		if (check[position] == false)
			return false;
		return true;

	}

	private int checkWhoWins(int position, String player) {
		if (player == "x") {
			if ((board[0] == board[1] && board[0] == board[2]) || (board[3] == board[4]) && (board[4] == board[5])
					|| (board[6] == board[7]) && (board[7] == board[8])) {
				System.out.println("Player 1 wins");
				return -1;
			} else if ((board[0] == board[3] && board[3] == board[6])
					|| (board[1] == board[4]) && (board[4] == board[7])
					|| (board[2] == board[5]) && (board[7] == board[8])) {
				System.out.println("Player 1 wins");
				return -1;
			} else if ((board[0] == board[4] && board[4] == board[8])
					|| (board[2] == board[4]) && (board[4] == board[6])) {
				System.out.println("Player 1 wins");
				return -1;
			}

		} // x finished
		else if ((board[0] == board[1] && board[0] == board[2]) || (board[3] == board[4]) && (board[4] == board[5])
				|| (board[6] == board[7]) && (board[7] == board[8])) {
			System.out.println("Player 2 wins");
			return -1;
		} else if ((board[0] == board[3] && board[3] == board[6]) || (board[1] == board[4]) && (board[4] == board[7])
				|| (board[2] == board[5]) && (board[7] == board[8])) {
			System.out.println("Player 2 wins");
			return -1;
		} else if ((board[0] == board[4] && board[4] == board[8]) || (board[2] == board[4]) && (board[4] == board[6])) {
			System.out.println("Player 2 wins");
			return -1;
		} // o finished

		if (count >= 9) {
			System.out.println("Draw");// to check is its draw or not
			return -1;
		}
		return 1;
	}
}
