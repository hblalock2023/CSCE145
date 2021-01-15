/*
 * 10/16/2019
 * Homework 04
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class CoffeeTester {

	public static void main(String[] args) {
		// initializes input
		Scanner keyboard = new Scanner(System.in);
		
		// declares two instances of the coffee class
		Coffee coffee01 = new Coffee();
		Coffee coffee02 = new Coffee();
		
		// gets user input for the attributes of the first coffee
		System.out.println("Welcome to the Coffee Hour!");
		System.out.println("What is the name of the first coffee?");
		coffee01.setName(keyboard.nextLine());
		System.out.println("What's its caffeine content?");
		coffee01.setCaffeineContent(keyboard.nextInt());
		keyboard.nextLine();
		
		// gets user input for the attributes of the second coffee
		System.out.println("What is the name of the second coffee?");
		coffee02.setName(keyboard.nextLine());
		System.out.println("What's its caffeine content?");
		coffee02.setCaffeineContent(keyboard.nextInt());
		
		// closes the keyboard
		keyboard.close();
		
		// prints out the name of the coffee and how many coffees are too risky
		System.out.println("It would take " + coffee01.riskyAmount() + " " 
				+ coffee01.getName() + " coffees before it's dangerous to drink more.");
		System.out.println("It would take " + coffee02.riskyAmount() + " " 
				+ coffee02.getName() + " coffees before it's dangerous to drink more.");
		
		// ends the program
		System.out.println("Thanks for coming!");
		System.exit(0);
	}
	
}
