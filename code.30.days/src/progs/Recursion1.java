package progs;

public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode23 n1 = new TreeNode23(5);
		TreeNode23 n2 = new TreeNode23(5);
		TreeNode23 n3 = new TreeNode23(5);
		TreeNode23 n4 = new TreeNode23(5);
		TreeNode23 n5 = new TreeNode23(3);
		//TreeNode23 n6 = new TreeNode23(2);

		n1.left=n4;
		n1.right = n2;
		n2.right = n3;
		n4.left = n5;
		
		System.out.println(longestUnivaluePath(n1));
		
	}
	static int ans;
	public static int longestUnivaluePath(TreeNode23 root) {
		ans = 0;
		arrowLength(root);
		return ans;
		
	}
	
	public static int arrowLength(TreeNode23 node) {
		
		if(node == null)
		{
			return 0;
		}
		int l = arrowLength(node.left);
		int r = arrowLength(node.right);
		
		int arrowLeft = 0, arrowRight = 0;
		
        if (node.left != null && node.left.val == node.val) {
            arrowLeft += l + 1;
        }
        
        if (node.right != null && node.right.val == node.val) {
            arrowRight += r + 1;
        }
        
        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
		
	}

}

class TreeNode23 {
     int val;
     TreeNode23 left;
     TreeNode23 right;
     TreeNode23(int x) { val = x; }
}