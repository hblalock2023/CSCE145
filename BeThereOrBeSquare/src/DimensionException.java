/*
 * 11.14.2019
 * Lab 20
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008 
 */

public class DimensionException extends Exception {

	// constructor
	public DimensionException() //default
	{
		// error message
		super("This dimension is invalid. Dimension value must be a positive non-zero integer."); 
	}
	
	public DimensionException(String s) // parameterized
	{
		super(s);
	}
}
