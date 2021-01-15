/*
 * 11.20.2019
 * Homework 08
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class MovieDatabase {

	// attributes
	private Movie[] database;
	private static final int NUM_MOVIES = 100;
	
	// default constructor
	public MovieDatabase()
	{
		database = new Movie[NUM_MOVIES];
	}
	
	// parameterized constructor
	public MovieDatabase(int size)
	{
		init(size);
	}
	
	// initializer
	public void init(int size)
	{
		if(size <= 0)
		{
			init(NUM_MOVIES);
		}
		
		database = new Movie[size];
	}
	
	// returns the database
	public Movie[] getMovieDatabase()
	{
		return database;
	}
	
	// adds a movie to the database
	public void addMovie(Movie aMovie)
	{
		for (int i = 0; i < database.length; i++)
		{
			if (database[i] == null) // checks to make sure that index is empty
			{
				database[i] = aMovie; // assigns that index the movie
				return;
			}
		}
		
		System.out.println("The movie database is full :(");
	
	}
	
	// removes a movie from the database based on all the information
	public void removeMovie(Movie aMovie)
	{

		for (int i = 0; i < database.length; i++)
		{
			// checks to make sure there is an movie at that index and that it equals 
			// the movie to be removed
			if(database[i] != null && database[i].equals(aMovie))
			{
				database[i] = null; // "deletes" that movie by making the index null
				return;
			}
		}
		
		System.out.println("That movie was not found.");
	
	}
	
	// sorts movies by title
	public void sortByTitle()
	{
		
		boolean hasSwapped = true;
		while (hasSwapped)
		{
			hasSwapped = false;
			for (int i = 0; i < database.length - 1; i++)
			{
				if(database[i] != null && database[i+1] != null)
				{
					if (database[i].getTitle().compareTo(database[i + 1].getTitle()) > 0)
					{
						// swap
						Movie temp = database[i];
						database[i] = database[i + 1];
						database[i + 1] = temp;
						hasSwapped = true;
					}
				}
			}
		}
	}
	
	// sorts movies by ratings
	public void sortByRating()
	{
		boolean hasSwapped = true;
		while (hasSwapped)
		{
			hasSwapped = false;
			for (int i = 0; i < database.length - 1; i++)
			{
				if(database[i] != null && database[i+1] != null)
				{
					if (database[i].getRating() < database[i + 1].getRating())
					{
						// swap
						Movie temp = database[i];
						database[i] = database[i + 1];
						database[i + 1] = temp;
						hasSwapped = true;
					}
				}
			}
		}
	}
	
	// sorts movies by grossing
	public void sortByGrossing()
	{
		boolean hasSwapped = true;
		while (hasSwapped)
		{
			hasSwapped = false;
			for (int i = 0; i < database.length - 1; i++)
			{
				if(database[i] != null && database[i+1] != null)
				{
					if (database[i].getGrossing() < database[i + 1].getGrossing())
					{
						// swap
						Movie temp = database[i];
						database[i] = database[i + 1];
						database[i + 1] = temp;
						hasSwapped = true;
					}
				}
			}
		}
	}
	
	// finds all movies by that director
	public void findByDirector(String director)
	{
		for(int i = 0; i < database.length; i++)
		{
			if(director != null && database[i] != null &&
					database[i].getDirector().equalsIgnoreCase(director))
			{
				System.out.println(database[i].toString());
			}
		}
	}
	
	public static final String DELIM = "\n";
	
	// prints database to a file
	public void printFile(String fileName)
	{
		try
		{
			PrintWriter fileWriter = new PrintWriter(new FileOutputStream(fileName));
			// Print the Header
			fileWriter.println("Movie Database");
			// Print the body
			for (Movie movie: database)
			{
				if (movie == null)
				{
					break;
				}
				fileWriter.println(movie.getTitle() + DELIM +
						movie.getYear() + DELIM +
						movie.getRating() + DELIM +
						movie.getDirector() + DELIM +
						movie.getGrossing());
			}
			
			fileWriter.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// reads a file
	public void readFile(String fileName)
	{
		try 
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			
			// Read the Header
			String fileLine = fileScanner.nextLine();
			String[] splitLines = fileLine.split(DELIM);
			if(splitLines.length != 2)
			{
				return;
			}
			int size = Integer.parseInt(splitLines[1]);
			init(size);
			
			// Read the body
			while(fileScanner.hasNextLine())
			{
				fileLine = fileScanner.nextLine();
				splitLines = fileLine.split(DELIM);
				String title = splitLines[0];
				int year = Integer.parseInt(splitLines[1]);
				double rating = Double.parseDouble(splitLines[2]);
				String director = splitLines[3];
				int boxOfficeGross = Integer.parseInt(splitLines[2]);
				Movie movie = new Movie(title, year, rating, director, boxOfficeGross);
				this.addMovie(movie);
			}
			
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// prints the database
	public void printDatabase()
	{
		for(int i = 0; i < database.length; i++)
		{
			if(database[i] != null)
			{
				System.out.println(database[i].toString());
			}
		}
	}
}
