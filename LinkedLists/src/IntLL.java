/*
 * 01.28.2020
 * In-Class Example
 */

public class IntLL {
	
	// Internal Class
	private class ListNode
	{
		private int data;
		private ListNode link;
		
		public ListNode(int data, ListNode link)
		{
			this.data = data;
			this.link = link;
		}
		
	}
	
	// ListNodes should never be an input or a return type
	private ListNode head; // first element in the list
	private ListNode curr; // current element of interest, gives access outside the structure
	private ListNode prev; // one node behind curr

	public IntLL()
	{
		head = curr = prev = null;
	}
	
	// adds to the end only
	public void add(int data)
	{
		// Create new node
		ListNode newNode = new ListNode(data, null);
		
		// Check your head
		if(head == null)
		{
			head = curr = newNode;
			return;
		}
		
		ListNode temp = head;
		
		while(temp.link != null)
		{
			temp = temp.link;
		}
		
		temp.link = newNode;
	}
	
	public int getCurr()
	{
		if (curr != null)
		{
			return curr.data;
		}
		
		return -1; // rewrite for objects in general
	}
	
	public void goToNext()
	{
		if (curr != null)
		{
			prev = curr;
			curr = curr.link;
		}
	}
	
	public void setCurr(int data)
	{
		if (curr != null)
		{
			curr.data = data;
		}
	}
	
	public void reset()
	{
		curr = head;
		prev = null;
	}
	
	public void removeCurrent()
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
		for (ListNode temp = head; temp != null; temp = temp.link)
		{
			System.out.println(temp.data);
		}
	}
}
