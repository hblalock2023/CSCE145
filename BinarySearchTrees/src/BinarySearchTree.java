/*
 * In-Class Example
 * 03.24.2020
 */

public class BinarySearchTree <T extends Comparable <T>> {

	private class Node
	{
		private T data;
		private Node leftChild; // less than
		private Node rightChild; // greater than
		
		public Node(T data)
		{
			this.data = data;
			leftChild = rightChild = null;
		}
	}
	
	private Node root; // acts like head
	
	public BinarySearchTree()
	{
		root = null;
	}
	
	public void add(T data)
	{
		if (root == null)
		{
			root = new Node(data);
		}
		else
		{
			add(root, data);
		} 
	}
	
	private Node add(Node node, T data)
	{
		if (node == null) // found a leaf
		{
			node = new Node(data);
		}
		else if (data.compareTo(node.data) < 0) // less than >> go left
		{
			node.leftChild = add(node.leftChild, data);
		}
		else if (data.compareTo(node.data) > 0) // greater than >> go right
		{
			node.rightChild = add(node.rightChild, data);
		}
		
		return node;
	}
	
	public void printPreOrder()
	{
		printPreOrder(root);
	}
	
	private void printPreOrder(Node node)
	{
		if (node == null)
			return;
		System.out.println(node.data); // process
		printPreOrder(node.leftChild); // go left
		printPreOrder(node.rightChild); // go right
	}
	
	public void printInOrder()
	{
		printInOrder(root);
	}
	
	private void printInOrder(Node node)
	{
		if(node == null)
			return;
		printInOrder(node.leftChild);
		System.out.println(node.data);
		printInOrder(node.rightChild);
	}
	
	public boolean search(T data)
	{
		return recursiveSearch(root, data);
	}
	
	private boolean recursiveSearch(Node node, T data)
	{
		if (node == null) // leaf
			return false;
		
		if (node.data.compareTo(data) == 0)
		{
			return true;
		}
		else if (data.compareTo(node.data) < 0)
		{
			return recursiveSearch(node.leftChild, data);
		}
		else
		{
			return recursiveSearch(node.rightChild, data);
		}
	}
	
	public void remove(T data)
	{
		root = remove(root, data);
	}
	
	private Node remove(Node node, T data)
	{
		if (node == null) // leaf
			return null;
		
		if (node.data.compareTo(data) < 0)
		{
			node.leftChild = remove(node.leftChild, data);
		}
		else if (data.compareTo(node.data) > 0)
		{
			node.rightChild = remove(node.rightChild, data);
		}
		else
		{
			if (node.rightChild == null)
				return node.leftChild;
			if (node.leftChild == null)
				return node.rightChild;
			
			Node temp = findMinInTree(node.rightChild);
			node.data = temp.data;
			node.rightChild = remove(node.rightChild, temp.data);
		}
		
		return node;
	}
	
	private Node findMinInTree(Node node)
	{
		if (node == null)
			return null;
		if(node.leftChild == null)
			return node;
		else
			return findMinInTree(node.leftChild);
	}
	
}
