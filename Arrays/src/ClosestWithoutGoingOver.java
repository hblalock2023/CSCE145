/*
 * In-Class Example
 * 09/23/2019
 */

import java.util.*;

public class ClosestWithoutGoingOver {
	
	public static final double REAL_PRICE = 4.69;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double[] priceGuesses = new double[10];
		System.out.println("Guess, closest without going over, the price of Shaq-Fu");
		
		for (int i = 0; i < priceGuesses.length; i++)
		{
			System.out.println("Contestant " + i + ", enter a price!");
			priceGuesses[i] = keyboard.nextDouble();
		}
		
		keyboard.close();
		
		System.out.println("The real price is... " + REAL_PRICE);
		int winIndex = -1;
		double closePrice = -1.0; //sentinel value
		
		for(int i = 0; i < priceGuesses.length; i++)
		{
			if (priceGuesses[i] <= REAL_PRICE && priceGuesses[i] > closePrice)
			{
				winIndex = i;
				closePrice = priceGuesses[i];
			}
		}
		
		if (winIndex == -1)
		{
			System.out.println("No one won :)");
		}
		else
		{
			System.out.println("The winner is Contestant " + winIndex + " with " + closePrice + "!");
		}
	}

}
