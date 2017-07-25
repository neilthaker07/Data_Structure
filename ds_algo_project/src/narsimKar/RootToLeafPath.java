package narsimKar;

public class RootToLeafPath {

	public static void main(String[] args) {

		RootToLeafPath p = new RootToLeafPath();
		p.createBT();
		Node78[] path = new Node78[]{p.root};
		//p.path(p.root,path,0);
		//p.mirror(p.root);
		//System.out.println(p.root.left.left.data);
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
		root = node1;
	}

	Node78 root;
	public void path(Node78 root, Node78[] path, int l)
	{
		if(root ==null)
		{
			return;
		}
		path[l]= root;
		l++;
		if(root.left==null && root.right==null)
		{
			printPath(path);
		}
		else
		{
			path(root.left, path, l);
			path(root.right, path, l);
		}
		
	}
	public void printPath(Node78 path[])
	{
		for(int i=0;i<path.length;i++)
		{
			System.out.println(path[i]);
		}
	}
	
	public Node78 mirror(Node78 root)
	{
		if(root.left !=null)
		{
			mirror(root.left);
		}
		if(root.right!=null)
		{
			mirror(root.right);
		}
		if(root.left !=null || root.right!=null)
		{
			Node78 t = root.left;
			root.left= root.right;
			root.right =t;
		}
		return root;
	}
}
