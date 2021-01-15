/*
 * Lab 03
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 02.04.2020
 */

public class GenDoubleLinkedList<T> {

	private class ListNode
	{
		// instance variables
		T data;
		ListNode nextLink;
		ListNode prevLink;
		
		// default constructor
		public ListNode()
		{
			this.data = null;
			this.nextLink = null;
			this.prevLink = null;
		}
		
		// parameterized constructor
		public ListNode(T data, ListNode nextLink, ListNode prevLink)
		{
			this.data = data;
			this.nextLink = nextLink;
			this.prevLink = prevLink;
		}
	}
	
	// instance variables
	private ListNode head; // always first element
	private ListNode curr; // current node of interest used outside

	// sets up empty list
	public GenDoubleLinkedList()
	{
		head = curr = null;
	}

	// points current to next link
	public void goToNext()
	{
		if (curr != null)
		{
			curr = curr.nextLink;
		}
	}
	
	// points current back to previous link
	public void goToPrev()
	{
		if (curr != null && curr.prevLink != null)
		{
			curr = curr.prevLink;
		}
	}
	
	// checks to see if there is another item in the list
	public boolean moreToIterate()
	{
		return curr != null && curr.nextLink != null;
	}

	// points current back to head
	public void resetCurrent()
	{
		curr = head;
	}
	
	// current accessor
	public T getCurrent()
	{
		if (curr != null)
		{
			return curr.data;
		}
		return null;
	}
	
	// current mutator
	public void setCurrent(T data)
	{
		if (curr != null)
		{
			curr.data = data;
		}
	}
	
	// inserts at end of list
	public void insert(T data)
	{
		// creates new node
		ListNode newNode = new ListNode(data, null, null);
		
		// if list is empty, new node becomes head
		if (head == null)
		{
			head = curr = newNode;	
			return;
		}
		
		// otherwise it is added to the end
		ListNode temp = head;
		while (temp.nextLink != null)
		{
			temp = temp.nextLink;
		}
		temp.nextLink = newNode;
		newNode.prevLink = temp;
	}
	
	// inserts after current
	public void insertAfterCurrent(T data)
	{
		// creates new node
		ListNode newNode = new ListNode(data, null, null);
		// steps current back one and makes new node current
		if (curr != null)
		{
			newNode.nextLink = curr.nextLink;
			curr.nextLink = newNode;
			newNode.prevLink = curr;
			newNode.nextLink.prevLink = newNode;
		}
	}
	
	// deletes current
	public void deleteCurrent()
	{
		if (curr != null && curr.prevLink != null) // if current is somewhere in the list not at the head
		{
			curr.prevLink.nextLink = curr.nextLink;
			curr = curr.nextLink;
		}
		else if (curr == head) // if current is the head
		{
			head = head.nextLink; 
			curr = head;
		}
	}
	
	// prints the list
	public void print()
	{
		ListNode temp = head;
		while (temp != null)
		{
			System.out.println(temp.data);
			temp = temp.nextLink;
		}
	}
	
	/*// used to show links while testing
	public void printLink()
	{
		ListNode temp = head;
		while (temp != null)
		{
			System.out.println("Prev" + temp.prevLink);
			System.out.println("Curr" + temp.data);
			System.out.println("Next" + temp.nextLink + '\n');
			temp = temp.nextLink;
		}
	}*/
	
	// checks if the data given is in the the list
	public boolean contains(T data)
	{
		ListNode temp = head;
		while(temp != null)
		{
			if (temp.data.equals(data))
			{
				return true;
			}
			temp = temp.nextLink;
		}
		return false;
	}
}
