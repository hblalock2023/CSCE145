/*
 * Homework 03
 * 02.19.2020
 * Hadley Blalock
 */

import java.io.File;
import java.util.Scanner;

public class RobotCommandSimulator {

	// attributes
	private char board[][];
	private LLQueue<String> moves;
	private static final int SIZE = 10;
	
	// constructor
	public RobotCommandSimulator()
	{
		board = new char[SIZE][SIZE];
		moves = new LLQueue<String>();
	}
	
	// creates board from board file
	public void createBoard(String fileName)
	{
		try 
		{
			Scanner file = new Scanner(new File(fileName));
			
			for (int i = 0; i < SIZE; i++)
			{
				board[i] = file.nextLine().toCharArray(); // adds each element one character at a time
				System.out.println(board[i]);
			}
			
			file.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// prints board
	public void printBoard()
	{
		for (int i = 0; i < SIZE; i++)
		{
			System.out.println(board[i]);
		}
	}
	
	// makes move
	public void move(String fileName)
	{
		try 
		{
			Scanner file = new Scanner(new File(fileName));
			int x = 0, y = 0, count = 0;
			
			while (file.hasNext())
			{
				
				moves.enqueue(file.nextLine()); // takes in command
				System.out.println("Command " + count);
				
				// switches move based on command
				// crashes if spot isn't free
				switch (moves.peek())
				{
					case "left":
						if (check(x, (y-1)))
						{
							System.out.println("CRASH!");
							break;
						}
						
						board[x][y] = '_';
						board[x][y-1] = 'O';
									
						printBoard();
						y -= 1;
						count++;
					
						break;
					case "right":
						if (check(x, (y+1)))
						{							
							System.out.println("CRASH!");
							break;
						}
						
						board[x][y] = '_';
						board[x][y+1] = 'O';
									
						printBoard();
						y += 1;
						count++;
					
						break;
					case "down":
						if (check((x+1), y))
						{
							System.out.println("CRASH!");
							break;
						}
						
						board[x][y] = '_';
						board[x+1][y] = 'O';
									
						printBoard();
						x += 1;
						count++;
					
						break;
					case "up":
						if (check((x-1), y))
						{
							System.out.println("CRASH!");
							break;
						}
						
						board[x][y] = '_';
						board[x-1][y] = 'O';
									
						
						printBoard();
						x -= 1;
						count++;
					
						break;
					default:
						System.out.println("Invalid move.");
						System.exit(0);
				}
				
				moves.dequeue(); // removes command
			}
			
			file.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	// checks that location being moved into is open
	public boolean check(int x, int y)
	{		
		if (board[x][y] == '_')
		{
			return false;
		}		
		return true;
	}

	
}
