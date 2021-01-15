/*
 * 02.13.2020
 * In-Class Example 
 */

public class Tester {

	public static void main(String[] args) {
		
		StackI<String> sStack = new ArrayStack<String>();
		
		for (int i = 0; i < 10; i++)
		{
			sStack.push("String" + i);
		}
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(sStack.pop());
		}
		
	}
}
