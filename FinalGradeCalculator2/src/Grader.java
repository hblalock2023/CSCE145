/*
 * Lab 02
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 01.28.2020
 */

import java.io.FileNotFoundException;
import java.util.*;

public class Grader {

	public static void main(String[] args) throws FileNotFoundException {
	
		// initializes input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Grader Program!");
		
		// while loop to run program
		boolean quit = false;
		while (!quit)
		{
			System.out.println("Enter a file name or \"quit\" to exit.");
			String input = keyboard.nextLine();
			
			// constructs a new student each time
			Student student = new Student();
			
			// if "quit" quits
			if(input.equalsIgnoreCase("quit"))
			{
				System.out.println("Goodbye!");
				quit = true;
				System.exit(0);
			}		
			
			// reads file and returns the grades
			student.readGradeFile(input);
			System.out.println(student.toString());
		
		}
		
		keyboard.close();
	}
	
}
