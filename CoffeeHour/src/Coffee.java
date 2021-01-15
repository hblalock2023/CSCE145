/*
 * 10/16/2019
 * Homework 04
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class Coffee {
	// attributes
	private String name;
	private int caffeineContent;
	
	// default constructor
	public Coffee()
	{
		this.name = "None Yet";
		this.caffeineContent = 0;
	}
	
	// parameterized constructor
	public Coffee(String aName, int aCaffeineContent)
	{
		this.name = aName;
		this.caffeineContent = aCaffeineContent;
	}
	
	// accessors
	public String getName()
	{
		return this.name;
	}
	
	public int getCaffeineContent()
	{
		return this.caffeineContent;
	}
	
	// mutators
	public void setName(String aName)
	{
		this.name = aName;
	}
	
	public void setCaffeineContent(int aCaffeineContent)
	{
		this.caffeineContent = aCaffeineContent;
	}
	
	// other useful methods
	public String toString() // converts the attributes of the class to a string
	{
		return "Coffee: " + this.name + " Caffeine Content: " + this.caffeineContent;
	}
	
	public boolean equals(Coffee aCoffee) // determines if two coffees are equal to each other
	{
		return this.name.equals(aCoffee.getName()) &&
				this.caffeineContent == aCoffee.getCaffeineContent();
	}
	
	public double riskyAmount() // calculates the number of coffees it would take to have a dangerous amount of caffeine
	{
		return 180.0/((getCaffeineContent() / 100.0)*6.0);
	}
}
