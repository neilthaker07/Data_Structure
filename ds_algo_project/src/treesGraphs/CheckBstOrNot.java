package treesGraphs;

public class CheckBstOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NodeLocal n1 = new NodeLocal(2);
		NodeLocal n2 = new NodeLocal(2);
		n1.setLeft(n2);
		
		/*NodeLocal n3 = new NodeLocal(1);
		NodeLocal n4 = new NodeLocal(9);
		NodeLocal n5 = new NodeLocal(6);
		NodeLocal n6 = new NodeLocal(3);
		NodeLocal n7 = new NodeLocal(8);
		
		n1.setLeft(n2);
		n1.setRight(n3);
		
		n2.setLeft(n4);
		n2.setRight(n5);
		
		n3.setLeft(n6);
		n3.setRight(n7);
*/
		root = n1;
		
		System.out.println(check(root, 0, 5000));
	}
	
	static NodeLocal root = null;

	static boolean check(NodeLocal node, int min, int max)
	{
		if(node == null)
		{
			return true;
		}
		else if(node.data < min || node.data > max)
		{
			return false;
		}
		return check(node.left, min, node.data-1) && check(node.right, node.data+1, max);
	}
}

