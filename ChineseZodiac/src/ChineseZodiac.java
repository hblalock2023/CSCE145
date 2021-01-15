/*
 * 09/09/2019
 * Written by Hadley Blalock
 * CSCE Section 008
 */

import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		// Sets up the Scanner to receive user input
		System.out.println("Want to find out what your Chinese Zodiac is? Just enter your birth year!");
		Scanner keyboard = new Scanner(System.in);
		int year = keyboard.nextInt();
		
		// initializes the variables used within the if statements that way 
		//they can be used out side of their closed statement
		int num = 0;
		String animal = "";
		String element = "";
		
		// A nested if statement to determine the zodiac
		if(year >= 1924)
		{
			// Calculates a number between 0-12 based on how many years it's been since 1924 
			// and the remainder when divided by 12
			num = year - 1924;
			num = num % 12;
			
			// the following 12 if statements assign an animal based on the calculated number based on the birth year
			if(num == 0)
			{
				animal = "Rat";
			}
			
			if(num == 1)
			{
				animal = "Ox";
			}
			
			if(num == 2)
			{
				animal = "Tiger";
			}
			
			if(num == 3)
			{
				animal = "Rabbit";
			}
			
			if(num == 4)
			{
				animal = "Dragon";
			}
			
			if(num == 5)
			{
				animal = "Snake";
			}
			
			if(num == 6)
			{
				animal = "Horse";
			}
			
			if(num == 7)
			{
				animal = "Goat";
			}
			
			if(num == 8)
			{
				animal = "Monkey";
			}
			
			if(num == 9)
			{
				animal = "Rooster";
			}
			
			if(num == 10)
			{
				animal = "Dog";
			}
			
			if(num == 11)
			{
				animal = "Pig";
			}
			
			// the following five if statements determine the element based on the animal
			if(num == 2 || num == 3)
			{
				element = "Wood";
			}
		
			if(num == 5 || num == 6)
			{
				element = "Fire";
			}

			if(num == 1 || num == 4 || num == 7 || num == 10)
			{
				element = "Earth";
			}

			if(num == 8 || num == 9)
			{
				element = "Metal";
			}

			if(num == 11 || num == 0)
			{
				element = "Water";
			}

			// prints out the calculated element and animal to complete the zodiac
			System.out.println("Your Chinese Zodiac is: " + element + " " + animal);
		}
		
		// if their birth year is less than 1924 a zodiac cannot be calculated
		else
		{
			// lets the user know that a zodiac cannot be determined
			System.out.println("I'm sorry, but a zodiac cannot be calculated from that year.");
			// ends the program
			System.exit(0);
		}
		

	}

}
