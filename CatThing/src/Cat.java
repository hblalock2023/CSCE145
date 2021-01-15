/*
 * 10/07/2019
 * In-Class Example 
 */

// Step 1: Define the class.
public class Cat {
	
	// Step 2: Define the attributes (instance variables). **MUST BE PRIVATE
	private String name;
	private double weight;
	private int numOfLegs;
	
	// Step 3: Define constructors.
	public Cat() // default constructor
	{
		this.name = "None yet.";
		this.weight = 0.0;
		numOfLegs = 4;
	}
	
	public Cat(String aName, double aWeight, int aNumOfLegs) // parameterized constructor
	{
		// Call mutators
		this.setName(aName);
		this.setWeight(aWeight);
		this.setNumOfLegs(aNumOfLegs);
	}
	
	// Step 4: Create accessors for each instant variable. 
	public String getName()
	{
		return this.name;
	}
	
	public double getWeight()
	{
		return this.weight;
	}
	
	public int getNumOfLegs()
	{
		return this.numOfLegs;
	}
	
	// Step 5: Create Mutators for each instance variable.
	public void setName(String aName)
	{
		this.name = aName;
	}
	
	public void setWeight(double aWeight)
	{
		if (aWeight > 0.0) 
		{
			this.weight = aWeight;
		}
	}
	
	public void setNumOfLegs(int aNumOfLegs)
	{
		if (aNumOfLegs <= 4 && aNumOfLegs >= 0)
		{
			this.numOfLegs = aNumOfLegs;
		}
	}
	
	// Step 6: Other (useful) methods.
	public String toString()
	{
		return this.name + " " + this.weight + " " + this.numOfLegs;
	}
	
	public boolean equals(Cat aCat)
	{
		return this.name.equals(aCat.getName()) &&
				this.weight == aCat.getWeight() &&
				this.numOfLegs == aCat.getNumOfLegs();
	}
}
