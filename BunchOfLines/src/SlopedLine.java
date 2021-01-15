/*
 * 10.30.2019
 * Lab 17
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

// implements line
public class SlopedLine implements Line { 
	
	// attributes
	private double slope;
	
	// constructors
	public SlopedLine() // default
	{
		this.slope = 1.0;
	}
	
	public SlopedLine(double aSlope) // parameterized
	{
		this.setSlope(aSlope);
	}
	
	// accessors
	public double getSlope()
	{
		return this.slope;
	}
	
	// mutators
	public void setSlope(double aSlope)
	{
		this.slope = aSlope;
	}
	
	// returns the y point
	public double getYPoint(double xPoint)
	{
		return this.slope*xPoint;
	}
}
