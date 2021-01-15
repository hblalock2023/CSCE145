/*
 * 10.30.2019
 * Lab 17
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

// implements line
public class SawLine implements Line {
	
	// attributes
	private double modValue;
	
	// constructors
	public SawLine() // default
	{
		this.modValue = 1.0;
	}

	public SawLine(double aModValue) // parameterized
	{
		this.setModValue(aModValue);
	}
	
	// accessors
	public double getModValue()
	{
		return this.modValue;
	}
	
	// mutators
	public void setModValue(double aModValue)
	{
		this.modValue = aModValue;
	}
	
	// returns the y point
	public double getYPoint(double xPoint)
	{
		return xPoint % modValue;
	}
}
