/*
 * 02.27.2020
 * In-Class Example
 */

import java.util.*;

public class SimpleRecursion {

	public static void main(String[] args) {
		
		countDown(5);
	}
	
	public static void countDown(int num)
	{
		System.out.println(num);
		if (num <= 0) // halting condition
			return;
		else
			countDown(num-1); // recursive step
	}
	
	public static int factorial(int num)
	{
		if (num <= 0)
			return 1;
		else
			return num * factorial(num-1);
			
	}
	
	public static int gcd(int a, int b)
	{
		if (b<= 0)
			return a;
		else
			return gcd(b, a%b);
	}
	
	public static int fibonacci(int num)
	{
		if (num == 1 || num == 2)
			return 1;
		else
			return fibonacci(num-1) + fibonacci(num-2);
	}
}
