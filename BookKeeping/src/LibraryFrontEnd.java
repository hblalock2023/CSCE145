/*
 *Written by JJ Shepherd 
 */
import java.util.Scanner;
public class LibraryFrontEnd {
	public static Scanner keyboard = new Scanner(System.in);
	public static Library library = new Library();
	public static void main(String[] args) {

		System.out.println("Welcome to the Library!");
		while(true)
		{
			printOptions();
			int choice = keyboard.nextInt();
			keyboard.nextLine();//Fix up
			switch(choice)
			{
			case 1:
				addBook();
				break;
				
			case 2:
				removeBook();
				break;
				
			case 3:
				printAllBooks();
				break;
				
			case 9:
				System.out.println("Goodbye!");
				System.exit(0);
			}
		}
	}
	public static void printOptions()
	{
		System.out.println("Enter 1: to Add a Book\nEnter 2: to Remove a Book\nEnter 3: to Print all Books\nEnter 9: to Quit");
	}
	public static void addBook()
	{
		Book b = makeBook();
		library.addBook(b);
	}
	public static void removeBook()
	{
		Book b = makeBook();
		library.removeBook(b);
	}
	public static void printAllBooks()
	{
		library.printBooks();
	}
	public static Book makeBook()
	{
		System.out.println("Enter the name, author, and call number");
		String name = keyboard.nextLine();
		String author = keyboard.nextLine();
		double callNumber = keyboard.nextDouble();
		keyboard.nextLine();//Fix up
		Book b = new SimpleBook(name,author,callNumber);//Book is an interface which cannot be constructed but SimpleBook can be
		return b;
	}

}