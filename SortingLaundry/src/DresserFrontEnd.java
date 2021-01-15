/*
 * 10.23.2019
 * Homework 05
 * Written by Hadley Blalock
 * CSCE 145 
 * Section 008
 */

import java.util.*;

public class DresserFrontEnd {

	public static void main(String[] args) {
		// initializes keyboard
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the dresser!");
		
		// creates a new instance of the dresser object
		Dresser aDresser = new Dresser();

		// loops until user enters the command to quit
		boolean quit = false;
		while (!quit)
		{
			// prompts user for what they want to do
			System.out.println("Enter 1: to add an item.");
			System.out.println("Enter 2: to remove an item.");
			System.out.println("Enter 3: to print out the dresser's contents.");
			System.out.println("Enter 0: to quit.");
			int input = keyboard.nextInt();
			keyboard.nextLine();			
			
			// if add
			if (input == 1)
			{
				// initializes a local clothing object
				Clothing inputClothing = new Clothing();
				System.out.println("Enter the type of clothing (can only be undergarment, "
						+ "socks, stockings, top, bottom, or cape).");
				inputClothing.setType(keyboard.nextLine()); // assigns type
				System.out.println("Enter the color of clothing (can only be brown, pink, "
						+ "orange, green, blue, purple, or grey).");
				inputClothing.setColor(keyboard.nextLine()); // assigns color
				
				// adds that clothing item to the dresser
				aDresser.add(inputClothing);
			}
			// if remove
			else if (input == 2)
			{
				System.out.println("Enter the type of clothing you want to remove.");
				String clothingType = keyboard.nextLine(); // inputs type
				System.out.println("Enter the color of the clothing you want to remove.");
				String clothingColor = keyboard.nextLine(); // inputs color
				
				// assigns that type and color to a local clothing object and then 
				// removes that clothing item from the dresser
				Clothing inputClothing = new Clothing(clothingType, clothingColor);
				aDresser.remove(inputClothing);
				
			}
			// if print
			else if (input == 3)
			{
				aDresser.print(); //prints
			}
			// if quit
			else if (input == 0)
			{
				System.out.println("Goodbye.");
				keyboard.close();
				break; // quits
			}
			// if other input - invalid 
			// loops back to start
			else
			{
				System.out.println("Input value is not valid. Try again.");
			}
		}
	}
}
