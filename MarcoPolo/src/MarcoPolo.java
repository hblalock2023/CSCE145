/*
 * 09/25/2019
 * In-Class Example 
 */

import java.util.*;

public class MarcoPolo {
	
	public static final int BOARD_SIZE = 10;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		Space[][] board = new Space[BOARD_SIZE][BOARD_SIZE];
		
		for (int i = 0; i < board.length; i++) 
		{
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = Space.Empty;
			}
			
		}
		
		int pX = 0;
		int pY = 0;
		board[pY][pX] = Space.Player;
		int gX = r.nextInt(BOARD_SIZE);
		int gY = r.nextInt(BOARD_SIZE);
		board[gY][gX] = Space.Goal;

		boolean gameOver = false;
		
		while (!gameOver)
		{
			//Print the matrix
			for (int i = 0; i < board.length; i++) 
			{
				for (int j = 0; j < board[i].length; j++)
				{
					switch(board[i][j])
					{
					case Player:
						System.out.print("X");
						break;
					case Goal:
						System.out.print("_");
						break;
				
					}
				}
				
			}
		}
		
	}

}
