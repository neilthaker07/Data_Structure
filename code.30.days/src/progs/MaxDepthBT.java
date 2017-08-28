package progs;

import java.util.ArrayList;

public class MaxDepthBT {

	public static void main(String[] args) {
		TreeNode t1= new TreeNode(5);
		TreeNode t2= new TreeNode(1);
		TreeNode t3= new TreeNode(2);
		t1.left=t2;
		t1.right=t3;
		MaxDepthBT ma = new MaxDepthBT();
		System.out.println(ma.maxDepth(t1));
	}

	 public int maxDepth(TreeNode root) {
	        
			if(root==null)
			{
				return 0;
			}
			ArrayList<TreeNode> a = new ArrayList<TreeNode>();
			a.add(root);
			m(a);
			return d;
		
	    }
	    int d =1;
		public void m(ArrayList<TreeNode> node)
		{
			ArrayList<TreeNode> nodesChildren = new ArrayList<TreeNode>(); 
			int p=0;
			for(int i=0;i<node.size();i++)
			{
				if(node.get(i).left!=null)
				{
					nodesChildren.add(node.get(i).left);
					p++;
				}
				if(node.get(i).right!=null)
				{
					nodesChildren.add(node.get(i).right);
					p++;
				}
			}
			if(nodesChildren.size()>0)
			{
				d++;
				m(nodesChildren);
			}
		}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}