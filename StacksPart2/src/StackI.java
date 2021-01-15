/* In-Class Example
 * 02.18.2020
 */

public interface StackI<T> extends Iterable<T> {

	public void push(T data); // add
	public T pop(); // remove
	public T peek(); // observe first element
	public void print();
	public int size();
}
