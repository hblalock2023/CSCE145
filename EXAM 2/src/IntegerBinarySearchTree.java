/*
 * CSCE 146 Exam02 Question02
 * Provided code
 * Make sure this at least compiles
 * You may write additional methods to help
 */
public class IntegerBinarySearchTree 
{
	//Do not alter---------------------
	public class Node//This is public for testing purposes
	{
		public int data;
		public Node leftChild;
		public Node rightChild;
		public Node(int aData)
		{
			this.data = aData;
		}
	}
	private Node root;
	public IntegerBinarySearchTree()
	{
		root = null;
	}
	public Node getRoot()
	{
		return root;
	}
	//--------------------------------
	public void add(int aData)
	{
		if (root == null)
		{
			root = new Node(aData);
		}
		else
		{
			add(root, aData);
		} 
	}
	
	private Node add(Node node, int aData)
	{
		if (node == null) 
		{
			node = new Node(aData);
		}
		else if (aData < node.data) 
		{
			node.leftChild = add(node.leftChild, aData);
		}
		else if (aData > node.data) 
		{
			node.rightChild = add(node.rightChild, aData);
		}
		
		return node;
	}

}
