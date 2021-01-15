/*
 * 09/11/2019
 * Written by Hadley Blalock
 */

import java.util.*;

public class BinaryChanger {

	public static void main(String[] args) {
		// sets up and records input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a 4-bit binary number.");
		String firstBinary = keyboard.nextLine();
		System.out.println("Please enter a 4-bit binary number.");
		String secondBinary = keyboard.nextLine();
		
		// pulls out each individual number as a string
		String b1First = firstBinary.substring(0, 1); // takes the first number
		String b1Second = firstBinary.substring(1, 2); // takes the second number
		String b1Third = firstBinary.substring(2, 3); // takes the third number
		String b1Fourth = firstBinary.substring(3, 4); // takes the fourth number
		
		// converts the strings to integers to be used in calculations
		int b1OnesPlace = Integer.parseInt(b1Fourth); // the fourth number is in the ones place in binary
		int b1TwosPlace = Integer.parseInt(b1Third); // the third number is in the twos place in binary
		int b1FoursPlace = Integer.parseInt(b1Second); // the second number is in the fours place in binary
		int b1EightsPlace = Integer.parseInt(b1First); // the first number is in the eights place in binary
		
		// repeats the same methods for the second input
		String b2First = secondBinary.substring(0, 1);
		String b2Second = secondBinary.substring(1, 2);
		String b2Third = secondBinary.substring(2, 3);
		String b2Fourth = secondBinary.substring(3, 4);
			
		int b2OnesPlace = Integer.parseInt(b2Fourth);
		int b2TwosPlace = Integer.parseInt(b2Third);
		int b2FoursPlace = Integer.parseInt(b2Second);
		int b2EightsPlace = Integer.parseInt(b2First);
	
		// converts the two binary numbers to base 10
		// i used hard numbers for the conversion instead of Math.pow(2, x) because it returns a double and not an integer
		//                                   2^0                 2^1                  2^2                   2^3
		int firstBinaryToInt = (b1OnesPlace * 1) + (b1TwosPlace * 2) + (b1FoursPlace * 4) + (b1EightsPlace * 8);
		int secondBinaryToInt = (b2OnesPlace * 1) + (b2TwosPlace * 2) + (b2FoursPlace * 4) + (b2EightsPlace * 8);
		
		// adds the two numbers
		int addedInteger = firstBinaryToInt + secondBinaryToInt;
		
		// prints the two numbers from the conversion as their base 10 values
		System.out.println("The first number is: " + firstBinaryToInt);
		System.out.println("The second number is: " + secondBinaryToInt);
		
		// prints the added value as a base 10 number
		System.out.println("The two added together is: " + addedInteger);
		
		// converts the added number back to binary
		// based on the remainder method shown in class
		int addedOnesPlace = addedInteger%2;
		addedInteger = addedInteger/2; 
		int addedTwosPlace = addedInteger%2;
		addedInteger = addedInteger/2;
		int addedFoursPlace = addedInteger%2;
		addedInteger = addedInteger/2;
		int addedEightsPlace = addedInteger%2;
		// builds the binary number
		String addedBinary = "" + addedOnesPlace + "" + addedTwosPlace + "" + addedFoursPlace + "" + addedEightsPlace;
		
		// prints out the added number in binary
		System.out.println("Which is " + addedBinary + " in binary.");

	}

}
