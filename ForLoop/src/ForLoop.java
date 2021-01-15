/*
 * 09/18/2019
 * In-Class Example * 
 */

import java.util.*;

public class ForLoop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a number and I'll count up to it by 8.");
		int num = keyboard.nextInt();
		keyboard.close();
		
		// no negative values
		if(num < 0)
		{
			System.exit(0);
		}
		
		/*for (int i = 0; i <= num; i++)
		{
			if (i % 8 == 0)
			{
				System.out.println(i);
			}
		}*/
		
		for (int i = 0; i <= num; i+=8)
		{
			System.out.println(i);
		}
		
	}

}
