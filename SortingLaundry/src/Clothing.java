/*
 * 10.23.2019
 * Homework 05
 * Written by Hadley Blalock
 * CSCE 145 
 * Section 008
 */

public class Clothing {
	// Attributes
	private String type;
	private String color;
	
	// Constructors
	public Clothing() // default
	{
		this.type = "N/A";
		this.color = "N/A";
	}
	
	public Clothing(String aType, String aColor) // parameterized
	{
		this.setType(aType);
		this.setColor(aColor);
	}
	
	// Accessors
	public String getType() 
	{
		return this.type;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	// Mutators
	public void setType(String aType)
	{
		if (aType.equalsIgnoreCase("Undergarment") || aType.equalsIgnoreCase("Socks") || 
				aType.equalsIgnoreCase("Stockings") || aType.equalsIgnoreCase("Top") ||
				aType.equalsIgnoreCase("Bottom") || aType.equalsIgnoreCase("Cape"))
		{
			this.type = aType;
		}
		
	}
	
	public void setColor(String aColor)
	{
		if (aColor.equalsIgnoreCase("Brown") || aColor.equalsIgnoreCase("Red") || 
				aColor.equalsIgnoreCase("Pink") || aColor.equalsIgnoreCase("Orange") ||
				aColor.equalsIgnoreCase("Green") || aColor.equalsIgnoreCase("Blue")|| 
				aColor.equalsIgnoreCase("Purple") || aColor.equalsIgnoreCase("Grey"))
		{
			this.color = aColor;
		}
	}
	
	// Other Useful Methods
	public String toString()
	{
		return "Type: " + this.type + " Color: " + this.color;
	}
	
	public boolean equals(Clothing aClothing)
	{
		return this.type.equalsIgnoreCase(aClothing.getType()) &&
				this.color.equalsIgnoreCase(aClothing.getColor());
	}
}
