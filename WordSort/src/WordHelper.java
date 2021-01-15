/*
 * Lab 01
 * Written by Hadley Blalock
 * 01.21.2020
 * CSCE 146 
 * Section 007
 */

public class WordHelper {
	
	// Sort by Vowels Method
	public static String[] sortByVowels(String[] array)
	{
		String[] copyArray = array.clone(); // creates a working copy of the array

		for (int i = 0; i < copyArray.length-1; i++)
		{
			for (int j = i + 1; j < copyArray.length; j++)
			{
				// if the number of vowels of the word below is less than the number of vowels
				// of the word above it, they swap
				if(countVowels(copyArray[j]) < countVowels(copyArray[i]))
				{
					swap(copyArray, i , j); // swaps words
				}		
			}
					
		}
		
		return copyArray; // returns sorted array
	}
	
	// Sort by Consonants Method
	public static String[] sortByConsonants(String[] array)
	{
		String[] copyArray = array.clone(); // creates a working copy of the array

		for (int i = 0; i < copyArray.length-1; i++)
		{
			for (int j = i + 1; j < copyArray.length; j++)
			{
				// if the number of consonants of the word below is less than the number of consonants
				// of the word above it, they swap
				if(countConsonants(copyArray[j]) < countConsonants(copyArray[i]))
				{
					swap(copyArray, i , j); // swaps words
				}		
			}
					
		}
		
		return copyArray; // returns sorted array
	}
	
	// Sort by Length Method
	public static String[] sortByLength(String[] array)
	{
		String[] copyArray = array.clone(); // creates a working copy of the array

		for (int i = 0; i < copyArray.length-1; i++)
		{
			for (int j = i + 1; j < copyArray.length; j++)
			{
				// if the length of the word below is less than the length of the word above it, 
				// they swap
				if(copyArray[j].length() < copyArray[i].length())
				{
					swap(copyArray, i , j); // swaps words
				}		
			}
					
		}
		
		return copyArray; // returns sorted array
	}
	
	// Vowel Counting Helper Method
	public static int countVowels(String word)
	{
		word = word.toLowerCase(); // converts word to lower case so it can be compared
		int counter = 0;
		for (int i = 0; i < word.length(); i++)
		{
			char letter = word.charAt(i); // gets the character at that index in the word
			
			// checks to see if that character is a vowel and adds one to the counter if it is
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' ||letter == 'u' || letter == 'y')
			{
				counter += 1;
			}
		}
		
		return counter;
	}
	
	// Consonant Counting Helper Method
	public static int countConsonants(String word)
	{
		word = word.toLowerCase(); // converts word to lower case so it can be compared
		int counter = 0;
		for (int i = 0; i < word.length(); i++)
		{
			char letter = word.charAt(i); // gets the character at that index in the word
			
			// checks to see if that character is a vowel and adds one to the counter if it is
			// would not work if file contained special characters
			if (letter != 'a' && letter != 'e' && letter != 'i' && letter != 'o' && letter != 'u' && letter != 'y')
			{
				counter++;
			}
		}
		
		return counter;
	}
	
	// Swap Helper Method 
	// aids in selection sort
	public static String[] swap(String[] a, int i, int j)
	{
		String temp = a[j];
		a[j] = a[i];
		a[i] = temp;
		
		return a;
	}
}
