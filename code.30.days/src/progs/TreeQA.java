package progs;

public class TreeQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode1 tn1 = new TreeNode1(5);
		TreeNode1 tn2 = new TreeNode1(3);
		TreeNode1 tn3 = new TreeNode1(1);
		TreeNode1 tn4 = new TreeNode1(4);
		TreeNode1 tn5 = new TreeNode1(6);
		
		tn1.left = tn2;
		tn1.right = tn5;
		tn2.left = tn3;
		tn2.right = tn4;
		
		
		inOrder(tn1);
		preOrder(tn1);
		postOrder(tn1);
	}
	
	int min = Integer.MAX_VALUE;
    Integer prev = null;
	
	public int getMinimumDifference(TreeNode1 root) {
        if (root == null) return min;
        
        getMinimumDifference(root.left);
        
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        
        getMinimumDifference(root.right);
        
        return min;
    }
	
	public static void inOrder(TreeNode1 root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.println(root.val);
			inOrder(root.right);
		}
	}
	
	public static void preOrder(TreeNode1 root)
	{
		if(root!=null)
		{
			System.out.println(root.val);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void postOrder(TreeNode1 root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.val);
		}
	}
}


class TreeNode1 {
    int val;
    TreeNode1 left;
    TreeNode1 right;
    TreeNode1(int x) { val = x; }
}