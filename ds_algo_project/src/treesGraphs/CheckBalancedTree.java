package treesGraphs;

public class CheckBalancedTree {

	NodeLocal root;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBalancedTree tree = new CheckBalancedTree();
		tree.root = new NodeLocal(1);
		tree.root.left = new NodeLocal(2);
		tree.root.right = new NodeLocal(3);
		tree.root.right.left = new NodeLocal(11);
		tree.root.right.right = new NodeLocal(12);
		tree.root.left.left = new NodeLocal(4);
		tree.root.left.right = new NodeLocal(5);
		tree.root.left.left.left = new NodeLocal(8);
        tree.root.left.left.right = new NodeLocal(9);
        tree.root.left.right.left = new NodeLocal(6);
        tree.root.left.right.right = new NodeLocal(7);
        tree.root.left.right.right.left = new NodeLocal(17);

        System.out.println(tree.isBalanced(tree.root));
	}
	boolean balancedTree = true;
	int localCount = 1;
	
	public boolean isBalanced(NodeLocal node)
	{
		return checkHeight(node) != Integer.MIN_VALUE;
		/*NodeLocal n = getLeaf(node, node);
		
		if(n.right!=null && !isLeafNode(n.right))
		{
			NodeLocal l1 = n.right.left;
			NodeLocal l2 = n.right.right;
 			
			if(l1!=null || l2!=null)
			{
				localCount++;
			}
			
			boolean r1 = isLeafNode(l1);
			boolean r2 = isLeafNode(l2);
			if(!r1 || !r2)
			{
				balancedTree  = false;
			}
		}
		*/
	}
	
	
	int checkHeight(NodeLocal root)
	{
		if(root==null)
		{
			return -1;
		}
		
		int leftHeight = checkHeight(root.left);
		if(leftHeight==Integer.MIN_VALUE)
		{
			return Integer.MIN_VALUE;
		}
		int rightHeight = checkHeight(root.right);
		if(rightHeight==Integer.MIN_VALUE)
		{
			return Integer.MIN_VALUE;
		}
		
		int heightDiff = leftHeight - rightHeight;
		if(Math.abs(heightDiff)>1)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			return Math.max(leftHeight, rightHeight)+1;
		}
	}
	
	public NodeLocal getLeaf(NodeLocal node, NodeLocal parent)
	{
		if(node.left!=null)
		{
			getLeaf(node.left, node);
		}
		return parent;
	}
	
	public boolean isLeafNode(NodeLocal node)
	{
		if(node.left == null && node.right == null)
		{
			return true;
		}
		return false;
	}

}
