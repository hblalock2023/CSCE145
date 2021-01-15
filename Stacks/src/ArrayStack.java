/*
 * 02.13.2020
 * In-Class Example 
 */

public class ArrayStack<T> implements StackI<T> {

	private T[] stack;
	public static final int DEF_SIZE = 100;
	
	private int headIndex; // first null element (first element is headIndex - 1)
	
	public ArrayStack() 
	{
		
	}
	
	public ArrayStack(int size)
	{
		init(size);
	}
	
	public void init(int size)
	{
		if (size <= 0)
		{
			init(DEF_SIZE);
			return;
		}
		
		headIndex = 0;
		stack = (T[])(new Object[size]);
	}
	
	public void push(T data)
	{
		if (stack[stack.length-1] != null)
			return;
		
		stack[headIndex] = data;
		headIndex++;

	}
	
	public T pop()
	{
		if (headIndex == 0)
			return null;
		
		T ret = stack[headIndex-1];
		headIndex--;
		return ret;
	}
	
	public T peek()
	{
		if (headIndex == 0)
			return null;
		
		return stack[headIndex-1];
	}
	
	public void print()
	{
		for (int i = headIndex - 1; i >= 0; i--)
		{
			System.out.println(stack[i]);
		}
	}
}
