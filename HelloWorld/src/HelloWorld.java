/*
 * 08/27/2019
 * Hadley Blalock
 * CSCE 145 
 * Section 008
 */

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// prints the line "Hello World"
		System.out.println("Hello World");
		// prints a question
		System.out.println("What is your name?");
		// gets input from the user
		Scanner keyboard = new Scanner(System.in);
		// assigns user input to the variable "name"
		String name = keyboard.nextLine();
		// prints out a greeting and the input name
		System.out.println("Greetings! "+name);
		
		//prints a question
		System.out.println("How many cats do you have?");
		// gets user input and assigns the value to the variable "numCats"
		int numCats = keyboard.nextInt();
		// prints a short quip about the input number of cats
		System.out.println("How does one live with "+numCats+" cats?");
	}
	
}
