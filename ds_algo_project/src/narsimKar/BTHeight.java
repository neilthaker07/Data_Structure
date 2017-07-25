package narsimKar;

public class BTHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BTHeight p = new BTHeight();
		p.createBT();
		System.out.println(p.heightOfBT(p.root)-1);		
	}
	public void createBT()
	{
		Node78 node1 = new Node78();
		Node78 node2 = new Node78();
		Node78 node3 = new Node78();
		Node78 node4 = new Node78();
		Node78 node5 = new Node78();
		Node78 node6 = new Node78();
		Node78 node7 = new Node78();
		Node78 node8 = new Node78();
		
		node1.data = 1;
		node2.data = 2;
		node3.data = 3;
		node4.data = 4;
		node5.data = 5;
		node6.data = 6;
		node7.data = 7;
		node8.data = 8;
		
		node1.left = node2;
		node1.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		node3.left = node6;
		node3.right = node7;
		
		node4.left = node8;
		
		root = node1;
	}
	
	Node78 root;
	
	public int heightOfBT(Node78 root)
	{
		if(root == null)
		{
			return 0;
		}
		
		int lHeight = heightOfBT(root.left);
		int rHeight = heightOfBT(root.right);
		
		if(lHeight > rHeight)
		{
			return lHeight+1;
		}
		else
		{
			return rHeight+1;
		}
	}
}


class Node78 {
    int data;
    Node78 left;
    Node78 right;
 }