/*
 * Lab 08
 * CSCE 146
 * Section 007
 * Written by Hadley Blalock
 * 04.09.2020
 */

public class ProcessHeap {

	// instance variables
	private Process[] heap;
	public static final int DEF_SIZE = 127;
	private int size; // last index
	
	// default constructor
	public ProcessHeap()
	{
		init(DEF_SIZE);
	}
	
	// parameterized constructor
	public ProcessHeap(int size)
	{
		init(size);
	}
	
	private void init(int size)
	{
		if (size > 0)
		{
			heap = new Process[size];
			this.size = 0;
		}
		else
		{
			init(DEF_SIZE);
		}
	}
	
	// inserts new element to heap
	public void add(Process aP)
	{
		if (size >= heap.length)
			return;
		heap[size] = aP;
		this.bubbleUp();
		size++;
	}
	
	private void bubbleUp()
	{
		int index = this.size;
		while (index > 0 &&
			heap[(index-1)/2].compareTo(heap[index]) < 0)
		{
			Process temp = heap[(index-1)/2];
			heap[(index-1)/2] = heap[index];
			heap[index] = temp;
			index = (index - 1) / 2;
		}
	}
	
	// returns head
	public Process peek()
	{
		return heap[0];
	}
	
	// removes the last index of the heap and returns it
	public Process remove()
	{
		if (peek() == null)
			return null;
		Process ret = peek();
		heap[0] = heap[size-1];
		heap[size-1] = null;
		size--;
		this.bubbleDown();
		return ret;
	}
	
	private void bubbleDown()
	{
		int index = 0;
		while ((index * 2 + 1) < size)
		{
			int bigIndex = (index * 2 + 1);
			if ((index * 2 + 2) < size && 
					heap[(index*2+2)].compareTo(heap[(index*2+1)]) > 0)
			{
				bigIndex = (index * 2 + 2);
			}
			
			if (heap[index].compareTo(heap[bigIndex]) < 0)
			{
				Process temp = heap[index];
				heap[index] = heap[bigIndex];
				heap[bigIndex] = temp;
			}
			else
			{
				break;
			}
			
			index = bigIndex;
		}
	}
	
	// prints heap
	public void printHeap()
	{
		for (Process p : heap)
		{
			if (p == null)
				break;
			System.out.println(p);
		}
	}
	
	// checks if heap is empty
	public boolean isEmpty()
	{
		return heap[0] == null;
	}
}
