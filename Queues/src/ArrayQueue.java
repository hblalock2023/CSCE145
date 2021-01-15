/*
 * 02.1.2020
 * In-Class Example 
 */

public class ArrayQueue<T> implements QueueI<T>{
	
	private T[] queue;
	private int tailIndex; //is the first null element. last element is tailIndex-1
	private int headIndex; 
	public static final int DEF_SIZE = 100;
	
	public ArrayQueue()
	{
		init(DEF_SIZE);
	}
	
	public ArrayQueue(int size)
	{
		init(size);
	}
	
	private void init(int size)
	{
		if(size <= 0)
		{
			init(DEF_SIZE);
			return;
		}
		tailIndex = headIndex = 0;
		queue = (T[])(new Object[size]);
	}
	
	public void enqueue(T data)
	{
		if(queue[headIndex]!= null && tailIndex == headIndex)
			return;
		queue[tailIndex] = data;
		tailIndex = (tailIndex+1)%queue.length;
		
	}
	public T dequeue()
	{
		T ret = queue[headIndex];
		headIndex = (headIndex+1)%queue.length;
		return ret;
	}
	
	public T peek()
	{
		return queue[headIndex];
	}
	
	public void print()
	{
		for(int i = headIndex; i != tailIndex; i=(i+1)%queue.length)
		{
			System.out.println(queue[i]);
		}
	}

}
