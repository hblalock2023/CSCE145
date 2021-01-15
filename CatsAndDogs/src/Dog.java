/*
 * 11.01.2019
 * Homework 06
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class Dog extends Animal {
	// attributes
	private int energyLevel;
	
	// constructors
	public Dog() // default
	{
		super();
		this.energyLevel = 0;
	}
	
	public Dog(String aName, double aWeight, int anEnergyLevel) // parameterized
	{
		super(aName, aWeight);
		this.setEnergyLevel(anEnergyLevel);
	}
	
	// accessors
	public int getEnergyLevel()
	{
		return this.energyLevel;
	}
	
	// mutators
	public void setEnergyLevel(int anEnergyLevel)
	{
		if (anEnergyLevel > 0 && anEnergyLevel < 100)
		{
			this.energyLevel = anEnergyLevel;
		}
	}
	
	// other methods
	public String toString()
	{
		return super.toString() + " Energy Level: " + this.energyLevel;
	}
	
	public boolean equals(Dog aDog)
	{
		return super.equals(aDog) && this.energyLevel == aDog.getEnergyLevel();
	}
}
