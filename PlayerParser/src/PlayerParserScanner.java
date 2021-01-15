/*
 * In-Class Example
 * 09/04/2019
 */

import java.util.Scanner;

public class PlayerParserScanner {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter player name, id, x,y,z");
		String input = keyboard.nextLine();
		
		Scanner strScanner = new Scanner(input);
		String name = strScanner.next(); // captures a string up until the next space
		int id = strScanner.nextInt();
		double x = strScanner.nextDouble();
	}

}
