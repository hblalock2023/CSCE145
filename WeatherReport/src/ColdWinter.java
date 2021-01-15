/*
 * 09/23/2019
 * Lab 09
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class ColdWinter {
	
	public static void main(String[] args) {
		// sets up user input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the 'Below-Average Temperature Calculator'");
		
		// creates an array of doubles that can hold ten values
		double[] daysArray = new double[10]; 
		
		// takes in user input to fill the array
		for(int i = 0; i < daysArray.length; i++)
		{
			System.out.println("Please enter the temperature for Day " + (i + 1) + ". Please enter number as a decimal.");
			double temp = keyboard.nextDouble();			
			daysArray[i] = temp;			
		}
		
		// closes the Scanner
		keyboard.close();
		
		//initializes the sum variable
		double sum = 0.0;
		
		// calculates the sum of the values in the array
		for(int i = 0; i < daysArray.length; i++)
		{
			sum = daysArray[i] + sum;		
		}
		
		// calculates the average of the array
		double avgTemp = sum/daysArray.length;
		
		// prints out the average and introduction to the days below the average
		System.out.println("The average temperature was " + avgTemp + " degrees.");
		System.out.println("The days that were below that average were:");
		
		// tests to see which values in the array are less than the average and prints them out
		for(int i = 0; i < daysArray.length; i++)
		{
			if(daysArray[i] < avgTemp)
			{
				System.out.println("Day " + (i + 1) + " at " + daysArray[i] + " degrees.");
			}
		}
	}

}
