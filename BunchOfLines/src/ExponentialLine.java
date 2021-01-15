/*
 * 10.30.2019
 * Lab 17
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

// implements line
public class ExponentialLine implements Line {
	
	// attributes
	public double exponent;
	
	// constructors
	public ExponentialLine() // default
	{
		this.exponent = 2.0;
	}
	
	public ExponentialLine(double anExponent) // parameterized
	{
		this.setExponent(anExponent);
	}
	
	// accessors
	public double getExponent()
	{
		return this.exponent;
	}
	
	// mutators
	public void setExponent(double anExponent)
	{
		this.exponent = anExponent;
	}
	
	// returns the y point
	public double getYPoint(double xPoint)
	{
		return Math.pow(xPoint, this.exponent);
	}

}
