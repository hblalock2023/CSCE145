/*
 * 11.01.2019
 * Homework 06
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class Wolf extends Dog {
	// attributes
	private String packLeaderName;
	
	// constructors
	public Wolf() // default
	{
		super();
		this.packLeaderName = "N/A";
	}
	
	public Wolf(String aName, double aWeight, int anEnergyLevel, String aPackLeaderName) // parameterized
	{
		super(aName, aWeight, anEnergyLevel);
		this.setPackLeaderName(aPackLeaderName);
	}
	
	// accessors
	public String getPackLeaderName()
	{
		return this.packLeaderName;
	}
	
	// mutators
	public void setPackLeaderName(String aPackLeaderName)
	{
		if (aPackLeaderName != null)
		{
			this.packLeaderName = aPackLeaderName;
		}
	}
	
	// other methods
	public String toString()
	{
		return super.toString() + " Pack Leader Name: " + this.packLeaderName;
	}
	
	public boolean equals(Wolf aWolf)
	{
		return super.equals(aWolf) && this.packLeaderName.equalsIgnoreCase(aWolf.getPackLeaderName());
	}
}

