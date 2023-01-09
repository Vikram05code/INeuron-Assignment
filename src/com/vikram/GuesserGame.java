package com.vikram;
import java.util.*;

class Guesser{
	int guessNum;
	
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser Kindly guess the number");
		guessNum = sc.nextInt();
		
		return guessNum;
	}
}

class Player{
	int guessNum;
	
	int guessNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum = sc.nextInt();
		return guessNum;
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}
	
	void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
		
	}
	
	void compare() {
		if(numFromGuesser==numFromPlayer1) {
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) {
				System.out.println("All players won the game");
				System.out.println("Game End!!!!!!");
			}
			else if(numFromGuesser==numFromPlayer2) {
				System.out.println("Player1 and player2 won the game");
				System.out.println("Game End!!!!!!");
			}
			else if(numFromGuesser==numFromPlayer3) {
				System.out.println("player1 and player3 won the game");
				System.out.println("Game End!!!!!!");
			}
			else {
				System.out.println("player1 won the game");
				System.out.println("Game End!!!!!!");
			}
		}
		else if(numFromGuesser==numFromPlayer2) {
			 if(numFromGuesser==numFromPlayer3) {
				 System.out.println("player2 and player3 won the game");
				 System.out.println("Game End!!!!!!");
			 }
			 else {
				 System.out.println("player2 won the game");
				 System.out.println("Game End!!!!!!");
			 }
		}
		else if(numFromGuesser==numFromPlayer3) {
			System.out.println("player3 won the game");
			System.out.println("Game End!!!!!!");
		}
		else {
			System.out.println("game lost try again");
			System.out.println("Game End!!!!!!");
		}
	}
	
}


public class GuesserGame {
	
   public static void main(String[] args) {
	   
	   Scanner sc = new Scanner(System.in);
	   Umpire ump = new Umpire();
	   
	   while(true) {
		   System.out.println("Do you want to play the Game?");
		   System.out.println("Type 1 for yes 0 for No"); 
		   int input = sc.nextInt();
		   if(input==1) {
			   ump.collectNumFromGuesser();
			   ump.collectNumFromPlayer();
			   ump.compare();
		   }
		   else if(input==0) {
			   System.out.println("Thank you! we will miss you");
			   break;
		   }
		   else {
			   System.out.println("kindly choose between 1 and 0 only");
		   }
	   }
   }
}
