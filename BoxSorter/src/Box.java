/*
 * 10.21.2019
 * Lab 14
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class Box {

	// attributes
	private String label;
	private double length;
	private double width;
	private double height;
	
	// default constructor
	public Box()
	{
		this.label = "None yet.";
		this.length = 0.0;
		this.width = 0.0;
		this.height = 0.0;
	}
	
	// parameterized constructor
	public Box(String aLabel, double aLength, double aWidth, double aHeight)
	{
		this.setLabel(aLabel);
		this.setLength(aLength);
		this.setWidth(aWidth);
		this.setHeight(aHeight);
	}
	
	// accessor methods
	public String getLabel()
	{
		return this.label;
	}
	
	public double getLength()
	{
		return this.length;
	}
	
	public double getWidth()
	{
		return this.width;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	// mutator methods
	public void setLabel(String aLabel)
	{
		this.label = aLabel;
	}
	
	public void setLength(double aLength)
	{
		if (aLength > 0.0) // checks to make sure the value isn't negative or zero
		{
			this.length = aLength;
		}
	}
	
	public void setWidth(double aWidth)
	{
		if (aWidth > 0.0) // checks to make sure the value isn't negative or zero
		{
			this.width = aWidth;
		}
	}
	
	public void setHeight(double aHeight)
	{
		if (aHeight > 0.0) // checks to make sure the value isn't negative or zero
		{
			this.height = aHeight;
		}
	}
	
	// other methods
	
	// calculates the volume of the box
	public double getVolume()
	{
		return this.length*this.width*this.height;
	}
	
	// builds a string of the box's information
	public String toString()
	{
		return "Box: " + this.label + " Length: " + this.length + " Width: " + this.width + " Height: " + this.height;
	}
	
	// tests to see if one box is equal to another
	public boolean equals(Box aBox)
	{
		return this.label.equals(aBox.getLabel()) &&
				this.length == aBox.getLength() &&
				this.width == aBox.getWidth() &&
				this.height == aBox.getHeight();
	}
}
