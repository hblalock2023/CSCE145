/*
 * 09/04/2019
 * Written by Hadley Blalock
 * CSE 145
 * Section 008 
 */

import java.util.Scanner;

public class InfoCollect {
	
	public static void main(String[] args) {
		// introduces the program and sets up input
		System.out.println("I would like to learn a little bit about you, so make sure to answer these questions properly!");
		Scanner keyboard = new Scanner(System.in);
		
		// prints out questions and stores the responses as their proper types
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println("What is your age?");
		int age = keyboard.nextInt();
		System.out.println("What is your height (in meters)?");
		double height = keyboard.nextDouble();
		keyboard.nextLine();
		System.out.println("What is your blood type?");
		String bloodType = keyboard.nextLine();
		System.out.println("Are you a cat-person (true of false)?");
		String catPerson = keyboard.nextLine();
		System.out.println("Are you a dog-person (true of false)?");
		String dogPerson = keyboard.nextLine();
		System.out.println("Are you a shape-shifting reptilian creature (true of false)?");
		String shapeShiftingReptile = keyboard.nextLine();
		System.out.println("How much gold do you have buried on your land (in kilograms)?");
		double gold = keyboard.nextDouble();
		
		// prints outs the information the user input in a list form
		System.out.println("Name: " + name + '\n' + "Age: " + age + '\n' + "Height: " + height + " m" + '\n' + 
				"Blood Type: " + bloodType + '\n' + "Cat Person: " + catPerson + '\n' + "Dog Person: " + dogPerson 
				+ '\n' + "Shape-Shifting Reptile: " + shapeShiftingReptile + '\n' + "Buried Gold: " + gold + " kg");
	}

}
