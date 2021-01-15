/*
 * 01.30.2020
 * In-Class Example
 */

public class Tester {

	public static void main(String[] args) {

		GenLL<Integer> iLL = new GenLL<Integer>(); // type T has to be an object/class
		
		GenLL<String> sLL = new GenLL<String>();
		
		for (int i = 0; i < 10; i++) 
		{
			iLL.add(i);
			sLL.add(i + "Thing");
		}
		
		iLL.print();
		sLL.print();
		
		for (int i : iLL) // works because of the iterator
		{
			System.out.println(i);
		}
	}

}
