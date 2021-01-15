/*
 * 11.14.2019
 * Lab 20
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008 
 */

public class Square {

	// attribute
	private int length;
	
	// constructors
	public Square() // default
	{
		length = 1;
	}
	
	public Square(int aLength) throws DimensionException // parameterized
	{
		setLength(aLength);
	}
	
	// accessor
	public int getLength()
	{
		return length;
	}
	
	// mutator
	public void setLength(int aLength) throws DimensionException 
	{
		if (aLength > 0)
		{
			length = aLength;
		}
		else
		{
			throw new DimensionException();
		}
	}
	
	// drawing method
	public void draw()
	{
		for (int i = 0; i < length; i++)
		{
			for (int j = 0; j < length; j++)
			{
				System.out.print("* "); // prints space to make it more square-like
			}
			
			System.out.println();
		}
	}
	
	// area method
	public int getArea()
	{
		return length*length; // calculates area
	}
	
	// perimeter method
	public int getPerimeter()
	{
		return length*4; // calculates perimeter
	}
}
