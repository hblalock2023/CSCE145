/*
 * Homework 03
 * 02.19.2020
 * Hadley Blalock
 */

public class LLQueue<T> implements QueueI<T> {
	
	// creates ListNode class
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
	private ListNode head; //first element
	private ListNode tail; //last element

	// default constructor
	public LLQueue()
	{
		head = tail = null;
	}
	
	// adds item
	public void enqueue(T data)
	{
		ListNode newNode = new ListNode(data, null);
		if(head == null)
		{
			head = newNode;
			tail = head;
			return;
		}
		tail.link = newNode;
		tail = tail.link;
	}
	
	// removes item
	public T dequeue()
	{
		if(head == null)
			return null;
		T ret = head.data;
		head = head.link;
		return ret;
	}
	
	// returns head data
	public T peek()
	{
		if(head == null)
		{
			return null;
		}
		return head.data;
	}
	
	// prints queue
	public void print()
	{
		ListNode temp = head;
		while(temp != null) 
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
}
