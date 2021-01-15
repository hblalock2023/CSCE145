/*
 * Lab 07
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 04.01.2020
 */

import java.util.*;
import java.io.*;

public class FruitTreeTester {

	public static void main(String[] args) {
		//sets up input
		Scanner keyboard = new Scanner(System.in);
		
		// gets file name
		System.out.println("Welcome to the fruit tree!");
		System.out.println("Please enter the name of a Fruit File.");
		String fileName = keyboard.nextLine();
		System.out.println("Retrieving tree file...");

		BinarySearchTree<Fruit> fruitTree = new BinarySearchTree<Fruit>();
		
		// retrieves ingormation from file
		try
		{
			Scanner fileScanner = new Scanner(new File(fileName));
			while(fileScanner.hasNextLine())
			{
				String fileLine = fileScanner.nextLine();
				String[] splitLine = fileLine.split("\t");
				if ( splitLine.length == 2)
				{
					String type = splitLine[0];
					double weight = Double.parseDouble(splitLine[1]);
					Fruit f = new Fruit(weight, type);
					fruitTree.add(f);
				}
			}
			fileScanner.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		// runs tests for each method
		System.out.println("Printing the in-order traversal...");
		fruitTree.printInOrder();
		System.out.println("\nPrinting the pre-order traversal...");
		fruitTree.printPreOrder();
		System.out.println("\nPrinting the post-order traversal...");
		fruitTree.printPostOrder();
		System.out.println("\nDeleting Apple 0.4859853412170728...");
		fruitTree.remove(new Fruit(0.485983412170728, "Apple"));
		System.out.println("Printing the in-order traversal...");
		fruitTree.printInOrder();
	}

}
