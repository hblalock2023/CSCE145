/*
 * Lab 04
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 02.12.2020
 */

public class LinkedListQueue <T> {
	
		private class ListNode
		{
			// instance variables
			T data;
			ListNode link;
			
			// default constructor
			public ListNode()
			{
				this.data = null;
				this.link = null;
			}
			
			// parameterized constructor
			public ListNode(T data, ListNode link)
			{
				this.data = data;
				this.link = link;
			}
		}
		
		// instance variables
		private ListNode head; // always first element
		private ListNode tail; // points to last item in queue

		// constructor
		public LinkedListQueue()
		{
			head = tail = null;
		}
		
		// adds item
		public void enqueue(T data)
		{
			ListNode newNode = new ListNode(data, null); // creates new node
			
			// adds item at end
			if(head == null)
			{
				head = newNode;
				tail = head;
				return;
			}
			this.tail.link = newNode;
			this.tail = newNode;			
		}
		
		// removes item from front of queue
		public T dequeue()
		{
			// if it's already null, nothing to remove
			if (head == null)
			{
				return null;
			}
			
			// moves head forward
			T temp = head.data;
			head = head.link;
			return temp;
		}	
		
		// returns head data
		public T peek()
		{
			return head.data;
		}
		
		// prints queue
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
