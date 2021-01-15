/*
 * 11.01.2019
 * Homework 06
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class Animal {
	// attributes
	private String name;
	private double weight;
	
	// constructors
	public Animal() // default
	{
		this.name = "N/A";
		this.weight = 0.0;
	}
	
	public Animal(String aName, double aWeight) // parameterized
	{
		this.setName(aName);
		this.setWeight(aWeight);
	}
	
	// accessors
	public String getName()
	{
		return this.name;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	// mutators
	public void setName(String aName)
	{
		if (aName != null)
		{
			this.name = aName;
		}
	}
	
	public void setWeight(double aWeight)
	{
		if (aWeight > 0.0)
		{
			this.weight = aWeight;
		}
	}
	
	// other methods
	public String toString()
	{
		return "Name: " + this.name + " Weight: " + this.weight;
	}
	
	public boolean equals(Animal anAnimal)
	{
		return this.name.equalsIgnoreCase(anAnimal.getName()) && this.weight == anAnimal.getWeight();
	}
}
