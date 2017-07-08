package sortingSearching;

public class RankOfNumberBST {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RankOfNumberBST a = new RankOfNumberBST();
		a.add(5);
		a.add(2);
		a.add(9);
		a.add(1);
		a.add(3);
		a.add(3);
		a.add(7);
		
		a.inOrder(a.root);
		
		//a.rankOfNo(1);
	}
	
	BSTNodesT root=null ;

	public void add(int n)
	{
		if(root==null)
		{
			root = new BSTNodesT();
			root.no = n;
		}
		else
		{
			BSTNodesT currentNode = new BSTNodesT();
			currentNode.no = n;
			bstAddNode(currentNode, root);
		}
	}

	public void bstAddNode(BSTNodesT currentNode, BSTNodesT baseNode) 
	{
		if(currentNode.no==baseNode.no)
		{
			baseNode.counts++;
		}
		else if(currentNode.no < baseNode.no && baseNode.left == null)
		{
			baseNode.left = currentNode;
		}
		else if(currentNode.no > baseNode.no && baseNode.right == null)
		{
			baseNode.right = currentNode;
		}
		else if(currentNode.no < baseNode.no)
		{
			bstAddNode(currentNode, baseNode.left);
		}
		else if(currentNode.no > baseNode.no)
		{
			bstAddNode(currentNode, baseNode.right);
		}
	}
	
	private void inOrder(BSTNodesT node) 
	{
		if(node != null)
		{
			if(node.left!=null)
			{
				inOrder(node.left);
			}
			System.out.println(node.no);
			if(node.right!=null)
			{
				inOrder(node.right);
			}
		}
	}
	
	private void customInOrder(BSTNodesT node) 
	{
		if(node != null)
		{
			if(node.left!=null)
			{
				inOrder(node.left);
			}
			System.out.println(node.no);
			if(node.right!=null)
			{
				inOrder(node.right);
			}
		}
	}
	
	public int rankOfNo(int n)
	{
		customInOrder(root);
		
		
		return 0;
	}
	
	class BSTNodesT
	{
		int no = 0;
		BSTNodesT left = null;
		BSTNodesT right = null;
		int counts = 1;
	}
}
