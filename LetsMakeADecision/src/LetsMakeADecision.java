/*
 * In-Class Example
 * 09/11/2019
 */

import java.util.Scanner;

public class LetsMakeADecision {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String cont1Prize = "Nothing";
		String cont2Prize = "Nothing";
		
		String boxPrize = "Free Assignment";
		String dollarPrize = "One Dollar";
		String pocketPrize = "Finely-Crafted Paper Crane";
		
		System.out.println("Contestant one you may \"keep\", \"box\", or \"pocket\".");
		
		String answer = keyboard.nextLine();
		
		if(answer.equalsIgnoreCase("box"))
		{
			cont1Prize = boxPrize;
			System.out.println("Contestant two you may \"keep\" or \"pocket\".");
			answer = keyboard.nextLine();
			
			if(answer.equalsIgnoreCase("pocket"))
			{
				cont2Prize = pocketPrize;
			}
			else if (answer.equalsIgnoreCase("keep"))
			{
				cont2Prize = dollarPrize;
			}
			else
			{
				System.out.println("You can't do that.");
				System.exit(0);
			}
		}
		
		else if(answer.equalsIgnoreCase("pocket"))
		{
			cont1Prize = pocketPrize;
			System.out.println("Contestant two you may \"keep\" or \"box\".");
			answer = keyboard.nextLine();
			
			if(answer.equalsIgnoreCase("box"))
			{
				cont2Prize = boxPrize;
			}
			else if (answer.equalsIgnoreCase("keep"))
			{
				cont2Prize = dollarPrize;
			}
			else
			{
				System.out.println("You can't do that.");
				System.exit(0);
			}
		}
		
		else if(answer.equalsIgnoreCase("keep"))
		{
			cont1Prize = dollarPrize;
			System.out.println("Contestant two you may \"pocket\" or \"box\".");
			answer = keyboard.nextLine();
			
			if(answer.equalsIgnoreCase("pocket"))
			{
				cont2Prize = pocketPrize;
			}
			else if (answer.equalsIgnoreCase("box"))
			{
				cont2Prize = boxPrize;
			}
			else
			{
				System.out.println("You can't do that.");
				System.exit(0);
			}
		}
		
		else
		{
			System.out.println("You can't do that.");
			System.exit(0);
		}
		
		System.out.println("Contest 1, your prize is a " + cont1Prize + "!");
		System.out.println("Contest 2, your prize is a " + cont2Prize + "!");

	}

}
