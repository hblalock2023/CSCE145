/*
 * Lab 07
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 04.01.2020
 */

public class Fruit implements Comparable<Fruit> {

	// attributes
	private double weight;
	private String type;
	
	// default constructor
	public Fruit()
	{
		weight = 0.0;
		type = "none";
	}
	
	// parameterized constructor
	public Fruit(double weight, String type)
	{
		setWeight(weight);
		setType(type);
	}
	
	// accessors
	public double getWeight()
	{
		return this.weight;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	// mutators
	public void setWeight(double weight)
	{
		if (weight <= 0.0)
		{
			this.weight = 1.0;
		}
		else
		{
			this.weight = weight;
		}
	}
	
	public void setType(String type)
	{
		if (type == null)
		{
			this.type = "none";
		}
		else
		{
			this.type = type;
		}
	}
	
	// converts info to string
	public String toString()
	{
		return this.type + " " + this.weight;
	}

	@Override
	public int compareTo(Fruit fruit) // comparing method
	{
		if (fruit == null)
			return 0;
		if(this.weight > fruit.getWeight())
			return 1;
		else if(this.weight < fruit.getWeight())
			return -1;
		else 
			return 0;			
	}
}
