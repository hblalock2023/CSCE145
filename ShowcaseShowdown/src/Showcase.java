import java.io.File;
import java.io.FileNotFoundException;

/*
 * Homework 01
 * Written by Hadley Blalock
 * 01.31.2020
 * CSCE 146 
 * Section 007
 */

import java.io.*;
import java.util.*;

public class Showcase {

	private Prize[] allPrizes;
	private static final int NUM_PRIZES = 50;
	
	// default constructor
	public Showcase() throws FileNotFoundException
	{
		allPrizes = new Prize[NUM_PRIZES];
		readFile();
	}
	
	public void print()
	{
		for (int i = 0; i < allPrizes.length; i++)
		{
			System.out.println(allPrizes[i].toString());
		}
	}
	
	// adds a prize
	public void addPrize(Prize prize)
	{
		for (int i = 0; i < allPrizes.length; i++)
		{
			if (allPrizes[i] == null) // checks to make sure that index is empty
			{
				allPrizes[i] = prize; // assigns that index the movie
				return;
			}
		}	
	}

	// picks the five random prizes
	public Prize[] pickPrizes()
	{
		int numPrizes = 5;
		Random rand = new Random();
		
		Prize prizes[] = new Prize[numPrizes];
		
		for (int i = 0; i < numPrizes; i++)
		{
			int randNum = rand.nextInt(NUM_PRIZES);
			prizes[i] = allPrizes[randNum];
		}
		
		return prizes;
	}
	
	// calculates total price
	public int totalPrice(Prize[] prizes)
	{
		int totalPrice = 0;
		
		for (int i = 0; i < prizes.length; i++)
		{
			if (prizes[i] != null)
			{
				totalPrice += prizes[i].getPrice(); 
			}
		}
		
		return totalPrice;
	}
	
	// reads the file
	public static final String DELIM = "\t"; // section type and grade are separated by a tab
	public void readFile() throws FileNotFoundException
	{
		try 
		{
			Scanner fileScanner = new Scanner(new File("prizeList.txt"));	
			
			// loops through the file
			while (fileScanner.hasNextLine())
			{
				// gets the line and splits it at the delimiter
				String fileLine = fileScanner.nextLine();
				String[] splitLine = fileLine.split(DELIM);
				
				if (splitLine.length != 2)
				{
					continue;
				}
				
				String name = splitLine[0];
				int price = Integer.parseInt(splitLine[1]);
				addPrize(new Prize(name, price));				
			}
			
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
