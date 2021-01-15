/*
 * Lab 04
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 02.12.2020
 */

public class Process {
	
	// attributes
	private String name;
	private double completionTime;
	
	// default constructor
	public Process()
	{
		this.name = "N/A";
		this.completionTime = 0.0;
	}
	
	// parameterized constructor
	public Process(String name, double time)
	{
		setName(name);
		setCompletionTime(time);
	}
	
	// accessors
	public String getName()
	{
		return this.name;
	}
	
	public double getCompletionTime()
	{
		return this.completionTime;
	}
	
	// mutators
	public void setName(String name)
	{
		if(name != null)
		{
			this.name = name;
		}
	}
	
	public void setCompletionTime(double time)
	{
		if (time >= 0.0) // checks that time value is postive
		{
			this.completionTime = time;
		}
		else
		{
			this.completionTime = 0.0;
		}
	}
	
	// toString method
	public String toString()
	{
		return "Name: " + this.name + " Cpmpletion Time: " + this.completionTime;
	}
}
