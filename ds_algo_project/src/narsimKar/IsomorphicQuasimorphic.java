package narsimKar;

public class IsomorphicQuasimorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IsomorphicQuasimorphic p = new IsomorphicQuasimorphic();
		p.createBT();
		System.out.println(p.isomorphic(p.root1,p.root2));
		System.out.println(p.quasimorphic(p.root1,p.root2));
	}

	public void createBT() {
		Node78 node1 = new Node78();
		Node78 node2 = new Node78();
		Node78 node3 = new Node78();
		Node78 node4 = new Node78();
		Node78 node5 = new Node78();
		Node78 node6 = new Node78();
		Node78 node7 = new Node78();
		// Node78 node8 = new Node78();

		node1.data = 1;
		node2.data = 2;
		node3.data = 3;
		node4.data = 4;
		node5.data = 5;
		node6.data = 6;
		node7.data = 7;
		// node8.data = 8;

		node1.left = node2;
		node1.right = node3;

		node2.left = node4;
		node2.right = node5;

		node3.left = node6;
		node3.right = node7;

		// node4.left = node8;

		root1 = node1;
		root2 = node1;
	}

	Node78 root1;
	Node78 root2;
	
	public boolean isomorphic(Node78 node1,Node78 node2)
	{
		if(node1==null && node2==null)
		{
			return true;
		}
		if(node1==null || node2==null)
		{
			return false;
		}
		if(node1.data == node2.data)
		{
			return true;
		}
		return isomorphic(node1.left, node2.left) && isomorphic(node1.right, node2.right);
	}
	
	public boolean quasimorphic(Node78 node1,Node78 node2)
	{
		if(node1==null && node2==null)
		{
			return true;
		}
		if(node1==null || node2==null)
		{
			return false;
		}
		return quasimorphic(node1.left, node2.right) && quasimorphic(node1.right, node2.left);
	}
}
