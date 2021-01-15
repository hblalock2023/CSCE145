/*
 * 10/14/2019
 * Lab 12
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

// defines the class
public class Apple {
	// defines the attributes of the class
	private String type;
	private double weight;
	private double price;
	
	// default constructor
	public Apple() 
	{
		this.type = "None yet";
		this.weight = 0.0;
		this.price = 0.0;
	}
	
	// parameterized constructors
	public Apple(String aType, double aWeight, double aPrice)
	{
		this.setType(aType);
		this.setWeight(aWeight);
		this.setPrice(aPrice);
	}
	
	// accessor methods
	public String getType()
	{
		return this.type;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	// mutator methods
	public void setType(String aType)
	{
		this.type = aType;
	}
	
	public void setWeight(double aWeight)
	{
		if (aWeight > 0.0)
		{
			this.weight = aWeight;
		}
		else
		{
			System.out.println("That value isn't valid.");
		}
	}
	
	public void setPrice(double aPrice)
	{
		if (aPrice > 0.00)
		{
			this.price = aPrice;
		}
		else
		{
			System.out.println("That value isn't valid.");
		}
	}
	
	// other useful methods
	public String toString()
	{
		return this.type + " " + this.weight + "kgs $" + this.price;
	}
	
	public boolean equals(Apple anApple)
	{
		return this.type.equals(anApple.getType()) &&
				this.weight == anApple.getWeight() &&
				this.price == anApple.getPrice();
	}
}
