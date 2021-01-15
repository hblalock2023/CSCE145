/*
 * 09/25/2019
 * Homework 03
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class RockPaperScissors {

	public static void main(String[] args) {
		// sets up user input and the random number generator
		System.out.println("Let's play Rock, Paper, Scissors! We'll play best 2 out of 3. Do you think you can beat me?");
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		// initializes the main variables needed
		int overallWinner = 0;
		int playerWins = 0;
		int computerWins = 0;
		int outcome = 0;
		
		// when player wants to continue, playing = true
		boolean playing = true;
		
		//massive while loop for continuing game play
		while (playing)
		{
			for (int j = 3; j > 0; j--)
			{
				System.out.println("What's your move? Enter 'rock', 'paper', or 'scissors'.");
				// takes user input and assigns their move to a numerical value to be compared to computer's move
				String playerThrow = keyboard.nextLine();
				int playerMove = 0;

				if (playerThrow.equalsIgnoreCase("Rock") || playerThrow.equalsIgnoreCase("R"))
				{
					playerMove = 0;
				}
				else if (playerThrow.equalsIgnoreCase("Paper") || playerThrow.equalsIgnoreCase("P"))
				{
					playerMove = 1;
				}
				else if (playerThrow.equalsIgnoreCase("Scissors") || playerThrow.equalsIgnoreCase("S"))
				{
					playerMove = 2;
				}
				else
				{
					System.out.println("That throw is not valid. Your gameplay has been terminated.");
					keyboard.close();
					System.exit(0);
				}
				
				// randomizes the computer's move
				int computerMove = rand.nextInt(3);
				String computerThrow = "";
				
				// assigns computer's move to a throw to be printed out later
				if (computerMove == 0)
				{
					computerThrow = "Rock"; 
				}
				
				if (computerMove == 1)
				{
					computerThrow = "Paper"; 
				}
				
				if (computerMove == 2)
				{
					computerThrow = "Scissors"; 
				}
				
				
				// next set of if statements determines who won the round
				// 0 denotes a tie, 1 denotes a computer win, -1 denotes a user win
				// if player throws rock
				if (playerMove == 0)
				{
					if (computerMove == 0)
					{
						outcome = 0;
					}
					
					if (computerMove == 1)
					{
						outcome = 1;
					}
					
					if (computerMove == 2)
					{
						outcome = -1;
					}
				}
				//if player throws paper
				if (playerMove == 1)
				{
					if (computerMove == 0)
					{
						outcome = -1;
					}
					
					if (computerMove == 1)
					{
						outcome = 0;
					}
					
					if (computerMove == 2)
					{
						outcome = 1;
					}
				}
				// if player throws scissors
				if (playerMove == 2)
				{
					if (computerMove == 0)
					{
						outcome = 1;
					}
					
					if (computerMove == 1)
					{
						outcome = -1;
					}
					
					if (computerMove == 2)
					{
						outcome = 0;
					}
				}
				
				String winner = "";
				
				// figures out who won the round
				if (outcome == 0)
				{
					winner = "Tie.";
				}
				
				if (outcome == 1)
				{
					winner = "I win!";
					computerWins += 1;
				}
				
				if (outcome == -1)
				{
					winner = "You win...";
					playerWins += 1;
				}
				
				// calculates additive total
				overallWinner = overallWinner + outcome;
				
				System.out.println(playerThrow + " v " + computerThrow + ". " + winner);
			}
			
			
			System.out.println("You have won " + playerWins + " rounds and I have won " + computerWins + " rounds.");
			
			// based on the sum of the games
			// 0 means tie, because the +1 and -1 balanced out
			if (overallWinner == 0)
			{
				System.out.println("It's a tie...");
			}
			// since the computer wins was +1, any value over 0 means the computer won
			if (overallWinner > 0)
			{
				System.out.println("I won!! Better luck next time :)");
			}
			
			// since player wins was -1, any value below 0 means the player won
			if (overallWinner < 0)
			{
				System.out.println("You won.");
			}
			
			System.out.println("Would you like to play again? Y/N.");
			String playerAnswer = keyboard.nextLine();
			
			// resets game values before loop starts again
			if (playerAnswer.equalsIgnoreCase("Yes") || playerAnswer.equalsIgnoreCase("Y"))
			{
				playerWins = 0;
				computerWins = 0;
				outcome = 0;
				overallWinner = 0;
			}
			
			// exits while loop, which exits game play
			if (playerAnswer.equalsIgnoreCase("No") || playerAnswer.equalsIgnoreCase("N"))
			{
				System.out.println("Thank you for playing!");
				keyboard.close();
				playing = false;
			}
		}
	}

}
