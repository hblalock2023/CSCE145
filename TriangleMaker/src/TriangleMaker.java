/*
 * 09/18/2018
 * Lab 08
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class TriangleMaker {

	public static void main(String[] args) {
		// sets up and records user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the size of the traingle you want.");
		int size = keyboard.nextInt();
		keyboard.close();
		
		// if the input number is zero or negative
		if (size < 0)
		{
			System.out.println("That is not a valid size.");
			System.exit(0);
		}
		
		// builds the top half of the triangle
		for (int i = 1; i <= size; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// builds the bottom half of the triangle
		// the reverse of the first loop
		for (int i = size; i > 1; i--)
		{
			for (int j = 2; j <= i; j++) // j starts at 2 since the peak line has already been printed
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
