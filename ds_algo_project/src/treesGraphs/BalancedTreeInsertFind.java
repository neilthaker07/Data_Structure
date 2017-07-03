package treesGraphs;

public class BalancedTreeInsertFind {

	public static void main(String[] args) {
		
		BalancedTreeInsertFind tree = new BalancedTreeInsertFind();
		
		tree.insertInOrder(5);
		tree.insertInOrder(3);
		tree.insertInOrder(8);
		tree.insertInOrder(1);
		tree.insertInOrder(4);
		tree.insertInOrder(6);
		tree.insertInOrder(9);
		
		tree.printPreOrder(tree.root);
		
		tree.search(3, tree.rootData, tree.root);
		
		System.out.println(tree.root.size);
	}
	
	int rootData ;
	NodeLocal root;
	int size;
	NodeLocal leftTree;
	NodeLocal rightTree;
	
	public void insertInOrder(int d) // O(logN) - insertion
	{
		if(rootData == 0)
		{
			root = new NodeLocal(d);
			rootData = d;
		}
		else
		{
			iterate(d, rootData,root);
		}
	}

	private void iterate(int d, int iterateData, NodeLocal nodeIterate) 
	{
		if(d < iterateData && nodeIterate.getLeft() == null)
		{
			leftTree = new NodeLocal(d);
			nodeIterate.setLeft(leftTree);
		}
		else if(d > iterateData && nodeIterate.getRight() == null)
		{
			rightTree = new NodeLocal(d);
			nodeIterate.setRight(rightTree);
		}
		else if(d < iterateData && nodeIterate.getLeft() != null)
		{
			iterate(d, root.getLeft().data, root.getLeft());
		}
		else if(d > iterateData && nodeIterate.getRight() != null)
		{
			iterate(d, root.getRight().data, root.getRight());
		}
		size++;
	}
	
	public void search(int d, int iterateData, NodeLocal nodeIterate) // O(logN)
	{
		if(d==0 || iterateData==0 || nodeIterate == null)
		{
			System.out.println("Tree doesn't exist OR Node is not in.");
		}
		else
		{
			if(d==iterateData)
			{
				System.out.println("Found : "+d);
			}
			else if(d < iterateData)
			{
				if(nodeIterate.left !=null)
				{
					search(d, nodeIterate.left.data, nodeIterate.left);
				}
				else
				{
					System.out.println("NOT FOUND");
				}
			}
			else if(d>iterateData)
			{
				if(nodeIterate.right !=null)
				{
					search(d, nodeIterate.right.data, nodeIterate.right);
				}
				else
				{
					System.out.println("NOT FOUND");
				}
			}
		}
	}

	public void printPreOrder(NodeLocal n)
	{
		if(n == null)
		{
			System.out.println("No Tree exists");
		}
		else 
		{
			if (n != null) {
				System.out.println(n.data);
			}
			if (n.getLeft() != null) {
				printPreOrder(n.getLeft());
			}
			if (n.getRight() != null) {
				printPreOrder(n.getRight());
			}
		}
	}
	
}
