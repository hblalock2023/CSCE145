/*
 * Homework 00
 * Written by Hadley Blalock
 * 01.23.2020
 * CSCE 146 
 * Section 007
 */

import java.util.*;

public class TicTacToe {
	
	private static int SIZE = 3;

	public static void main(String[] args) {
		// sets up input
		Scanner keyboard = new Scanner(System.in);
		
		// builds board array and fills it with spaces
		String[][] board = new String[SIZE][SIZE];
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = " ";
			}
		}
		
		// starts game and prints empty board
		System.out.println("Let's Play Tic-Tac-Toe!");
		printBoard(board);
		
		// variable that is used to keep track of player wins
		int playerWins = 0;
		
		// game play loop
		boolean playing = true;
		while (playing)
		{
			System.out.println("Enter the coordinates (row, then column) to "
					+ "place an 'X' OR enter a negative number to quit.");
			// gets user input for row coordinate
			int playerX = keyboard.nextInt();
			// if negative number is entered, game ends
			if (playerX < 0)
			{
				quit(playerWins);
			}
			// if an invalid number is entered, the player's move restarts
			else if (playerX > 2)
			{
				System.out.println("Invalid move.");
				continue;
			}

			// gets user input for column coordinate
			int playerY = keyboard.nextInt();
			// if negative number is entered, game ends
			if (playerY < 0)
			{
				quit(playerWins);
			}
			// if an invalid number is entered, the player's move restarts
			else if (playerY > 2)
			{
				System.out.println("Invalid move.");
				continue;
			}
			
			// places "X" in input spot unless there is already a move placed there
			// if there is already a move there, the player's turn restarts
			if (board[playerY][playerX].equals(" "))
			{
				board[playerY][playerX] = "X";
			}
			else
			{
				System.out.println("Invalid move.");
				continue;
			}
			
			// checks if player won after their move
			// if they did win, the winning board is printed and a new game starts
			if (checkPlayerWin(board) == true)
			{
				printBoard(board);
				System.out.println("You win!");
				playerWins += 1;
				System.out.println("Computer demands a rematch.");
				board = resetBoard();
				continue;
			}
			
			// checks if board is full, if it reaches this and board is full it means no one has one
			// and there is a tie, so it starts a new game
			if(boardFull(board) == true)
			{
				System.out.println("CAT!");
				System.out.println("Computer demands a rematch.");
				board = resetBoard();
				continue;
			}
			
			// Computer's Move
			System.out.println("Computer's turn...");
			Random rand = new Random();
			// uses a loop to keep picking a random spot until an empty one is found
			boolean computerMove = false;
			while (!computerMove)
			{
				// picks random spot
				int computerX = rand.nextInt(SIZE);
				int computerY = rand.nextInt(SIZE);
				
				// checks if that spot is empty
				if (board[computerY][computerX].equals(" "))
				{
					board[computerY][computerX] = "O";
					computerMove = true;
				}
				// if it isn't empty the loop restarts
				else
				{
					continue;
				}
			}
					
			// prints board with new moves
			printBoard(board);
			
			// checks to see if computer won
			if (checkComputerWin(board) == true)
			{
				System.out.println("Computer wins!");
				// asks player to play again
				System.out.println("Would you like to play again? Enter 'Yes' or 'No'.");
				keyboard.nextLine();
				String answer = keyboard.nextLine();
				
				if (answer.equalsIgnoreCase("Yes"))
				{
					board = resetBoard();
					continue;
				}
				// game ends if they say no
				else 
				{
					quit(playerWins);
				}
			}
		}
		
		keyboard.close();
	}

	// helper method to clear board for new game
	public static String[][] resetBoard()
	{
		String[][] board = new String[SIZE][SIZE];
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = " ";
			}
		}
		
		return board;
	}
	
	// prints board with board array that contains the moves
	
	public static void printBoard(String[][] board)
	{
		System.out.println("   | 0 | 1 | 2 ");
		System.out.println("----------------");
		System.out.println(" 0 | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
		System.out.println("----------------");
		System.out.println(" 1 | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
		System.out.println("----------------");
		System.out.println(" 2 | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
	}
	
	// helper method to check and see if the player has won by checking every 
	// potential winning combination of "X"'s

	public static boolean checkPlayerWin(String[][] board)
	{
		if (board[0][0].equals("X") && board[1][0].equals("X") && board[2][0].equals("X"))
		{
			return true;
		}
		else if (board[0][1].equals("X") && board[1][1].equals("X") && board[2][1].equals("X"))
		{
			return true;
		}
		else if (board[0][2].equals("X") && board[1][2].equals("X") && board[2][2].equals("X"))
		{
			return true;
		}
		else if (board[0][0].equals("X") && board[0][1].equals("X") && board[0][2].equals("X"))
		{
			return true;
		}
		else if (board[1][0].equals("X") && board[1][1].equals("X") && board[1][2].equals("X"))
		{
			return true;
		}
		else if (board[2][0].equals("X") && board[2][1].equals("X") && board[2][2].equals("X"))
		{
			return true;
		}
		else if (board[0][0].equals("X") && board[1][1].equals("X") && board[2][2].equals("X"))
		{
			return true;
		}
		else if (board[2][0].equals("X") && board[1][1].equals("X") && board[0][2].equals("X"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// helper method to check and see if the computer has won by checking every 
	// potential winning combination of "O"'s
	
	public static boolean checkComputerWin(String[][] board)
	{
		if (board[0][0].equals("O") && board[1][0].equals("O") && board[2][0].equals("O"))
		{
			return true;
		}
		else if (board[0][1].equals("O") && board[1][1].equals("O") && board[2][1].equals("O"))
		{
			return true;
		}
		else if (board[0][2].equals("O") && board[1][2].equals("O") && board[2][2].equals("O"))
		{
			return true;
		}
		else if (board[0][0].equals("O") && board[0][1].equals("O") && board[0][2].equals("O"))
		{
			return true;
		}
		else if (board[1][0].equals("O") && board[1][1].equals("O") && board[1][2].equals("O"))
		{
			return true;
		}
		else if (board[2][0].equals("O") && board[2][1].equals("O") && board[2][2].equals("O"))
		{
			return true;
		}
		else if (board[0][0].equals("O") && board[1][1].equals("O") && board[2][2].equals("O"))
		{
			return true;
		}
		else if (board[2][0].equals("O") && board[1][1].equals("O") && board[0][2].equals("O"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// helper method to check if the board is full
	
	public static boolean boardFull(String[][] board)
	{
		int emptySpots = 9;
		for (int i = 0; i < board.length; i++)
		{
			for (int j = 0; j < board[i].length; j++)
			{
				// if the spot is not empty, the number of empty spots decreases by 1
				if (!board[i][j].equals(" "))
				{
					emptySpots -= 1;
				}
			}
		}
		
		// if there are no empty spots the board is full and the method returns true
		// otherwise it returns false
		if(emptySpots == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// quit method
	
	public static void quit(int playerWins)
	{
		System.out.println("Computer wins! Thanks for playing.");
		System.out.println("You won " + playerWins + " times!");
		System.exit(0);
	}

}
