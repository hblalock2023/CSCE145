/*
 * In-Class Example - Non-Circular Singly Linked List
 * 02.04.2020
*/

import java.util.Iterator;

public class GenLL <T> implements Iterable <T> { 
	
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
	
	private ListNode head; // always first element
	private ListNode curr; // current node of interest used outside
	private ListNode prev; // one node behind curr
	//private ListNode tail; // always the last element
	
	public GenLL()
	{
		head = curr = prev = null;
	}

	public Iterator<T> iterator() 
	{
		return new ListIterator(head);
	}
	
	public void add(T data)
	{
		ListNode newNode = new ListNode(data, null);
		//ListNode newNode = new ListNode(data, head); // circular version
		
		if (head == null)
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
	
	public void removeCurrent()
	{
		if (curr != null && prev == null)
		{
			head = head.link;
			curr = head;
		}
		else if (curr != null && prev != null)
		{
			prev.link = curr.link;
			curr = curr.link;
		}
	}
	
	public void goToNext()
	{
		if (curr != null)
		{
			curr = curr.link;
		}
	}
	
	public void resetCurrent()
	{
		curr = head;
	}
	
	public T getCurrent()
	{
		if (curr != null)
		{
			return curr.data;
		}
		return null;
	}
	
	public void setCurrent(T data)
	{
		if (curr != null)
		{
			curr.data = data;
		}
	}
	
	public boolean hasMore()
	{
		return curr != null;
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
	
	// TESTER
	/*public static void main(String[] args)
	{
		GenLL <String> sLL = new GenLL<String>();
		
		for (int i = 0; i < 10; i++)
		{
			sLL.add("String" + i);
		}
		
		for (String s : sLL)
		{
			System.out.println(s);
		}
	}*/
}
