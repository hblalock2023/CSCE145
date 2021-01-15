/*
 * 11.07.2019
 * Lab 19
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

public class Library {

	// attributes
	private Book[][] books;
	// class local variables
	private static final int CLASSES = 10;
	private static final int MAX_BOOKS = 100;
	
	// default constructor
	public Library()
	{
		books = new Book[CLASSES][MAX_BOOKS];
	}
	
	// returns the index based on the call number
	public static int classIndex(Book aBook)
	{
		double callNum = aBook.getCallNumber(); // gets call number
		int index = 0;
		
		if (callNum >= 0.0 && callNum < 100.0)
		{
			index = 0;
		}
		else if (callNum >= 100.0 && callNum < 200.0)
		{
			index = 1;
		}
		else if (callNum >= 200.0 && callNum < 300.0)
		{
			index = 2;
		}
		else if (callNum >= 300.0 && callNum < 400.0)
		{
			index = 3;
		}
		else if (callNum >= 400.0 && callNum < 500.0)
		{
			index = 4;
		}
		else if (callNum >= 500.0 && callNum < 600.0)
		{
			index = 5;
		}
		else if (callNum >= 600.0 && callNum < 700.0)
		{
			index = 6;
		}
		else if (callNum >= 700.0 && callNum < 800.0)
		{
			index = 7;
		}
		else if (callNum >= 800.0 && callNum < 900.0)
		{
			index = 8;
		}
		else if (callNum >= 900.0 && callNum < 1000.0)
		{
			index = 9;
		}
		
		return index;
	}
	
	// adds a book to the library 
	public void addBook(Book aBook)
	{
		int index = classIndex(aBook);
		
		switch (index)
		{
			case 0:
				aBook = new ComputerScienceBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber()); 
				break;
			case 1:
				aBook = new PhilosophyBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber()); 
				break;
			case 2:
				aBook = new ReligionBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber()); 
				break;
			case 3:
				aBook = new SocialSciencesBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
				break;
			case 4:
				aBook = new LanguageBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
				break;
			case 5:
				aBook = new ScienceBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
				break;
			case 6:
				aBook = new TechnologyBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
				break;
			case 7:
				aBook = new ArtsBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
				break;
			case 8:
				aBook = new LiteratureBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
				break;
			case 9:
				aBook = new HistoryBook(aBook.getName(), aBook.getAuthor(), aBook.getCallNumber());
				break;
		}
		
		for (int j = 0; j < books[index].length; j++)
		{
			if (books[index][j] == null)
			{
				books[index][j] = aBook;
				break;
			}
		}
		
	}
	
	// removes a book
	public void removeBook(Book aBook)
	{
		int index = classIndex(aBook);
		
		for (int j = 0; j < books[index].length; j++)
		{
			if (books[index][j] != null && books[index][j].equals(aBook))
			{
				books[index][j] = null;
			}
		}
	}
	
	// prints out the library
	public void printBooks()
	{
		for (int i = 0; i < books.length; i++)
		{
			if (i == 0) 
			{
				System.out.println("Class 000 - Computer Science");
			}
			else if (i == 1) 
			{
				System.out.println("Class 100 - Philosophy");
			}
			else if (i == 2) 
			{
				System.out.println("Class 200 - Religion");
			}
			else if (i == 3) 
			{
				System.out.println("Class 300 - Social Sciences");
			}
			else if (i == 4) 
			{
				System.out.println("Class 400 - Language");
			}
			else if (i == 5) 
			{
				System.out.println("Class 500 - Science");
			}
			else if (i == 6) 
			{
				System.out.println("Class 600 - Technology");
			}
			else if (i == 7) 
			{
				System.out.println("Class 700 - Arts");
			}
			else if (i == 8) 
			{
				System.out.println("Class 800 - Literature");
			}
			else if (i == 9) 
			{
				System.out.println("Class 900 - History");
			}
			
			for (int j = 0; j < books[i].length; j++)
			{
				if (books[i][j] != null)
				{
					System.out.println(books[i][j].toString());
				}
			}
		}
	}
}
