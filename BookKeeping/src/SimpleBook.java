/*
 * 11.07.2019
 * Lab 19
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class SimpleBook implements Book {

	// attributes
	private String name;
	private String author;
	private double callNumber;
	
	// constructors
	public SimpleBook() // default
	{
		name = "N/A";
		author = "N/A";
		callNumber = 0.0;
	}
	
	public SimpleBook(String aName, String anAuthor, double aCallNumber) // parameterized
	{
		setName(aName);
		setAuthor(anAuthor);
		setCallNumber(aCallNumber);
	}

	// accessors
	@Override
	public String getName() 
	{
		return name;
	}

	@Override
	public String getAuthor() 
	{
		return author;
	}

	@Override
	public double getCallNumber() 
	{
		return callNumber;
	}

	// mutators
	@Override
	public void setName(String aName) 
	{
		if (aName != null)
		{
			name = aName;
		}
	}

	@Override
	public void setAuthor(String anAuthor) 
	{
		if (anAuthor != null)
		{
			author = anAuthor;
		}
	}

	@Override
	public void setCallNumber(double aCallNumber) 
	{
		if (aCallNumber >= 0.0)
		{
			callNumber = aCallNumber;
		}
	}

	// other methods
	@Override
	public String toString() 
	{
		return "Title: " + name + "\nAuthor: " + author + "\nCall Number: " + callNumber;
	}
	
	@Override
	public boolean equals(Book aBook) 
	{
		return aBook != null && name.equals(aBook.getName()) && 
				author.equals(aBook.getAuthor()) && callNumber == aBook.getCallNumber();
	}
}
