/*
 * 10/16/2019
 * Lab 13
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class StringHelper {

	public static boolean hasAllUniqueCharacters(String aString)
	{
		// compares each letter of the string to the rest of the letters following it
		for (int i = 0; i < aString.length(); i++)
		{
			for (int j = i + 1; j < aString.length(); j++)
			{
				// if any of the letters are the same
				if (Character.toString(aString.charAt(i)).equalsIgnoreCase(Character.toString(aString.charAt(j)))) 
				{
					return false;
				}
			}
		}
		
		return true;
	}
	
	// combines two strings in an alternating fashion
	public static String meshStrings(String firstString, String secondString)
	{
		// initializes an empty string
		String mergedString = "";
		
		for (int i = 0; i < firstString.length() || i < secondString.length(); i++) // keeps going as long as i is less than the longest string
		{
			// adds the letter at i from the first string
			if (i < firstString.length())
			{
				mergedString += firstString.charAt(i);
			}
			
			// adds the letter at i from the second string
			if (i < secondString.length())
			{
				mergedString += secondString.charAt(i);
			}
			
		}
		
		// returns the new meshed string
		return mergedString;
	}
	
	// replaces all the vowels in the string with "oodle"
	public static String replaceVowelsWithOodle(String aString)
	{
		String newString = "";
		
		for (int i = 0; i < aString.length(); i++)
		{
			// looks for vowels
			if (Character.toString(aString.charAt(i)).equalsIgnoreCase("a") || 
					Character.toString(aString.charAt(i)).equalsIgnoreCase("e") || 
					Character.toString(aString.charAt(i)).equalsIgnoreCase("i") || 
					Character.toString(aString.charAt(i)).equalsIgnoreCase("o") || 
					Character.toString(aString.charAt(i)).equalsIgnoreCase("u"))
			{
				// adds "oodle" in the spot of that vowel to a new string
				newString += "oodle";
			}
			else
			{
				// adds consonants in their spot to the new string
				newString += Character.toString(aString.charAt(i));
			}
		}
		
		// returns the new string 
		return newString;
	}
	
	public static double weight(String aString)
	{
		// initializes the weight
		double weight = 0.0;
		
		for (int i = 0; i < aString.length(); i++)
		{
			// looks for vowels
			if (Character.toString(aString.charAt(i)).equalsIgnoreCase("a") || 
					Character.toString(aString.charAt(i)).equalsIgnoreCase("e") || 
					Character.toString(aString.charAt(i)).equalsIgnoreCase("i") || 
					Character.toString(aString.charAt(i)).equalsIgnoreCase("o") || 
					Character.toString(aString.charAt(i)).equalsIgnoreCase("u"))
			{
				weight += 2.5; // adds 2.5 if it's a vowel
			}
			else
			{
				weight += 3.4; // adds 3.4 if it's a consonant
			}
		}
		
		// returns the total sum of vowels and consonants
		return weight;
	}
	
}
