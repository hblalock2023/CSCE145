/*
 * Lab 00
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 01.14.2020
 */

import java.util.*;

public class MineSweeper {

	private static Random rand = new Random();
	private static final int SIZE = 10;
	
	public static void main(String[] args) {
		String[][] board = new String[SIZE][SIZE];

		// Builds Empty Board
		System.out.println("Creating empty board...");
		// fills each spot of the array with "-"
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
					board[i][j] = "-";
			}
		}
		
		printArray(board);

		// Inserts Mines
		System.out.println("Placing mines...");
		for (int i = 0; i < 10; i++)
		{
			// generates a random number between 0 and the size of the x axis
			int xNum = rand.nextInt(SIZE);
			// generates a random number between 0 and the size of the y axis
			int yNum = rand.nextInt(SIZE);
			// prints a "*" in the spot chosen
			if (board[xNum][yNum].equals("-"))
			{
				board[xNum][yNum] = "*";
			}
			
		}
		
		printArray(board);
		
		// Mine Counter
		System.out.println("Counting mines...");
		int counter = 0;
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				// checks if the spot has a mine
				if (board[i][j].equals("*"))
				{
					continue;
				}
				
				// checks to see if any of the surrounding spots have mines and increases 
				// the counter by one for each spot that does
				// also checks for out of bounds errors
				if(i > 0 && j > 0 && board[i-1][j-1].equals("*"))
				{
					counter+=1;
				}
				if(i > 0 && board[i-1][j].equals("*"))
				{
					counter+=1;
				}
				if(i > 0 && j < board[i].length-1 && board[i-1][j+1].equals("*"))
				{
					counter+=1;
				}
				if(j > 0 && board[i][j-1].equals("*"))
				{
					counter+=1;
				}
				if(j < board[i].length-1 && board[i][j+1].equals("*"))
				{
					counter+=1;
				}
				if(i < board.length-1 && j > 0 && board[i+1][j-1].equals("*"))
				{
					counter+=1;
				}
				if(i < board.length-1 && board[i+1][j].equals("*"))
				{
					counter+=1;
				}
				if(i < board.length-1 && j < board[i].length-1 && board[i+1][j+1].equals("*"))
				{
					counter+=1;
				}
				
				// assigns the counter value to that location on the board and resets the counter
				board[i][j] = Integer.toString(counter);
				counter = 0;
			}
		}
	
		printArray(board);
	}
	
	// method that prints a 2D array composed of strings
	private static void printArray(String[][] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				System.out.print(array[i][j]);
			}
			
			System.out.println();
		}
	}
}
