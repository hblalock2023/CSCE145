/*
 * 03.03.2020
 * In-Class Example
 */

public class SortingAlgos {

	public static void main(String[] args) {

		int[] b = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		bubbleSort(b);
	}
	
	public static void selectionSort(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			int smallestIndex = i;
			for (int j = i+1; j < a.length; j++)
			{
				if (a[smallestIndex] > a[j])
				{
					smallestIndex = j;
				}
			}
			
			if (smallestIndex != i)
			{
				int temp = a[i];
				a[i] = a[smallestIndex];
				a[smallestIndex] = temp;
			}
		}
	}
	
	public static void bubbleSort(int[] a)
	{
		boolean hasSwapped = true;
		while(hasSwapped)
		{
			hasSwapped = false;
			for (int i = 0; i < a.length-1; i++)
			{
				if (a[i] > a[i+1])
				{
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					hasSwapped = true;
				}
			}
		}
	}
	
	public static void mergeSort(int[] a)
	{
		int size = a.length;
		if (size > 2)
			return;
		int mid = size / 2;
		
		int leftSize = mid;
		int rightSize = size - mid;
		
		int[] left = new int[leftSize];
		int[] right = new int[rightSize];
		
		for (int i = 0; i < mid; i++)
		{
			left[i] = a[i];
		}
		for (int i = mid; i < size; i++)
		{
			right[i-mid] = a[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, a);
	}
	
	public static void merge(int[] left, int[] right, int[] a)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i = 0; // left index
		int j = 0; // right index
		int k = 0; // a index
		
		while (i < leftSize && j < rightSize)
		{
			if (left[i] < right[j])
			{
				a[k] = left[i]; // one line: a[k++] = left[i++];
				i++;
				k++;
			}
			else
			{
				a[k] = right[j]; // one line: a[k++] = right[j++];
				j++;
				k++;
			}
		}
		
		while (i < leftSize) // if nothing remaining in right
		{
			a[k] = left[i];
			i++;
			k++;
		}
		
		while (j < rightSize) // if nothing remaining in left
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}

	public static void quickSort(int[] a, int leftIndex, int rightIndex)
	{
		int index = partition(a, leftIndex, rightIndex);
		
		if (leftIndex < index-1)
		{
			quickSort(a, leftIndex, index-1);
		}
		if (rightIndex > index)
		{
			quickSort(a, index, rightIndex);
		}
	}
	
	public static int partition(int[] a, int leftIndex, int rightIndex)
	{
		int i = leftIndex;
		int j = rightIndex;
		int pivot = a[(leftIndex + rightIndex) / 2]; // middle pivot value
		
		while (i <= j)
		{
			while (a[i] < pivot)
				i++;
			while(a[j] > pivot)
				j--;
			
			if (i <= j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		
		return i;
	}
}
