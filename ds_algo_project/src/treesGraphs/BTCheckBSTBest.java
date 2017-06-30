package treesGraphs;

public class BTCheckBSTBest {

	NodeLocal root;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BTCheckBSTBest tree = new BTCheckBSTBest();
		tree.root = new NodeLocal(5);
		tree.root.left = new NodeLocal(3);
		tree.root.right = new NodeLocal(9);
		tree.root.left.left = new NodeLocal(2);
		tree.root.left.left.left = new NodeLocal(1);
		tree.root.left.right = new NodeLocal(41);

		System.out.println(tree.isBSTCheck(tree.root,null,null));
	}

	// O(N) time
	// O(logN) space complexity on a balanced tree
	
	public boolean isBSTCheck(NodeLocal node, Integer min, Integer max)
	{
		if(node == null)
		{
			return true;
		}
		if((max!=null && node.data > max) || (min!=null && node.data <= min))
		{
			//System.out.println("NO BST");
			return false;
		}
		if(!isBSTCheck(node.left, min, node.data) || !isBSTCheck(node.right, node.data, max))
		{
			return false;
		}
		return true;
	}
}
