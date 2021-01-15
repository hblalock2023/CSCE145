/*
 * Lab 05
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 02.18.2020
 */

import java.util.Scanner;

public class ReversePolishCalculator {

	// attribute
	private StackInterface<Integer> valueStack;
	
	// default constructor
	public ReversePolishCalculator()
	{
		valueStack = new GenStack<Integer>();
	}
	
	// calculate method
	public int calculate(String input)
	{
		// sets up scanner
		Scanner equation = new Scanner(input);
		
		while (equation.hasNext())
		{
			String term = equation.next(); // gets current term
			// initializes num1 and num2
			int num1, num2;
			
			// uses switch statement to determine operation
			switch (term) 
			{
				case "+":
					if (check())
						return 0;
					
					num1 = valueStack.pop();
					num2 = valueStack.pop();
					
					valueStack.push(num1 + num2);
					break;
				case "-":
					if (check())
						return 0;
					
					num1 = valueStack.pop();
					num2 = valueStack.pop();
					
					valueStack.push(num2 - num1);
					break;
				case "*":
					if (check())
						return 0;
					
					num1 = valueStack.pop();
					num2 = valueStack.pop();
					
					valueStack.push(num1 * num2);
					break;
				case "/":
					if (check())
						return 0;
					
					num1 = valueStack.pop();
					num2 = valueStack.pop();
					
					// checks divide by 0 error
					if (num1 == 0)
						System.out.println("Cannot divide by 0.");
					
					valueStack.push(num1 / num2);
					break;
				default:
					// checks if term is an integer
					if (isInt(term) == false)
					{
						System.out.println("Invalid Operator");
					}
					else
					{
						valueStack.push(Integer.parseInt(term)); // adds term to stack
					}
			}
		}
			
		equation.close();
		// checks size is one (should just be the answer at this point)
		if (valueStack.size() == 1)
		{
			return valueStack.pop(); // returns the answer
		}
		// otherwise, there were too many numbers
		System.out.println("This was not properly formatted. "
				+ "There were too many numbers and not enough operators.");
		valueStack.clear();
		return 0;
	}
		
	// checks that input equation is greater than two terms
	public boolean check()
	{
		if (valueStack.size() >= 2)
			return false;
		// operators were not being added to stack
		System.out.println("This was not properly formatted. "
				+ "There were too many operators and not enough numbers.");
		return true;
	}
	
	// checks that term is an integer
	public boolean isInt(String term)
	{
		try
		{
			Integer.parseInt(term);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}
	
	
}
