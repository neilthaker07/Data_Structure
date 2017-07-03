package treesGraphs;

import java.util.Random;

public class RandomSelectionTree {

	TreeNodes root =null;
	public int size()
	{
		return root==null ? 0 : root.size();
	}

	public TreeNodes getRandomNode()
	{
		if(root== null)
		{
			return null;
		}
		Random random = new Random();
		int index = random.nextInt(size());
		return root.getIthNode(index);
	}
}
class TreeNodes
{
	private int data;
	TreeNodes left;
	TreeNodes right;
	private int size=0;
	
	public TreeNodes(int d)
	{
		data=d;
		size=1;
	}
	public int size()
	{
		return size;
	}
	
	public int data()
	{
		return data;
	}
	
	int rootData ;
	NodeLocal root;
	
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
			left = new TreeNodes(d);
		}
		else if(d > iterateData && nodeIterate.getRight() == null)
		{
			right = new TreeNodes(d);
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
	
	public TreeNodes search(int d)
	{
		if(d==data)
		{
			return this;
		}
		else if(d<=data)
		{
			return left != null ? left.search(d) : null;
		}
		else if(d>data)
		{
			return right != null ? right.search(d) : null;
		}
		return null;
	}
	
	public TreeNodes getIthNode(int i)
	{
		int leftSize = left==null ? 0 : left.size();
		if(i<leftSize)
		{
			return left.getIthNode(i);
		}
		else if(i==leftSize)
		{
			return this;
		}
		else
		{
			return right.getIthNode(i-(leftSize+1));
		}
	}
}