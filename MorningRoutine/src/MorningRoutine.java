/*
 * 09/09/2019
 * In-Class Example
 */

import java.util.Scanner;

public class MorningRoutine {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Are you wearing pants?\nEnter \"yes\" or \"no\"");
		String isWearingPants = keyboard.nextLine();
		if(isWearingPants.equalsIgnoreCase("yes"))
		{
			System.out.println("Nice pants!");
		}
		else
		{
			System.out.println("nah. don't,, just don't");
		}
		
		
		/*
		boolean isWearingPants = keyboard.nextBoolean();
		//if(isWearingPants == true)
		if(isWearingPants)
		{
			System.out.println("Nice pants!");
		}
		else
		{
			System.out.println("Uh... try again");
		}
		*/
	}

}
