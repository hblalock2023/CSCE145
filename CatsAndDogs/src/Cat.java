/*
 * 11.01.2019
 * Homework 06
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class Cat extends Animal {
	// attributes
	private String mood;
	
	// constructors
	public Cat() // default
	{
		super();
		this.mood = "N/A";
	}
	
	public Cat(String aName, double aWeight, String aMood) // parameterized
	{
		super(aName, aWeight);
		this.setMood(aMood);
	}
	
	// accessors
	public String getMood()
	{
		return this.mood;
	}
	
	// mutators
	public void setMood(String aMood)
	{
		if (aMood != null && aMood.equalsIgnoreCase("sleepy") || 
				aMood.equalsIgnoreCase("playful") || aMood.equalsIgnoreCase("hungry")) // checks mood
		{
			this.mood = aMood;
		}
		else
		{
			System.out.println("Invalid mood.");
		}
	}
	
	// other methods
	public String toString()
	{
		return super.toString() + " Mood: " + this.mood;
	}
	
	public boolean equals(Cat aCat)
	{
		return super.equals(aCat) && this.mood.equalsIgnoreCase(aCat.getMood());
	}
}
