/*
 * CSCE 146 Exam02 Question03
 * Provided code
 * Make sure this at least compiles
 * You may write additional methods to help
 */
public class DoubleBinarySearchTree 
{
	//Do not alter---------------------
	public class Node//This is public for testing purposes
	{
		public double data;
		public Node leftChild;
		public Node rightChild;
		public Node(double aData)
		{
			this.data = aData;
		}
	}
	public Node root;//This is public for testing purposes
	public DoubleBinarySearchTree()
	{
		root = null;
	}
	//---------------------------------
	public boolean search(double aData)
	{
		//Write your code here
		return recursiveSearch(root, aData);
	}
	
	private boolean recursiveSearch(Node node, double aData)
	{
		if (node == null) 
			return false;
		
		if (node.data == aData)
		{
			return true;
		}
		else if (aData < node.data)
		{
			return recursiveSearch(node.leftChild, aData);
		}
		else
		{
			return recursiveSearch(node.rightChild, aData);
		}
	}

}
