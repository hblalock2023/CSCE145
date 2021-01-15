/*
 * 10.21.2019
 * Lab 14
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008 
 */

import java.util.*;

public class BoxSorter {

	public static void main(String[] args) {
		System.out.println("Welcome to the Box Sorter!");
		System.out.println("Enter some information about boxes and I'll sort them.");
		
		// builds an array of size five of box objects
		Box[] boxes = new Box[5];
		
		// has user input information for each box
		Scanner keyboard = new Scanner(System.in); // sets up input
		for(int i = 0; i < boxes.length; i++)
		{
			System.out.println("Please enter the label, length, width, and height of Box " + (i + 1) + ":");
			
			// creates a box
			boxes[i] = new Box();
			// uses mutator methods to get input
			boxes[i].setLabel(keyboard.nextLine());
			boxes[i].setLength(keyboard.nextDouble());
			keyboard.nextLine();
			boxes[i].setWidth(keyboard.nextDouble());
			keyboard.nextLine();
			boxes[i].setHeight(keyboard.nextDouble());
			keyboard.nextLine();
		}
		
		// closes the keyboard
		keyboard.close();
		
		// uses a bubble sort to organize the boxes based on volume in ascending order
		boolean hasSwapped = true;
		while (hasSwapped)
		{
			hasSwapped = false;
			for (int i = 0; i < boxes.length - 1; i++)
			{
				if (boxes[i].getVolume() > boxes[i + 1].getVolume())
				{
					// swap
					Box boxHolder = boxes[i];
					boxes[i] = boxes[i + 1];
					boxes[i + 1] = boxHolder;
					hasSwapped = true;	
				}
			}
		}
		
		// prints out the boxes in their new order
		System.out.println("Sorted Boxes:");
		for (int i = 0; i < boxes.length; i++)
		{
			System.out.println("Label: " + boxes[i].getLabel() + " Volume: " + boxes[i].getVolume());
		}

	}

}
