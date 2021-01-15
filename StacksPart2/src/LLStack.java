/* In-Class Example
 * 02.18202
 */

import java.util.*;

public class LLStack<T> implements StackI<T> {
	
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
	
	private ListNode head;
	private int size;
	
	public LLStack()
	{
		head = null;
		size = 0;
	}
	
	private class ListIterator implements Iterator<T>
	{
		private ListNode iCurr;
		public ListIterator(ListNode head)
		{
			iCurr = head;
		}
		
		public  boolean hasNext()
		{
			return iCurr != null;
		}
		
		public T next()
		{
			T ret = iCurr.data;
			iCurr = iCurr.link;
			return ret;
		}
	}
	
	public Iterator iterator()
	{
		return new ListIterator(head);
	}
	
	public void push(T data)
	{
		ListNode newNode = new ListNode(data, head);
		
		head = newNode;
		size++;
	}
	
	public T pop()
	{
		if (head == null)
			return null;
		
		T ret = head.data;
		head = head.link;
		size--;
		return ret;
	}
	
	public T peek()
	{
		if (head == null)
			return null;
		
		return head.data;
	}
	
	public void print()
	{
		ListNode temp = head;
		while (temp != null)
		{
			System.out.println(temp.data);
			temp = temp.link;
		}
	}
	
	public int size()
	{
		return this.size;
	}
	
}
