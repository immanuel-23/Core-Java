package com.aurionpro.test;
import java.util.*;
public class Bcg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****Welcome to Book Cricket game****");
		System.out.println("Rules and regulation for book cricket game");
		System.out.println("1)Assume a book of 300 pages\n"+"2)Player 1 opens the book to read a page number (Randomly generated)\n"
		+"3)Total score of a player = page number % 7 (number % 7 will always be between 0 - 6)\n"+"4)Player 1 continues and keeps adding to the score untill page number results in a 0 score\n" 
		+"5)Player 2 starts the game and tries to beat the score of player 1\n"+"6)In case of a tie, check the number of turns(player with lesser turns is winner)\n"+"7)Show the winner of the game.");
		int start_game;
		int random_page;
		Random rand=new Random();
		System.out.println("Enter 1 to start game and 0 to exit:");
		start_game=sc.nextInt();
		if(start_game==1) {
			System.out.println("Enter the name of first player:");
			String first_player=sc.next();
			System.out.println("Enter the name of second player:");
			String second_player=sc.next();
			System.out.println("Player 1 goes first :"+first_player);
			int open_book=1;
			int counter1=1;
			int score1=0;
			int point=1;
			while(open_book==1 && counter1<=5 && point!=0) {
				random_page=rand.nextInt(300);
				 point =random_page%7;
				score1=score1+point;
				System.out.println("Enter 1 to open book");
				open_book=sc.nextInt();
				if(point!=0 && counter1<=4) {
					System.out.println("Random page: "+random_page+" point: "+point+" Score :"+score1);
				}
				if(point==0){
					System.out.println("!!!!!!opps!!!!!!");
					System.out.println("Random page: "+random_page+" point: "+point+" Score :"+score1);
				}
				counter1++;
			}
			System.out.println(second_player+" requires "+(score1+1)+" to win");
			System.out.println("Player 2 turn :"+ second_player);
			int counter2=1;
			int score2=0;
			int point2=1;
			while(open_book==1 && counter2<=5  && point2!=0) {
				random_page=rand.nextInt(300);
				 point2 =random_page%7;
				score2=score2+point2;
				System.out.println("Enter 1 to open book");
				open_book=sc.nextInt();
				if(point2!=0 && counter2<=5) {
					System.out.println("Random page: "+random_page+" point: "+point2+" Score :"+score2);
					
				}
				if(point2==0){
					System.out.println("!!!!!!opps!!!!!!");
					System.out.println("Random page: "+random_page+" point: "+point2+" Score :"+score2);
				}
				counter2++;
			}
			if(score1>score2) {
				System.out.println("The winner is "+first_player);
			}
			else if(score1==score2){// if the game is tie
				
				if(counter1>counter2) {
					System.out.println("The winner is "+first_player);
				}
				else {
					System.out.println("The winner of match is "+second_player);
				}
			}
			else {
				System.out.println("The winner of match is "+second_player);//if second wins

			}
		
	}else {
		System.out.println("Thank you");
	}
}
}
