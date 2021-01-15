/*
 * Homework 01
 * Written by Hadley Blalock
 * 01.31.2020
 * CSCE 146 
 * Section 007
 */

public class Prize {
	
	// attributes
	private String name;
	private int price;
	
	// default constructor
	public Prize()
	{
		name = "n/a";
		price = 0;
	}
	
	// parameterized constructor
	public Prize(String name, int price)
	{
		setName(name);
		setPrice(price);
	}
	
	// acessors 
	public String getName()
	{
		return name;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	// mutators
	public void setName(String name)
	{
		if (name != null)
		{
			this.name = name;
		}
	}
	
	public void setPrice(int price) 
	{
		if (price >= 0)
		{
			this.price = price;
		}
	}
}
