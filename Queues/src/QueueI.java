/*
 * 02.1.2020
 * In-Class Example 
 */

public interface QueueI<T> {
	
	public void enqueue(T data);
	public T dequeue();
	public T peek();
	public void print();
}
