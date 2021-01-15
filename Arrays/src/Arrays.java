/*
 * In-Class Example
 * 09/23/2019
 */

public class Arrays {

	public static void main(String[] args) {
		int[] intArray; // declare the array
		intArray = new int[5]; // initialize array to size 5
		// arrays are not re-sizable - fixed in memory
		// arrays are contiguous in memory
		/*int i0;
		int i1;
		int i2;
		int i3;
		int i4;*/
		// NO ARRAYLISTS
		
		// arrays always start at index 0
		// last index is the (array.length - 1)
		for (int i = 0; i < intArray.length; i++)
		{
			intArray[i] = i;
		}
		
		for (int i = 0; i < intArray.length; i++)
		{
			System.out.println(intArray[i]);
		}
	}

}
