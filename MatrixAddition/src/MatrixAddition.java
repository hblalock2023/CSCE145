/*
 * 09/26/2019
 * Lab 10
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008
 */

import java.util.*;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Welcome to the Matrix Addition Calculator!");
		
		// gets user input for size and builds the first matrix
		System.out.println("Please enter the length and width of the first matrix.");
		int matrixOneLength = keyboard.nextInt();
		keyboard.nextLine();
		int matrixOneWidth = keyboard.nextInt();
		keyboard.nextLine();
		int[][] one = new int[matrixOneLength][matrixOneWidth];
		
		// has the user input values for each index in the matrix
		for (int i = 0; i < one.length; i++)
		{
			for (int j = 0; j < one[i].length; j++)
			{
				System.out.println("Enter a value at " + i + j);
				one[i][j] = keyboard.nextInt();
				keyboard.nextLine();
			}
		}
		
		// gets user input for size and builds the first matrix
		System.out.println("Please enter the length and width of the second matrix.");
		int matrixTwoLength = keyboard.nextInt();
		keyboard.nextLine();
		int matrixTwoWidth = keyboard.nextInt();
		keyboard.nextLine();
		int[][] two = new int[matrixTwoLength][matrixTwoWidth];
		
		// checks to make sure the first and second matrices are the same size before continuing
		if (matrixOneLength != matrixTwoLength || matrixOneWidth != matrixTwoWidth)
		{
			System.out.println("Those dimmensions are invalid. Matrix Two's dimmensions must be equal to Matrix One's.");
			System.exit(0);
		}
		
		// has the user input values for each index in the matrix
		for (int i = 0; i < two.length; i++)
		{
			for (int j = 0; j < two[i].length; j++)
			{
				System.out.println("Enter a value at " + i + j);
				two[i][j] = keyboard.nextInt();
				keyboard.nextLine();
			}
		}
		
		keyboard.close();
		
		// matrices should be the same size, so the size of the sum matrix is the same as either matrix
		int sumLength = matrixOneLength; // or sumLength = matrixTwoLength;
		int sumWidth = matrixOneWidth; // or sumWidth = matrixTwoWidth;
		
		// builds empty sum matrix
		int sum[][] = new int[sumLength][sumWidth];
		
		// fills sum matrix with the sum of the two numbers at each index in the two matrices
		for (int i = 0; i < sum.length; i++)
		{
			for (int j = 0; j < sum[i].length; j++)
			{
				sum[i][j] = one[i][j] + two[i][j];
			}
		}
		
		// prints our the first matrix
		for (int i = 0; i < one.length; i++)
		{
			for (int j = 0; j < one[i].length; j++)
			{
				System.out.print(one[i][j] + " ");
				
			}

			System.out.println();
		}
		
		// prints the plus
		System.out.println("+");
		
		// prints the second matrix
		for (int i = 0; i < two.length; i++)
		{
			for (int j = 0; j < two[i].length; j++)
			{
				System.out.print(two[i][j] + " ");
			}
			
			System.out.println();
		}
		
		// prints the equals sign
		System.out.println("=");
		
		// prints the sum matrix
		for (int i = 0; i < sum.length; i++)
		{
			for (int j = 0; j < sum[i].length; j++)
			{
				System.out.print(sum[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
