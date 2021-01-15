/*
 * 10.26.2019
 * Lab 16
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class Diamond extends ShapeBasics implements DiamondInterface {

	// attributes
	private int width;
	
	// constructors
	public Diamond() // default
	{
		super(); // calls parent class
		this.width = 1;
	}
	
	public Diamond(int aWidth, int anOffset) // parameterized
	{
		super(anOffset); // calls parent class
		this.setWidth(aWidth);
	}
	
	// accessors
	public int getWidth()
	{
		return this.width;
	}
	
	// mutators
	public void setWidth(int aWidth)
	{
		if (aWidth >= 0 && aWidth % 2 != 0)
		{
			this.width = aWidth;
		}
		else
		{
			System.out.println("Size must be odd and positive.");
		}
	}
	
	// drawing methods
	public void drawHere() // calls the methods to draw the top and bottom part of the diamond
	{
        drawTopV();
        drawBottomV();
	}
	
	private void drawTopV() // builds the top of the diamond
	{		
		int topHeight = this.width/2 + 1; // the vertical height of the top of the diamond based on the width
		for (int i = 1; i <= topHeight; i++)
		{
			skipSpaces(getOffset()); // prints the offset at the beginning of each line
			
			for (int j = 1; j <= width; j++)
			{
				// if j is equal to i at the spot where the "*" should be printed out for each line
				// then it prints out a "*"
				if (j == i + (-2*i) + (width/2 + 2) || j == i + (width/2)) 
				{
					System.out.print("*");
				}
				// prints a space otherwise
				else
				{
					skipSpaces(1);
				}
			}
			
			System.out.println(); // starts new line
		}
	}
	
	private void drawBottomV() // builds the bottom of the diamond
	{
		int bottomHeight = width/2; // the vertical height of the top of the diamond based on the width
		for (int i = bottomHeight; i > 0; i--)
		{
			skipSpaces(getOffset()); // prints the offset at the beginning of each line
			
			// if j is equal to i at the spot where the "*" should be printed out for each line
			// then it prints out a "*"
			for (int j = 1; j <= width; j++)
			{
				if (j == i + (-2*i) + (width/2 + 2) || j == i + (width/2))
				{
					System.out.print("*");
				}
				// prints a space otherwise
				else
				{
					skipSpaces(1);
				}
			}
			
			System.out.println(); // starts new line
		}
	}
	
	private static void skipSpaces(int num) // prints the assigned number of spaces
	{
		for (int i = 0; i < num; i++)
		{
			System.out.print(" ");
		}
	}
}
