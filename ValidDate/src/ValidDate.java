/*
 * 09/12/2019 
 * Written by Hadley Blalock
 * CSCE 145 
 * Section 008
 */

import java.util.Scanner;

public class ValidDate {

	public static void main(String[] args) {
		//Sets up user input
		System.out.println("Please enter a date in the format month/day/year.");
		Scanner keyboard = new Scanner(System.in);
		String date = keyboard.nextLine();
		
		//Finds where the back slashes are within the string
		int dash1 = date.indexOf("/"); //first back slash
		int dash2 = date.lastIndexOf("/"); //last back slash
		//Finds the length of the string
		int length = date.length();
		
		//Breaks the string apart into month, day, and year
		String month = date.substring(0, dash1); //from the first character in the string up to the first dash
		String day = date.substring((dash1+1), (dash2)); //from the first character after the first dash to character before the second dash
		String year = date.substring((dash2+1), (length)); //from the first character after the second dash to the end of the string
		
		//Converts the string numbers into integers
		int numMonth = Integer.parseInt(month);
		int numDay = Integer.parseInt(day);
		int numYear = Integer.parseInt(year);
		
		//initializes boolean variable used to store whether a date is valid or not
		boolean validDate = true;
		
		//tests for a leap year
		boolean leapYear = false;
		//if it is divisible by 4
		if (numYear%4 == 0) 
		{
			leapYear = true;
		}
		//if it is divisible by 100 by not 400
		if (numYear%100==0) 
		{
			leapYear = false;
		}
		//if it is divisible by 400
		if(numYear%400==0)
		{
			leapYear = true;
		}
		
		//tests to make sure the month is valid between 1-12
		if (numMonth < 1 || numMonth > 12)
		{
			validDate = false;
			System.out.println("A month of that number doesn't exist.");
			System.exit(0);
		}

		//tests to make sure the day is valid between 1-31
		//months with exceptions are tested later
		if (numDay < 1 || numDay > 31)
		{
			validDate = false;
			System.out.println("A day of that number doesn't exist.");
			System.exit(0);
		}
		
		//tested for month with only 30 days that the value is not above 30
		if (numMonth == 4 || numMonth == 6 || numMonth == 9 || numMonth == 11)
		{
			if (numDay > 30)
			{
				validDate = false;
				System.out.println("For that month, the day must be between 1 and 30.");
				System.exit(0);
			}
		}
		
		//makes sure that the proper number of days in February correspond to whether it is a leap year or not
		if (numMonth == 2 && leapYear == true)
		{
			if (numDay > 29)
			{
				validDate = false;
				System.out.println("Since it is a leap year, the day for that month must be between 1 and 29.");
				System.exit(0);
			}
		}
		else if (numMonth == 2 && leapYear == false)
		{
			if (numDay > 28)
			{
				validDate = false;
				System.out.println("It is not a leap year, so for that month the day must be between 1 and 28.");
				System.exit(0);
			}
		}
		
		//tests to make sure the year is above zero for this specific program
		if (numYear < 0)
		{
			validDate = false;
			System.out.println("This can only check dates in BCE.");
			System.exit(0);
		}
		
		//prints whether the date is valid or not
		if (validDate == true)
		{
			System.out.println(date + " is a valid date!");
		}
		else
		{
			System.out.println(date + " is not a valid date!"); //really only used if they messed up so badly, other exception didn't catch it
		}
	}

}
