/*
 * In-Class Example
 * 01.14.2020
 */

import java.util.*;

public class BubbleSort {

	public static final int R_RANGE = 100;
	
	public static void main(String[] args) {
		Random r = new Random();
		int[] a = new int[5];
		
		for (int i = 0; i < a.length; i++)
		{
			a[i] = r.nextInt(R_RANGE);
		}
		
		printArray(a);
		
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			
			for(int i = 0; i < a.length; i++)
			{
				if(a[i] > a[i+1])
				{
					hasSwapped = true;
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
					
		}
	}
	
	public static void printArray(int[] cat) 
	{
		for(int i : cat)
		{
			System.out.println(i);
		}
		
		System.out.println();
	}
}
