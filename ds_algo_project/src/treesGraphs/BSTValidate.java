package treesGraphs;

public class BSTValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeTest t1 = new TreeTest(6);
		TreeTest t2 = new TreeTest(3);
		TreeTest t3 = new TreeTest(1);
		TreeTest t4 = new TreeTest(5);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
	}
	
	public static boolean validation(TreeTest root)
	{
		return v(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}
	
	public static boolean v(TreeTest root, long minVal, long maxVal)
	{
		if(root == null)
		{
			return true;
		}
		if(root.val >= maxVal || root.val <= minVal)
		{
			return false;
		}
		return v(root.left, minVal, root.val) && v(root.right, root.val, maxVal);
	}

}

class TreeTest
{
	int val ;
	TreeTest(int val)
	{
		val = this.val;
	}
	TreeTest left;
	TreeTest right;
}