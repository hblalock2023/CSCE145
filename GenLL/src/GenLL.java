/*
 * 01.30.2020
 * In-Class Example
 */

import java.util.Iterator;

// generic linked list of type T (any object type)
public class GenLL <T> implements Iterable <T> {
	
	// internal class
	private class ListNode
	{
		private T data;
		private ListNode link;
		
		public ListNode(T data, ListNode link)
		{
			this.data = data;
			this.link = link;
		}		
	}
	
	private class ListIterator implements Iterator<T>
	{
		private ListNode iCurr;
		
		public ListIterator(ListNode head)
		{
			iCurr = head;
		}
		
		public boolean hasNext()
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
	
	public Iterator<T> iterator()
	{
		return new ListIterator(head);
	}
	
	private ListNode head; // always first element
	private ListNode curr; // current node of interest
	private ListNode prev; // one node behind current
	
	public GenLL()
	{
		head = curr = prev = null;
	}
	
	public T getCurr()
	{
		if (curr != null)
		{
			return curr.data;
		}
		return null;
	}
	
	public void setCurr(T data)
	{
		if (curr != null)
		{
			this.curr.data = data;
		}
	}
	
	public void goToNext()
	{
		if (curr != null)
		{
			prev = curr;
			curr = curr.link;
		}
	}
	
	public void reset()
	{
		curr = head;
		prev = null;
	}
	
	public boolean hasMore()
	{
		return curr != null;
	}
	
	// adds to the end
	public void add(T data)
	{
		ListNode newNode = new ListNode(data, null);
		if (head == null) // empty list
		{
			head = curr = newNode;
			return;
		}
		
		ListNode temp = head;
		while (temp.link != null)
		{
			temp = temp.link;
		}
		
		temp.link = newNode;
	}
	
	public void addAfterCurr(T data)
	{
		if (curr == null)
		{
			return;
		}
		
		ListNode newNode = new ListNode(data, curr.link);
		curr.link = newNode;
	}
	
	public void removeCurr()
	{
		if (curr != null && prev != null)
		{
			prev.link = curr.link;
			curr = curr.link;
		}
		else if (curr != null && prev == null)
		{
			head = head.link;
			curr = head;
		}
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
}
