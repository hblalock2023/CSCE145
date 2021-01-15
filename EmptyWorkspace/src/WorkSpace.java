/*
 * Area to Test Code
 */
import java.util.*;

public class WorkSpace {

	public static void main(String[] args) {
	
		double[] doubleArray = {0,1,2,3,4,5,6,7,8,9,10};
		
		System.out.println(search(doubleArray, 11, 0, 9));
		
		
	}
	
	public static boolean search(double[] a, double target, int start, int end)
	{
		//Write your code here
		if (start > end)
			return false;
		
		int mid = (start + end) / 2;
		if (a[mid] == target)
			return true;
		else
		{
			if (a[mid] < target)
				return search(a, target, mid+1, end);
			else
				return search(a, target, start, mid-1);
		}		
		
	}
}
