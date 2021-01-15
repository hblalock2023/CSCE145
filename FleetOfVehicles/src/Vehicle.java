/*
 * 10.24.2019
 * Lab 15
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008 
 */

public class Vehicle {
	// Attributes
	private String manuName; // manufacturer name
	private int cylinders; // number of cylinders
	private String ownersName; // owner's name
	
	// Constructors
	public Vehicle() // default
	{
		manuName = "N/A";
		cylinders = 0;
		ownersName = "N/A";
	}
	
	public Vehicle(String aManuName, int aCylinders, String anOwnersName) // parameterized
	{
		this.setManuName(aManuName);
		this.setCylinders(aCylinders);
		this.setOwnersName(anOwnersName);
	}
	
	// Accessors
	public String getManuName()
	{
		return this.manuName;
	}
	
	public int getCylinders()
	{
		return this.cylinders;
	}
	
	public String getOwnersName()
	{
		return this.ownersName;
	}
	
	// Mutators
	public void setManuName(String aManuName)
	{
		this.manuName = aManuName;
	}
	
	public void setCylinders(int aCylinders)
	{
		if (cylinders >= 0) 
		{
			this.cylinders = aCylinders;
		}
	}
	
	public void setOwnersName(String anOwnersName)
	{
		this.ownersName = anOwnersName;
	}
	
	// Other Useful Methods
	public String toString()
	{
		return "Manufacturer's Name: " + this.manuName + " Number of Cylinders: " + this.cylinders +
				" Owner's Name: " + this.ownersName;
	}
	
	public boolean equals(Vehicle aVehicle)
	{
		return aVehicle != null && this.manuName.equalsIgnoreCase(aVehicle.getManuName()) &&
				this.cylinders == aVehicle.getCylinders() && this.ownersName.equalsIgnoreCase(aVehicle.getOwnersName());
	}
}

