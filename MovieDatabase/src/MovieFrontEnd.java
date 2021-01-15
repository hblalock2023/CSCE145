/*
 * 11.20.2019
 * Homework 08
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class MovieFrontEnd {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Movie Database!");
		
		MovieDatabase database = new MovieDatabase();
		String title;
		int year;
		double rating;
		String director;
		int grossing;
		String fileName;

		boolean quit = false;
		while (!quit)
		{
			System.out.println("Would you like to..." + '\n' + "1) add a movie" + '\n'
					+ "2) remove a movie" + '\n' + "3) sort by title" + '\n' 
					+ "4) sort by rating" + '\n' + "5) sort by box office grossing" + '\n'
					+ "6) find movies by a specfic director" + '\n' + "7) print database to file" + '\n'
					+ "8) read a file" + '\n' + "9) print database" + '\n' 
					+ "0) quit" + '\n' + "Enter a selection.");
			int selection = keyboard.nextInt();
			keyboard.nextLine();
			
			// switch case based on which action the user wants to do
			switch (selection)
			{
				// adds a movie
				case 1:
					System.out.println("Enter a title.");
					title = keyboard.nextLine();
					System.out.println("Enter a year.");
					year = keyboard.nextInt();
					keyboard.nextLine();
					System.out.println("Enter a rating.");
					rating = keyboard.nextDouble();
					keyboard.nextLine();
					System.out.println("Enter a director.");
					director = keyboard.nextLine();
					System.out.println("Enter the box office grossing.");
					grossing = keyboard.nextInt();
					keyboard.nextLine();
					
					Movie movieToAdd = new Movie(title, year, rating, director, grossing);
					database.addMovie(movieToAdd);
					break;
					
				case 2:
					System.out.println("Enter a title.");
					title = keyboard.nextLine();
					System.out.println("Enter a year.");
					year = keyboard.nextInt();
					keyboard.nextLine();
					System.out.println("Enter a rating.");
					rating = keyboard.nextDouble();
					keyboard.nextLine();
					System.out.println("Enter a director.");
					director = keyboard.nextLine();
					System.out.println("Enter the box office grossing.");
					grossing = keyboard.nextInt();
					keyboard.nextLine();
					
					Movie movieToRemove = new Movie(title, year, rating, director, grossing);
					database.removeMovie(movieToRemove);
					break;
					
				case 3:
					database.sortByTitle();
					break;
					
				case 4:
					database.sortByRating();
					break;
					
				case 5:
					database.sortByGrossing();
					break;
					
				case 6:
					System.out.println("Enter a director.");
					director = keyboard.nextLine();
					database.findByDirector(director);
					break;
					
				case 7:
					System.out.println("Enter the name you want for the file.");
					fileName = keyboard.nextLine();
					database.printFile(fileName);
					break;
					
				case 8:
					System.out.println("Enter the name of the file.");
					fileName = keyboard.nextLine();
					database.readFile(fileName);
					break;
					
				case 9:
					database.printDatabase();
					break;
					
				// quits
				case 0:
				System.out.println("Goodbye!");
				quit = true;
				System.exit(0);
			}
		}
		
		keyboard.close();
	}

}
