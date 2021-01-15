/*
 * In-Class Example 
 * 09/04/2019
 */

import java.util.Scanner;


public class PlayerParser {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter player name, id, x,y,z");
		String input = keyboard.nextLine();
		String copyInput = input;
		// Get the name
		int workingIndex = copyInput.indexOf(" "); // Finds first index
		String name = copyInput.substring(0, workingIndex);	
		copyInput = copyInput.substring(workingIndex + 1);
		// Get the id
		workingIndex = copyInput.indexOf(" ");
		String sID = copyInput.substring(0, workingIndex);
		// Parse - Convert String to Int
		int id = Integer.parseInt(sID);
		copyInput = copyInput.substring(workingIndex + 1);
		// Get the x
		workingIndex = copyInput.indexOf(" ");
		String sX = copyInput.substring(0, workingIndex);
		double x = Double.parseDouble(sX);
		copyInput = copyInput.substring(workingIndex + 1);
		// Same for y and z
	}

}
