/*
 * 10/02/2019
 * Lab 11 
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class DateAndTimeTester {
	
	// initializes global variables
	public static String input = "";
	public static int numMonth = 0;
	public static int numDay = 0;
	public static int numHour = 0;
	public static int numMinute = 0;
	
	public void run() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a date and time (in the format MM/DD hh:mm) and I will determine if it is valid.");
		input = keyboard.nextLine();
		
		isValid(); // calls the isValid function

		// determines whether or not the date is valid based on what the isValid() function returns
		if (isValid() == true)
		{
			System.out.println("The date and time are valid!");
		}
		else if (isValid() == false)
		{
			System.out.println("The date and time are not valid.");
		}
		
		// gives the user the option to quit or keep going
		System.out.println("Would you like to exit? Type \"Quit\" to exit or press [ENTER] to continue.");
		String quit = keyboard.nextLine();
		
		// if user wants to quit, the program stops
		if (quit.equalsIgnoreCase("Quit"))
		{
			System.out.println("Goodbye.");
			System.exit(0);
		}
		else
		{
			run(); // calls the run method
		}
		
		keyboard.close();		
	}
	
	public boolean isValid() {
		// calls the isValidDate and isValidTime methods
		isValidDate();
		isValidTime();
		
		// returns true if both isValidDate and isValidTime return true
		if (isValidDate() == true && isValidTime() == true)
		{
			return true; 
		}
		
		// defaults to false
		return false;
	}
	
	public boolean isValidDate() {
		// calls the getMonth and getDay methods
		getMonth();
		getDay();
		
		// makes sure the date is valid
		if (numMonth >= 1 && numMonth <= 12) // the month has to be between 1 and 12
		{
			if (numMonth == 4 || numMonth == 6 || numMonth == 9 || numMonth == 11) // if the month has 30 days
			{
				if (numDay >= 1 && numDay <= 30)
				{
					return true;
				}
			}
			else if (numMonth == 2) // if the month is February
			{
				if (numDay >= 1 && numDay <= 28)
				{
					return true;
				}
			}
			else {
				if (numDay >= 1 && numDay <= 31) // every other month
				{
					return true;
				}
			}
		}
		
		// defaults to false
		return false;
	}

	public boolean isValidTime() {
		// calls the getHour and getMinute methods
		getHour();
		getMinute();
		
		if (numHour >= 1 && numHour <= 12)
		{
			if (numMinute >= 0 && numMinute <= 59)
			{
				return true;
			}
		}
			
		// defaults to false
		return false;
	}
	
	public void getMonth() {
		String [] date = input.split(" "); // splits the string at the space into a 2-value array
		String [] month = date[0].split("/"); // splits the first value in the array at the "/" into another 2-value array
	
		numMonth = Integer.parseInt(month[0]); // the first value of the second array would be the month
	}
	
	public void getDay() {
		String [] date = input.split(" "); // splits the string at the space into a 2-value array
		String [] day = date[0].split("/"); // splits the first value in the array at the "/" into another 2 -value array
	
		numDay = Integer.parseInt(day[1]); // the second value of the second array would be the day
	}

	public void getHour() {
		String [] time = input.split(" "); // splits the string at the space into a 2-value array
		String [] hour = time[1].split(":"); // splits the first value in the array at the ":" into another 2 -value array
	
		numHour = Integer.parseInt(hour[0]); // the first value of the second array would be the hour
	}

	public void getMinute() {
		String [] time = input.split(" "); // splits the string at the space into a 2-value array
		String [] minute = time[1].split(":"); // splits the first value in the array at the ":" into another 2-value array
	
		numMinute = Integer.parseInt(minute[1]); // the second value of the second array would be the minutes
	}

}
