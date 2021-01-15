/*
 * 09/18/2019
 * In-Class Example
 */

import java.util.*;

public class NestedForLoop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a length and width and I'll draw a box.");
		int length = keyboard.nextInt();
		int width = keyboard.nextInt();
		
		if (length <= 0 || width <= 0)
		{
			System.out.println("Wrong dim.");
			System.exit(0);
		}
		
		for (int i = 0; i < length; i++) // vertical
		{
			for (int j = 0; j < width; j++) // horizontal
				{
					System.out.print("*"); // stays on same line
				}
			
			System.out.println(); // skips down to the next line
		}
	}

}
