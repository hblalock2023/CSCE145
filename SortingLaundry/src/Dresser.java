/*
 * 10.23.2019
 * Homework 05
 * Written by Hadley Blalock
 * CSCE 145 
 * Section 008
 */

public class Dresser {
	// Attributes
	private Clothing[][] dresser; // creates a 2D array of object type clothing
	private static final int DRAWERS = 5; // "vertical" length of the array
	private static final int CLOTHES = 10; // "horizontal" length of the array
	
	// Default Constructor
	public Dresser()
	{
		this.dresser = new Clothing[DRAWERS][CLOTHES]; // builds the array
	}
	
	public Clothing[][] getDresser() 
	{
		return this.dresser;
	}
	
	// Add Method
	public void add(Clothing aClothing)
	{	
		
		if(aClothing == null) // if the input clothes isn't valid
		{
			System.out.println("Invalid Clothing.");
		}
		else 
		{
			String type = aClothing.getType().toLowerCase();
			int i = -1; // initializes i
			
			switch (type) // changes the value of i based on which drawer the type of clothing is in
			{
			case "undergarment":
				i = 0; // drawer 1
				break;
			case "socks": 
				i = 1; // drawer 2
				break;
			case "stockings":
				i = 1; // drawer 2
				break;
			case "top":
				i = 2; // drawer 3
				break;
			case "bottom":
				i = 3; // drawer 4
				break;
			case "cape":
				i = 4; // drawer 5
				break;
			}
			
			
			if (i == -1) // if this value didn't change, then the user didn't input a correct type
			{
				System.out.println("Not a valid clothing type.");
			}
			
			for (int j = 0; j < dresser[i].length; j++)
			{				
				if (j == 9 && dresser[i][j] != null) // checks to see if the last value is filled
				{
					System.out.println("The drawer is full.");
					break;
				}
				
				if(dresser[i][j] == null) // makes sure index is empty
				{
					dresser[i][j] = aClothing; // assigns that index to the clothing
					break;
				}
			}	
		}	
	}

	// Remove Method
	public void remove(Clothing aClothing)
	{
		String type = aClothing.getType().toLowerCase();
		int i = -1; // initializes i
		
		switch (type) // changes the value of i based on which drawer the type of clothing is in
		{
		case "undergarment":
			i = 0; // drawer 1
			break;
		case "socks": 
			i = 1; // drawer 2
			break;
		case "stockings":
			i = 1; // drawer 2
			break;
		case "top":
			i = 2; // drawer 3
			break;
		case "bottom":
			i = 3; // drawer 4
			break;
		case "cape":
			i = 4; // drawer 5
			break;
		}
		
		if (i == -1) // if this value didn't change, then the user didn't input a correct type
		{
			System.out.println("Not a valid clothing type.");
		}

		for (int j = 0; j < dresser[i].length; j++)
		{
			// checks to make sure there is a clothing object in this index and that it is 
			// equal to the input clothing object
			if(dresser[i][j] != null && dresser[i][j].equals(aClothing)) 
			{
				dresser[i][j] = null; // removes that clothing by assign that index to be null
				break; 
			}
			else
			{
				System.out.println("No clothing found."); // if the index is empty
			}
		}	
	}
	
	// Print Method
	public void print()
	{	
		// prints out each drawer and what's in it, even if it's empty
		for (int i = 0; i < dresser.length; i++) 
		{
			System.out.println("Drawer " + (i + 1));
			
			for (int j = 0; j < dresser[i].length; j++)
			{	
				if (dresser[i][j] != null)
				{
					System.out.println(dresser[i][j].toString());
				}
			}
			
			System.out.println();
		}
	}
}
