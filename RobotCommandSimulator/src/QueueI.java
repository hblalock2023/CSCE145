/*
 * Homework 03
 * 02.19.2020
 * Hadley Blalock
 */

public interface QueueI<T> {
	
	public void enqueue(T data);
	public T dequeue();
	public T peek();
	public void print();
}
