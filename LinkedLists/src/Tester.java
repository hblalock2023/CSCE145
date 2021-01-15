/*
 * 01.28.2020
 * In-Class Example
 */

public class Tester {

	public static void main(String[] args) {

		int[] a = new int[10];
		IntLL iList = new IntLL();
		
		for (int i = 0; i < a.length; i++)
		{
			a[i] = i;
		}
		
		// same thing
		for (int i = 0; i < a.length; i++)
		{
			iList.add(i);
		}
		
		System.out.println(a[4]);
		
		iList.goToNext();
		iList.goToNext();
		iList.goToNext();
		iList.goToNext();
		iList.goToNext();
		System.out.println(iList.getCurr());
		
		a[4] = 2;
		iList.setCurr(2); 
		
		for (int i : a)
		{
			System.out.println(i);
		}
		
		for (int i : a)
		{
			System.out.println(i);
		}
		
		
	}

}
