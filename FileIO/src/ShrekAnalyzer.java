/*
 * In-Class Example
 * 11.18.2019
 */

import java.util.*;
import java.io.*;

public class ShrekAnalyzer {

	public static void main(String[] args) {
		
		System.out.println("The number of times \"Donkey\" appears " + lookForWord("Donkey"));
	}

	public static int lookForWord(String word)
	{
		int ret = 0;
		
		try
		{
			Scanner fileScanner = new Scanner(new File("./Shrek.txt"));
			while(fileScanner.hasNext())
			{
				String next = fileScanner.next(); // delimiter - separates data
				if (next.toUpperCase().contains(word.toUpperCase())) 
				{
					ret ++;
				}
			}
			fileScanner.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
		return ret;
	}
}
