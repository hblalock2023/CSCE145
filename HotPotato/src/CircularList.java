/*
 * Homework 02
 * Written by Hadley Blalock
 * 02.06.2020
 * CSCE 146 
 * Section 007
 */

public class CircularList <T> {
		
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
		
		
		private ListNode head; // always first element
		private ListNode curr; // current node of interest used outside
		private ListNode prev; // one node behind curr
		private ListNode tail; // always the last element
		
		// default constructor
		public CircularList()
		{
			curr = prev = tail = head = null;
		}

		// resets entire list to empty
		public void reset()
		{
			curr = prev = tail = head = null;
		}
		
		// adds new node behind tail
		public void add(T data)
		{
			ListNode newNode = new ListNode(data, head); // circular version
			
			if (head == null) 
			{
		        head = newNode;
		    } 
			else 
			{
		        tail.link = newNode;
		    }
		 
		    tail = newNode;
		    tail.link = head;
		}
		
		// removes current node 
		public void removeCurrent()
		{
			if (curr == null)
				return;
			if (curr == head)
			{
				tail.link = head.link;
				head = curr = head.link;
			}
			else if (curr != head && curr != tail)
			{
				prev.link = curr.link;
				curr = curr.link;
			}
			else if (curr == tail)
			{
				curr.link = head.link;
				prev.link = head;
				curr = head;
			}
		}
		
		// goes to next node
		public void goToNext()
		{
			if (curr != null)
			{
				prev = curr;
				curr = curr.link;
			}
			else if (curr == tail)
			{
				tail.link = head;
				curr = head;
			}
		}
		
		// points current back to head
		public void resetCurrent()
		{
			curr = head;
		}
		
		// gets the data at current
		public T getCurrent()
		{
			if (curr != null)
			{
				return curr.data;
			}
			return null;
		}
		
		// mutator
		public void setCurrent(T data)
		{
			if (curr != null)
			{
				curr.data = data;
			}
		}
		
		// prints list
		public void print()
		{
			ListNode temp = head;
			while (temp != tail)
			{
				System.out.println(temp.data);
				temp = temp.link;
			}
		}
	
}

	


