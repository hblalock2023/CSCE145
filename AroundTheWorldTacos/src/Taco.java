/*
 * 10.21.2019
 * In-Class Example
 */

public class Taco {

	private String name;
	private String loc;
	private double price;
	
	public Taco()
	{
		this.name = "None";
		this.loc = "None";
		this.price = 0.0;
	}
	
	public Taco(String aName, String aLoc, double aPrice)
	{
		this.setName(aName);
		this.setLoc(aLoc);
		this.setPrice(aPrice);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getLoc()
	{
		return this.loc;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setName(String aName)
	{
		this.name = aName;
	}
	
	public void setLoc(String aLoc)
	{
		this.loc = aLoc;
	}

	public void setPrice(double aPrice)
	{
		if (aPrice >= 0.0)
		{
			this.price = aPrice;
		}
	}

	public String toString()
	{
		return this.name + " " + this.loc + " " + this.price;
	}
	
	public boolean equals(Taco aTaco)
	{
		return this.name.equals(aTaco.getName()) &&
				this.loc.equals(aTaco.getLoc()) &&
				this.price == aTaco.getPrice();
	}
}
