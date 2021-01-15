/*
 * Lab 08
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 04.09.2020
 */

public class Process implements Comparable<Process>{

	// attributes
	private int priority;
	private double time; 
	private String name;
	
	// default constructor
	public Process()
	{
		this.priority = 0;
		this.time = 0.0;
		this.name = "none";
	}
	
	// parameterized constructor
	public Process(String name, int priority, double time)
	{
		setName(name);
		setPriority(priority);
		setTime(time);
	}
	
	// accessors
	public int getPriority()
	{
		return this.priority;
	}
	
	public double getTime()
	{
		return this.time;
	}
	
	public String getName()
	{
		return this.getName();
	}
	
	// mutators
	public void setPriority(int priority)
	{
		if (priority >= 0)
			this.priority = priority;
		else
			this.priority = 0;
	}
	
	public void setTime(double time)
	{
		if (time >= 0.0)
			this.time = time;
		else
			this.time = 0.0;
	}
	
	public void setName(String name)
	{
		if (name == null)
			this.name = "none";
		else
			this.name = name;
	}
	
	// converts attribute values to a readable string
	public String toString()
	{
		return "Name: " + this.name + " Time: " + this.time + " Priority : " + this.priority;
	}
	
	// compares the value of two processes
	public int compareTo(Process process)
	{
		if (process == null)
			return 0;
		if (this.priority < process.getPriority())
			return -1;
		else if (this.priority > process.getPriority())
			return 1;
		else
			return 0;
	}
}
