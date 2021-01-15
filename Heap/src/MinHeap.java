/*
 * In-Class Example
 * 04.04.2020
 */

public class MinHeap <T extends Comparable<T> >{

	public static final int DEF_SIZE = 127;
	private T[] heap;
	private int lastIndex;
	
	public MinHeap()
	{
		init(DEF_SIZE);
	}
	
	public MinHeap(int size)
	{
		init(size);
	}
	
	private void init(int size)
	{
		if (size > 0)
		{
			heap = (T[])(new Comparable[size]);
			lastIndex = 0;
		}
		else
		{
			init(DEF_SIZE);
		}
	}
	
	public void add(T value) // O(n*lg(n))
	{
		if (lastIndex >= heap.length)
			return;
		heap[lastIndex] = value;
		bubbleUp();
		lastIndex++;
	}
	
	private void bubbleUp()
	{
		int index = this.lastIndex;
		while (index > 0 &&
				heap[(index-1)/2].compareTo(heap[index]) > 0)
		{
			T temp = heap[(index-1)/2];
			heap[(index-1)/2] = heap[index];
			heap[index] = temp;
			index = (index-1)/2;
		}
	}
	
	public T remove() // O(n*lg(n))
	{
		if (lastIndex == 0)
			return null;
		T ret = heap[0];
		heap[0] = heap[lastIndex-1];
		heap[lastIndex-1] = null;
		lastIndex--;
		bubbleDown();
		return ret;
	}
	
	private void bubbleDown()
	{
		int index = 0;
		while (index*2+2 < lastIndex)
		{
			int smallIndex = index*2+1;
			if (index*2+2 < lastIndex &&
					heap[index*2+1].compareTo(heap[index*2+2]) > 0)
			{
				smallIndex = index*2+2;
			}
			
			if (heap[index].compareTo(heap[smallIndex]) > 0)
			{
				T temp = heap[index];
				heap[index] = heap[smallIndex];
				heap[smallIndex] = temp;
			}
			
			index = smallIndex;
		}
	}
	
	public void printHeap()
	{
		for (T h : heap) 
		{
			if (h == null)
				break;
			System.out.println();
		}
	}
	
	public void heapSort() // 
	{
		for (int i = 0; i < lastIndex; i++)
		{
			System.out.println(this.remove());
		}
	}
}
