/*
 * 09/16/2019
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class DieRoll {

	public static void main(String[] args) {
		// sets up and records user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter how many times you would like to roll the die...");
		int numRolls = keyboard.nextInt();
		
		// sets up the random number generator
		Random rand = new Random();
		
		// initializes the variables used to store which number was rolled
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		
		// sets up the counter for the loop
		int i = 0;
		
		while (i < numRolls)
		{
			// generates a random number from 1 to 6
			// since the nextInt method is inclusive, this technically generates numbers between 
			// 0-5 and adds 1 to them to make it between 1 and 6
			int dieNum = rand.nextInt(6) + 1; 
			System.out.println((i+1) + ". You rolled a " + dieNum);
			
			// increases the counter by one
			i += 1;
			
			// creates a count of which number was rolled
			if (dieNum == 1)
			{
				one += 1;
			}
			if (dieNum == 2)
			{
				two += 1;
			}
			if (dieNum == 3)
			{
				three += 1;
			}
			if (dieNum == 4)
			{
				four += 1;
			}
			if (dieNum == 5)
			{
				five += 1;
			}
			if (dieNum == 6)
			{
				six += 1;
			}
				
		}
		
		// prints out how many rolls each number had
		System.out.println("Your totals:" + '\n' + "One: " + one + '\n' + "Two: " + two + '\n' + "Three: " + three + '\n' + 
				"Four: " + four + '\n' + "Five: " + five + '\n' + "Six: " + six);
	}

}
