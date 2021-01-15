/*
 * 09/02/2019
 * Written by Hadley Blalock
 * CSCE 145 
 * Section 008
 * 
 */

import java.util.Scanner;

public class CoinMachine {

	// declares the value of each coin as a unchangeable global variable
	private static final int quarter = 25;
	private static final int dime = 10;
	private static final int nickel = 5;
	private static final int penny = 1;
	
	public static void main(String[] args) {
		// prints dialogue and prompts user for input 
		System.out.println("Enter a whole number from 1 to 99 and I'll compute your combination of coins.");
		Scanner keyboard = new Scanner(System.in);
		// assigns user input to a variable
		int inputNum = keyboard.nextInt();
		
		// computes the number of quarters and how much is left
		int numQuarters = inputNum / quarter;
		int remainingNumAfterQuarters = inputNum % quarter;
		
		// computes the number of dimes and how much is left
		int numDimes = remainingNumAfterQuarters / dime;
		int remainingNumAfterDimes = remainingNumAfterQuarters % dime;
		
		// computes the number of nickels and how much is left
		int numNickels = remainingNumAfterDimes / nickel;
		int remainingNumAfterNickels = remainingNumAfterDimes % nickel;

		// computes the number of pennies
		int numPennies = remainingNumAfterNickels / penny;

		System.out.println(inputNum+" in cents is:"+'\n'+numQuarters+" quarters"+'\n'+numDimes+" dimes"+'\n'
		+numNickels+" nickels"+'\n'+numPennies+" pennies"+'\n'+"Good luck with the spending!");
	}

}
