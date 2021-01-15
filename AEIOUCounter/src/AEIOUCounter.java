/*
 * 11.17.2019
 * Lab 21
 * Written by Hadley Blalock
 * CSCE 145 
 * Section 008
 */

import java.io.*;
import java.util.*;

public class AEIOUCounter {

	public static void main(String[] args) {
		// sets up scanner to get input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a file name to find out how many times AEIOU appears in order.");
		// stores input file name
		String fileName = keyboard.nextLine();
		// prints out the number of times AEIOU appears in that file
		//calls the toString() and lookForAEIOU() methods
		System.out.println("The file " + fileName + " has \"AEIOU\" "
				+ "appears in order " + lookForAEIOU(toString(fileName)) + " times."); 
		keyboard.close();		
		
	}
	
	public static String toString(String fileName)
	{
		// creates an empty string
		String fileContent = "";
		try 
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while (fileScanner.hasNext())
			{
				// adds each line to the string to convert the file to one long string	
				fileContent += fileScanner.nextLine();
			}
			// closes the scanner
			fileScanner.close();
		}
		catch (Exception e) 
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		// returns the string
		return fileContent;
	}
	
	public static int lookForAEIOU(String fileContent)
	{
		// converts the string to all upper case
		fileContent = fileContent.toUpperCase();
		// variables to be used in checking for vowels
		char charA = 'A';
		char charE = 'E';
		char charI = 'I';
		char charO = 'O';
		char charU = 'U';
		
		// sets up counter
		int counter = 0;
		// sets up empty string that will take in the vowels
		String onlyVowels = "";
		
		// builds a string with only the vowel characters from the file 
		// by  taking out consonants, spaces, and other symbols
		for (int i = 0; i < fileContent.length(); i++)
		{
			if (fileContent.charAt(i) == charA)
			{
				onlyVowels += "A";
			}
			if (fileContent.charAt(i) == charE)
			{
				onlyVowels += "E";
			}
			if (fileContent.charAt(i) == charI)
			{
				onlyVowels += "I";
			}
			if (fileContent.charAt(i) == charO)
			{
				onlyVowels += "O";
			}
			if (fileContent.charAt(i) == charU)
			{
				onlyVowels += "U";
			}	
		}
				
		// checks for each instance where "AEIOU" appears in order
		for (int j = 0; j < onlyVowels.length(); j++)
		{
			if (onlyVowels.charAt(j) == charA && j+1 < onlyVowels.length())
			{
				if (onlyVowels.charAt(j+1) == charE && j+2 < onlyVowels.length())
				{
					if (onlyVowels.charAt(j+2) == charI && j+3 < onlyVowels.length())
					{
						if (onlyVowels.charAt(j+3) == charO && j+4 < onlyVowels.length())
						{
							if (onlyVowels.charAt(j+4) == charU)
							{
								counter += 1;
							}
						}
					}
				}
			}
		}
			
		// returns the counter
		return counter;
	}
}
