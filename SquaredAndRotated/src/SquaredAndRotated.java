/*
 * 09/04/2019
 * Written by Hadley Blalock
 * CSCE 145
 * Section 008 
 */

import java.util.Scanner;

public class SquaredAndRotated {

	public static void main(String[] args) {
		// prompts user for input and gets input
		System.out.println("Please enter a 4-digit whole number to see a magic trick!");
		Scanner keyboard = new Scanner(System.in);
		String number = keyboard.nextLine();
		
		// assigns each number of the string to a variable to be used 
		//example: 1234 --> firstNum = 1, secondNum = 2, thirdNum = 3, fourthNum = 4
		char firstNum = number.charAt(0); 
		char secondNum = number.charAt(1);
		char thirdNum = number.charAt(2);
		char fourthNum = number.charAt(3);
		
		//prints the number as a box
		System.out.println(firstNum +""+ secondNum +""+ thirdNum +""+ fourthNum + '\n' 
				+ secondNum + "  " + thirdNum + '\n' + thirdNum + "  " + secondNum + '\n' 
				+ fourthNum +""+ thirdNum +""+ secondNum +""+ firstNum + '\n');

		// prints the number as a box that's been rotated counter clockwise once
		System.out.println(secondNum +""+ thirdNum +""+ fourthNum +""+ thirdNum + '\n' 
				+ firstNum + "  " + secondNum + '\n' + secondNum + "  " + firstNum + '\n' 
				+ thirdNum +""+ fourthNum +""+ thirdNum +""+ secondNum + '\n');

		// prints the number as a box that's been rotated counter clockwise twice
		System.out.println(thirdNum +""+ fourthNum +""+ thirdNum +""+ secondNum + '\n' 
				+ secondNum + "  " + firstNum + '\n' + firstNum + "  " + secondNum + '\n' 
				+ secondNum +""+ thirdNum +""+ fourthNum +""+ thirdNum + '\n');
		
	}

}
