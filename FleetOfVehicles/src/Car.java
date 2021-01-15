/*
 * 10.24.2019
 * Lab 15
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008 
 */

public class Car extends Vehicle {
	// Attributes
	private double milage;
	private int passengers;
	
	// Constructors
	public Car() // default
	{
		super(); // calls parent class: vehicle
		this.milage = 0.0;
		this.passengers = 0;
	}
	
	public Car(String aManuName, int aCylinders, String anOwnersName, double aMilage, int aPassengers) // parameterized
	{
		super(aManuName, aCylinders, anOwnersName);
		this.setMilage(aMilage);
		this.setPassengers(aPassengers);
	}
	
	// Accessors
	public double getMilage()
	{
		return this.milage;
	}
	
	public int getPassengers()
	{
		return this.passengers;
	}
	
	public void setMilage(double aMilage)
	{
		if (aMilage >= 0.0)
		{
			this.milage = aMilage;
		}
	}
	
	// Mutators
	public void setPassengers(int aPassengers)
	{
		if (aPassengers >= 0)
		{
			this.passengers = aPassengers;
		}
	}
	
	// Other Useful Methods
	public String toString()
	{
		return super.toString() + " Milage: " + this.milage + " Passengers: " + this.passengers;
	}
	
	public boolean equals(Car aCar)
	{
		return aCar != null && super.equals(aCar) && this.milage == aCar.getMilage() && 
				this.passengers == aCar.getPassengers();
	}
}
