/*
 * In-Class Example
 * 09/23/2019 
 */

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = new int[10];
		Random r = new Random();
		
		for (int i = 0; i < a.length; i++)
		{
			a[i] = r.nextInt();
		}
		
		boolean hasSwapped = true;
		
		while (hasSwapped)
		{
			hasSwapped = false;
			for (int i = 0; i < a.length - 1; i++)
			{
				if (a[i] > a[i + 1])
				{
					// swap
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					hasSwapped = true;
				}
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

}
