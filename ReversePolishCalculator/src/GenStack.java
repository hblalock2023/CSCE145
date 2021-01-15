/*
 * Lab 05
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 02.18.2020
 */

public class GenStack<T> implements StackInterface<T> {

	// constructs LIstNode class
	private class ListNode
	{
		T data;
		ListNode link;
		
		public ListNode(T data, ListNode link)
		{
			this.data = data;
			this.link = link;
		}
	}
	
	// attributes
	private ListNode head;
	private int size;
	
	// defaulat constructor
	public GenStack()
	{
		head = null;
		size = 0;
	}
	
	// adds item to stack at head
	public void push(T data)
	{
		ListNode newNode = new ListNode(data, head);
		
		head = newNode;	
		size++;
	}
	
	// removes item from head and returns its value
	public T pop()
	{
		if (head == null)
			return null;
		
		T ret = head.data;
		head = head.link;
		size--;
		return ret;
	}
	
	// returns head value
	public T peek()
	{
		if (head == null)
			return null;
		
		return head.data;
	}
	
	// accessor - returns size
	public int size()
	{
		return this.size;
	}
	
	// empties stack
	public void clear()
	{
		while(size > 0)
		{
			pop();
		}
	}
	
	// prints stack
	public void print()
	{
		for (ListNode temp = head; temp != null; temp = temp.link)
		{
			System.out.println(temp.data);
		}
	}
	
}
