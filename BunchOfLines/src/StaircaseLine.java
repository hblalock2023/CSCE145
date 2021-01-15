/*
 * 10.30.2019
 * Lab 17
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

// implements line
public class StaircaseLine implements Line {

	// attributes
	private double width;
	private double height;
	
	// constructors
	public StaircaseLine() // default
	{
		this.width = 1.0;
		this.height = 1.0;
	}
	
	public StaircaseLine(double aWidth, double aHeight) // parameterized
	{
		this.setWidth(aWidth);
		this.setHeight(aHeight);
	}
	
	// accessors
	public double getWidth()
	{
		return this.width;
	}
	
	// mutators
	public double getHeight()
	{
		return this.height;
	}
	
	public void setWidth(double aWidth)
	{
		this.width = aWidth;
	}
	
	public void setHeight(double aHeight)
	{
		this.height = aHeight;
	}
	
	// returns the y point
	public double getYPoint(double xPoint)
	{
		return Math.floor(xPoint/this.width) * this.height;
	}
}
