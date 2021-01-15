/*
 * 03.03.2020
 * In-Class Example
 */
		
public class SearchAlgos {

	public static void main(String[] args) {
		
		int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	}
	
	public static boolean seqIter(int[] a, int value)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == value)
				return true;
		}
		
		return false;
	}
	
	public static boolean seqRec(int[] a, int value, int index)
	{
		if (a[index] == value) // halting
			return true;
		else
		{
			index++;
			if (index >= a.length) // halting
				return false;
			else 
				return seqRec(a, value, index);
		}
	}
	
	public static boolean binRec(int[] a, int value, int min, int max) // binary search
	{
		if (min > max)
			return false;
		
		int mid = (max + min) / 2;
		if (a[mid] == value)
			return true;
		else
		{
			if (a[mid] < value)
				return binRec(a, value, mid+1, max);
			else
				return binRec(a, value, mid-1, max);
		}
	}
}
