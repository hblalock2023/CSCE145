/*
 * 02.1.2020
 * In-Class Example 
 */

public class LLQueue<T> implements QueueI<T> {
	
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

	public LLQueue()
	{
		head = tail = null;
	}
	
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
	
	public T dequeue()
	{
		if(head == null)
			return null;
		T ret = head.data;
		head = head.link;
		return ret;
	}
	public T peek()
	{
		if(head == null)
		{
			return null;
		}
		return head.data;
	}
	
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
