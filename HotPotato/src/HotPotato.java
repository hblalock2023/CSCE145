/*
 * Homework 02
 * Written by Hadley Blalock
 * 02.06.2020
 * CSCE 146 
 * Section 007
 */

import java.util.*;

public class HotPotato {
	
	public static void main(String[] args) {
		CircularList<String> players = new CircularList<String>(); // creates circular linked list of type string		
		Scanner keyboard = new Scanner(System.in);
		
		// sets up game
		System.out.println("Welcome to Hot Potato!");
		int timer = 0;
		Random rand = new Random();

		// starts game
		boolean playing = true;
		while (playing)
		{
			// gets number of players and makes sure it is above 2
			System.out.println("Enter the number of players (must be 2 or more).");
			int numPlayers = keyboard.nextInt();
			if (numPlayers < 2)
			{
				System.out.println("The number of players must be 2 or more.");
				continue;
			}
			keyboard.nextLine();
			// gets each player name
			for (int i = 0; i < numPlayers; i++)
			{
				System.out.println("Enter Player " + (i+1) + "'s name.");
				players.add(keyboard.nextLine());
			}
			
			// sets up timer
			timer = rand.nextInt(180) + 1;
			
			// starts hot potato loop
			players.resetCurrent();
			int playerTime;
			while (timer != 0)
			{
				// checks to see if anyone won
				if (numPlayers == 1)
				{
					System.out.println(players.getCurrent() + " wins!");
					break;
				}
				
				// gets current player's time input and makes sure it is 10 or less
				System.out.println(players.getCurrent() + " Enter a number from 1-10 "
						+ "corresponding to the number of seconds to hold the potato.");
				playerTime = keyboard.nextInt();
				if (playerTime > 10 || playerTime <= 0)
				{
					System.out.println("The number must be between 0 and 10. We will assume you meant 10.");
					playerTime = 10;
				}
				
				// subtracts player time from timer and checks that timer hasn't run out
				if (timer - playerTime > 0)
				{
					timer -= playerTime;
					System.out.println(players.getCurrent() + " is safe for now.");
					//System.out.println("TIMER = " + timer); // prints timer for debugging
					players.goToNext();
				}
				// if timer runs out, player is removed, number of players decreases by one, and timer is reset
				else
				{
					System.out.println("HOT POTATO! " + players.getCurrent() + " is out :(");
					players.removeCurrent();
					numPlayers -= 1;
					timer = rand.nextInt(180) + 1;
					continue;
				}
				
			}
			
			// lets user keep playing or quit
			System.out.println("Would you like to play again? y/n");
			keyboard.nextLine();
			String quit = keyboard.nextLine();
			if (quit.equalsIgnoreCase("y"))
			{
				players.reset();
			}
			else
			{
				System.out.println("Thanks for playing! Goodbye.");
				System.exit(0);
			}
		}
		
		keyboard.close();
	}
}

