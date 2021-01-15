/*
 * 11.01.2019
 * Homework 06
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class HouseCat extends Cat {

	private String type;
	
	public HouseCat()
	{
		super();
		this.type = "N/A";
	}
	
	public HouseCat(String aName, double aWeight, String aMood, String aType)
	{
		super(aName, aWeight, aMood);
		this.setType(aType);
	}
	
	public String getType()
	{
		return this.type;
	}
	
	public void setType(String aType)
	{
		if (aType != null && aType.equalsIgnoreCase("Short Hair") || aType.equalsIgnoreCase("Bombay")
				|| aType.equalsIgnoreCase("Ragdoll") || aType.equalsIgnoreCase("Sphinx")
				|| aType.equalsIgnoreCase("Scottish Fold")) // checks type
		{
			this.type = aType;
		}
		else
		{
			System.out.println("Invalid type.");
		}
	}
	
	public String toString()
	{
		return super.toString() + " Type: " + this.type;
	}
	
	public boolean equals(HouseCat aHouseCat)
	{
		return super.equals(aHouseCat) && this.type.equalsIgnoreCase(aHouseCat.getType());
	}
}
