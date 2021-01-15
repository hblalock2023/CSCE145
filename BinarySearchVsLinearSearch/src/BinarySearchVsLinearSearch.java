/*
 * Lab 06
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 03.25.2020
 */

import java.util.Random;

public class BinarySearchVsLinearSearch {
	
	// constants
	public static final int TESTS = 20;
	public static final int SIZE = 1000;
	// variables
	public static int linearCount = 0;
	public static int binaryCount = 0;
	public static int totalLinear = 0;
	public static int totalBinary = 0;
	
	public static void main(String[] args)
	{
		System.out.println("Welcome to the search tester!");
		System.out.println("We are going to see which algorithm performs best out of 20 tests.");
		
		// prints test number and runs test
		for (int i = 0; i < TESTS; i++)
		{
			for (int j = 0; j < 20; j++)
			{
				System.out.print("-");
			}
			System.out.println();
			System.out.println("Test " + i);
			for (int j = 0; j < 20; j++)
			{
				System.out.print("-");
			}
			System.out.println();
			
			test();
		}
		
		// prints results
		for (int j = 0; j < 20; j++)
		{
			System.out.print("-");
		}
		System.out.println();
		System.out.println("Results");
		for (int j = 0; j < 20; j++)
		{
			System.out.print("-");
		}
		System.out.println();
		// prints average tests for binary and linear
		System.out.println("Average Linear Checks: " + totalLinear/TESTS);
		System.out.println("Average Binary Checks: " + totalBinary/TESTS);
	}
	
	// gets sorted array and calls the two search methods
	public static void test()
	{
		int[] sortedArray = sort();
		Random r = new Random();
		int target = r.nextInt(SIZE);
		linearCount = binaryCount = 0;
		
		System.out.println("Searching using Linear Search. Found? " + linearSearch(sortedArray, target)); // calls linear search
		System.out.println("Searching using Binary Search. Found? " + binarySearch(sortedArray, target, 0, sortedArray.length-1)); // calls binary search
	
		// prints counts
		System.out.println("Linear Checks: " + linearCount);
		System.out.println("Binary Checks: " + binaryCount);
		
		// increases total count
		totalLinear += linearCount;
		totalBinary += binaryCount;
	}
	
	// generates a random array and sorts it
	public static int[] sort()
	{
		int[] ret = new int[SIZE];
		Random r = new Random();
		
		for (int i = 0; i < ret.length; i++)
		{
			ret[i] = r.nextInt(SIZE);
		}
		
		quickSort(ret, 0, ret.length-1);
		
		return ret;
	}
	
	// sorting algorithm
	public static void quickSort(int[] a, int leftIndex, int rightIndex)
	{
		int index = partition(a, leftIndex, rightIndex);
		
		if (leftIndex < index-1)
		{
			quickSort(a, leftIndex, index-1);
		}
		if (rightIndex > index)
		{
			quickSort(a, index, rightIndex);
		}
	}
	
	// helps quick sort
	public static int partition(int[] a, int leftIndex, int rightIndex)
	{
		int i = leftIndex;
		int j = rightIndex;
		int pivot = a[(leftIndex + rightIndex) / 2]; // middle pivot value
		
		while (i <= j)
		{
			while (a[i] < pivot)
				i++;
			while(a[j] > pivot)
				j--;
			
			if (i <= j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		
		return i;
	}
	
	// linear search
	public static boolean linearSearch(int[] a, int target)
	{
		for (int i = 0; i < a.length; i++)
		{
			linearCount++;
			
			if (a[i] == target)
			{
				return true; 
			}
		}
		return false;
	}
	
	// binary search
	public static boolean binarySearch(int[] a, int target, int start, int end)
	{
		if (start > end)
		{
			return false;
		}
		
		binaryCount++;
		
		int mid = ((start + end) / 2);
		if (a[mid] == target)
		{
			return true;
		}
		else if (target < a[mid])
		{
			return binarySearch(a, target, start, mid-1);		
		}
		else
		{
			return binarySearch(a, target, mid+1, end);
		}
	}
}
