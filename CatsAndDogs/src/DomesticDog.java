/*
 * 11.01.2019
 * Homework 06
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class DomesticDog extends Dog {
	// attributes
	private String type;
	
	// constructors
	public DomesticDog() // default
	{
		super();
		this.type = "N/A";
	}
	
	public DomesticDog(String aName, double aWeight, int anEnergyLevel, String aType) // parameterized
	{
		super(aName, aWeight, anEnergyLevel);
		this.setType(aType);
	}
	
	// accessors
	public String getType()
	{
		return this.type;
	}
	
	// mutators
	public void setType(String aType)
	{
		if (aType != null && aType.equalsIgnoreCase("Retriever") || aType.equalsIgnoreCase("Terrier")
				|| aType.equalsIgnoreCase("Husky") || aType.equalsIgnoreCase("Yappy")
				|| aType.equalsIgnoreCase("Mutt")) // checks type
		{
			this.type = aType;
		}
		else
		{
			System.out.println("Invalid type.");
		}
	}
	
	// other methods
	public String toString()
	{
		return super.toString() + " Type: " + this.type;
	}
	
	public boolean equals(DomesticDog aDomesticDog)
	{
		return super.equals(aDomesticDog) && this.type.equalsIgnoreCase(aDomesticDog.getType());
	}
}

