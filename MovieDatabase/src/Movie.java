/*
 * 11.20.2019
 * Homework 08
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class Movie {
	
	// attributes
	private String title;
	public int year;
	public double rating;
	public String director;
	public int boxOfficeGross;
	
	// default constructor
	public Movie()
	{
		title = "N/A";
		year = 0;
		rating = 0.0;
		director = "N/A";
		boxOfficeGross = 0;
	}
	
	// parameterized constructor
	public Movie(String aTitle, int aYear, double aRating, String aDirector, int aGross)
	{
		setTitle(aTitle);
		setYear(aYear);
		setRating(aRating);
		setDirector(aDirector);
		setGrossing(aGross);
	}
	
	// accessors
	public String getTitle()
	{
		return title;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public double getRating()
	{
		return rating;
	}
	
	public String getDirector()
	{
		return director;
	}
	
	public int getGrossing()
	{
		return boxOfficeGross;
	}
	
	// mutators
	public void setTitle(String aTitle)
	{
		if(aTitle != null)
		{
			title = aTitle;
		}
	}
	
	public void setYear(int aYear)
	{
		if(aYear >= 1880)
		{
			year = aYear;
		}
	}
	
	public void setRating(double aRating)
	{
		if(aRating >= 0.0 && aRating <= 5.0)
		{
			rating = aRating;
		}
	}
	
	public void setDirector(String aDirector)
	{
		if(aDirector != null)
		{
			director = aDirector;
		}
	}
	
	public void setGrossing(int aGross)
	{
		if(aGross >= 0)
		{
			boxOfficeGross = aGross;
		}
	}
	
	// converts movie info to a string
	public String toString()
	{
		return "Title: " + title + "\n" + "Year: " + year + "\n" + 
				"Rating: " + rating + "\n" + "Director: " + director + "\n" + 
				"Box Office Gross: " + boxOfficeGross + "\n"; 
	}
	
	// checks to see if one movie is that same as another
	public boolean equals(Movie aMovie)
	{
		return aMovie != null && title.equalsIgnoreCase(aMovie.getTitle()) && 
				year == getYear() && rating == getRating() &&
				director.equalsIgnoreCase(aMovie.getDirector()) &&
				boxOfficeGross == getGrossing();
	}
}
