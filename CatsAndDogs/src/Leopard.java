/*
 * 11.01.2019
 * Homework 06
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class Leopard extends Cat {
	// attributes
	private int numSpots;
	
	// constructors
	public Leopard() // default
	{
		super();
		this.numSpots = 0;
	}
	
	public Leopard(String aName, double aWeight, String aMood, int aNumSpots) // parameterized
	{
		super(aName, aWeight, aMood);
		this.setNumSpots(aNumSpots);
	}
	
	// accessors
	public int getNumSpots()
	{
		return this.numSpots;
	}
	
	// mutators
	public void setNumSpots(int aNumSpots)
	{
		if (aNumSpots >= 0)
		{
			this.numSpots = aNumSpots;
		}
	}
	
	// other methods
	public String toString()
	{
		return super.toString() + " Number of Spots: " + this.numSpots;
	}
	
	public boolean equals(Leopard aLeopard)
	{
		return super.equals(aLeopard) && this.numSpots == aLeopard.getNumSpots();
	}
}
