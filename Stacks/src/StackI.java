/*
 * 02.13.2020
 * In-Class Example 
 */

public interface StackI<T> {

	public void push(T data); // add
	public T pop(); // remove
	public T peek(); // observe first element
	public void print();
}
