/*
 * Homework 01
 * Written by Hadley Blalock
 * 01.31.2020
 * CSCE 146 
 * Section 007
 */

import java.io.FileNotFoundException;
import java.util.*;

public class ShowcaseGame {

	public static void main(String[] args) throws FileNotFoundException {
		
		// sets up input and showcase
		Scanner keyboard = new Scanner(System.in);
		Showcase showcase = new Showcase();
		
		// playing
		boolean playing = true;
		while (playing)
		{
			System.out.println("Welcome to the Showcase Showdown!");
			System.out.println("Your prizes are:");
			Prize[] prizes = showcase.pickPrizes(); // creates prize array
			
			// prints prize array
			for (int i = 0; i < prizes.length; i++)
			{
				System.out.println(prizes[i].getName());
			}
			
			// takes in guess and compares it to total cost and prints the result of the guess
			System.out.println("You must guess the total cost of the prizes without going over.");
			int totalPrice = showcase.totalPrice(prizes);
			int guessedPrice = keyboard.nextInt();
			System.out.println("You guessed " + guessedPrice + " and the total price was " + totalPrice + ".");
			if (guessedPrice > totalPrice)
			{
				System.out.println("You guessed over! You lose!");				
			}
			else if (guessedPrice < totalPrice && guessedPrice >= 0)
			{
				System.out.println("You guessed under! You Win!");
			}
			else if (guessedPrice == totalPrice)
			{
				System.out.println("You guessed the exact price! CONGRATS! You Win!!");
			}
			else 
			{
				System.out.println("You guessed a negative number, why? You Lose!");
			}
		
			// asks to continue playing or no
			System.out.println("Would you like to play again? Enter 'yes' to continue.");		
			keyboard.nextLine();
			String quit = keyboard.nextLine();
			if (quit.equalsIgnoreCase("Yes"))
			{
				continue;
			}		
			else //quits
			{
				System.out.println("Thanks for playing! Goodbye!");
				System.exit(0);
				break;
			}
			
		}
		

	}

}
