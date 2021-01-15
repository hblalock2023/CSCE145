/*
 * 10.24.2019
 * Lab 15
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008 
 */

public class Truck extends Vehicle {
	// Attributes
	private double loadCap;
	private double towCap;
	
	// Constructors
	public Truck() // default
	{
		super(); // calls parent class: vehicle
		loadCap = 0.0;
		towCap = 0.0;
	}
	
	public Truck(String aManuName, int aCylinders, String anOwnersName, double aLoadCap, double aTowCap) // parameterized
	{
		super(aManuName, aCylinders, anOwnersName);
		this.setLoadCap(aLoadCap);
		this.setTowCap(aTowCap);
	}
	
	// Accessors
	public double getLoadCap()
	{
		return this.loadCap;
	}
	
	public double getTowCap()
	{
		return this.towCap;
	}
	
	// Mutators
	public void setLoadCap(double aLoadCap)
	{
		if (aLoadCap >= 0.0)
		{
			this.loadCap = aLoadCap;
		}
	}
	
	public void setTowCap(double aTowCap)
	{
		if (aTowCap >= 0.0)
		{
			this.towCap = aTowCap;
		}
	}
	
	// Other Useful Methods
	public String toString()
	{
		return super.toString() + " Loading Capacity: " + this.loadCap + " Towing Capacity: " + this.towCap;
	}
	
	public boolean equals(Truck aTruck)
	{
		return aTruck != null && super.equals(aTruck) && this.loadCap == aTruck.getLoadCap() && 
				this.towCap == aTruck.getTowCap();
	}
}
