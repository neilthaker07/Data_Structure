package treesGraphs;

public class MyTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTree mt = new MyTree();
		mt.treeCreation();
		
		//System.out.println(mt);
		//mt.preOrder(mt.root);
		
		/*mt.searchNode(mt.n6);
		*/
		
		System.out.println("*-----------------------*");
		mt.root = mt.n1;
		mt.preOrder(mt.root);
		
		//mt.deleteNode(mt.n5);
		//mt.preOrder(mt.root);
	}

	public boolean isEmpty()
	{
		return root==null;
	}
	
	Node n1 = new Node();
	Node n2 = new Node();
	Node n3 = new Node();
	Node n4 = new Node();
	Node n5 = new Node();
	Node n6 = new Node();
	Node n7 = new Node();
	Node n8 = new Node();
	Node n9 = new Node();
	Node n10 = new Node();
	Node n11 = new Node();
	Node n12 = new Node();
	Node n13 = new Node();
	Node n14 = new Node();
	Node n15 = new Node();
	Node n16 = new Node();
	Node n17 = new Node();
	Node n18 = new Node();
	Node n19 = new Node();
	Node n20 = new Node();
	Node n21 = new Node();
	Node n22 = new Node();
	Node n23 = new Node();
	Node n24 = new Node();
	Node n25 = new Node();

	public void treeCreation()
	{
		n1.setValue(4);
		n2.setValue(2);
		n3.setValue(3);
		n4.setValue(1);
		n5.setValue(20);
		n6.setValue(13);
		n7.setValue(30);
		n8.setValue(9);
		n9.setValue(17);
		n10.setValue(7);
		n11.setValue(12);
		n12.setValue(15);
		n13.setValue(19);
		n14.setValue(6);
		n15.setValue(8);
		n16.setValue(10);
		n17.setValue(14);
		n18.setValue(16);
		n19.setValue(18);
		n20.setValue(25);
		n21.setValue(35);
		n22.setValue(22);
		n23.setValue(28);
		n24.setValue(33);
		n25.setValue(40);
		
		addNode(n1);
		addNode(n2);
		addNode(n3);
		addNode(n4);
		addNode(n5);
		addNode(n6);
		addNode(n7);
		addNode(n8);
		addNode(n9);
		addNode(n10);
		addNode(n11);
		addNode(n12);
		addNode(n13);
		addNode(n14);
		addNode(n15);
		addNode(n16);
		addNode(n17);
		addNode(n18);
		addNode(n19);
		addNode(n20);
		addNode(n21);
		addNode(n22);
		addNode(n23);
		addNode(n24);
		addNode(n25);
	}
	Node root = new Node();
	Node originalRoot1 = new Node();
	Node originalRoot2 = new Node();
	//Node[] output = new Node[100];
	//int count = 0;
	
	public void addNode(Node n)
	{
		if(root.getValue() == null)
		{
			root = n;
		}
		else
		{
			if(root.getRightChild()==null && n.getValue() > root.getValue())
			{
				root.setRightChild(n);
				/*output[count]=n;
				count++;*/
			}
			else if(root.getLeftChild()==null && n.getValue() < root.getValue())
			{
				root.setLeftChild(n);
				/*output[count]=n;
				count++;*/
			}
			else
			{
				if(n.getValue() > root.getValue())
				{
					originalRoot1 = root;
					root=root.getRightChild();
					addNode(n);
					root = originalRoot1;
				}
				else if(n.getValue() < root.getValue())
				{
					originalRoot2 = root;
					root=root.getLeftChild();
					addNode(n);
					root = originalRoot2;
				}
				/*output[count]=n;
				count++;*/
			}
		}
	}

	public void preOrder(Node n)
	{
		if(n!=null)
		{
			System.out.println(n.getValue());
		}
		if(n.getLeftChild()!=null)
		{
			preOrder(n.getLeftChild());
		}
		if(n.getRightChild()!=null)
		{
			preOrder(n.getRightChild());
		}
	}
	Node originalFirstRoot = new Node();
	boolean c = false;
	public void searchNode(Node s)  // O(logn) - BST
	{
		if(!c)
		{
			originalFirstRoot = root;
			c = true;
		}
		if(s.getValue() == root.getValue())
		{
			System.out.println("-----------");
			System.out.println("SEAERCHING");
			System.out.println(s.getValue());
			root = originalFirstRoot;
		}
		else if(s.getValue() > root.getValue())
		{
			root = root.getRightChild();
			searchNode(s);
		}
		else if(s.getValue() < root.getValue())
		{
			root = root.getLeftChild();
			searchNode(s);
		}
	}
	
	Node prevRoot = new Node();
	Node originalRootD = new Node();
	boolean b = false;
	public void deleteNode(Node d)
	{
		if(!b)
		{
			originalRootD = root;
			prevRoot = root;
			b = true;
		}
		if(d.getValue() == root.getValue())
		{
			System.out.println("-----------");
			System.out.println("DELETING");
			System.out.println(d.getValue());
			System.out.println("--------------------");
			
			if(d.getLeftChild() == null && d.getRightChild() == null) // LEAF NODE
			{
				d.setValue(null);
				root = originalRootD;
				prevRoot = root;
			}
			else if(d.getLeftChild() == null) // Child node with no left child node
			{
				if(d.getValue() < prevRoot.getValue())
				{
					prevRoot.setLeftChild(d.getRightChild());
				}
				else if(d.getValue() > prevRoot.getValue())
				{
					prevRoot.setRightChild(d.getRightChild());
				}
				d.setValue(null);
			}
			else if(d.getRightChild() == null)  // Child node with no right child node
			{
				if(d.getValue() < prevRoot.getValue())
				{
					prevRoot.setLeftChild(d.getLeftChild());
				}
				else if(d.getValue() > prevRoot.getValue())
				{
					prevRoot.setRightChild(d.getLeftChild());
				}
				d.setValue(null);
			}
			else if(d.getLeftChild().getLeftChild() == null || d.getLeftChild().getRightChild() == null)  // Left Child's child node with < 2 child nodes
			{
				if(d.getValue() > prevRoot.getValue())
				{
					prevRoot.setRightChild(d.getLeftChild());
				}
				else if(d.getValue() < prevRoot.getValue())
				{
					prevRoot.setLeftChild(d.getLeftChild());
				}
				
				// extra set - if 
				if(d.getLeftChild().getRightChild() != null)
				{
					d.getLeftChild().setLeftChild(d.getLeftChild().getRightChild());
				}
				d.getLeftChild().setRightChild(d.getRightChild());
				d.setValue(null);
			}
			else if(d.getRightChild().getLeftChild() == null || d.getRightChild().getRightChild() == null)// Right Child's child node with < 2 child nodes
			{
				if(d.getValue() > prevRoot.getValue())
				{
					prevRoot.setRightChild(d.getRightChild());// if existing child node has already right child then make it right and then make current right child
				}
				else if(d.getValue() < prevRoot.getValue())
				{
					prevRoot.setLeftChild(d.getRightChild());
				}
				
				// extra set - if 
				if(d.getRightChild().getLeftChild() != null) // if existing child node has already left child then make it right and then make current left child
				{
					d.getRightChild().setRightChild(d.getRightChild().getLeftChild());
				}
				d.getRightChild().setLeftChild(d.getLeftChild());
				d.setValue(null);
			}
			else // All child node has 2 child nodes for 2 levels at least.
			{
				if(d.getValue() < prevRoot.getValue())
				{
					prevRoot.setLeftChild(d.getLeftChild().getRightChild());
					prevRoot.getLeftChild().setLeftChild(d.getLeftChild());
					prevRoot.getLeftChild().setRightChild(d.getRightChild());
					prevRoot.getLeftChild().getLeftChild().setRightChild(null);
				}
				else if(d.getValue() > prevRoot.getValue())
				{
					Node leaf = findLeafNode(d, true);
					Node leafLeft = leaf.getLeftChild();
					
					leafPrevious.setRightChild(leafLeft);
					prevRoot.setRightChild(leaf);
					prevRoot.getRightChild().setValue(leaf.getValue());
					
					/*
					prevRoot.setRightChild(leaf);
					leaf.setLeftChild(d.getLeftChild());
					prevRoot.getRightChild().setLeftChild(d.getLeftChild());
					prevRoot.getRightChild().setRightChild(d.getRightChild());
					prevRoot.getRightChild().getLeftChild().setRightChild(null);
					*/
					/*prevRoot.setRightChild(d.getLeftChild().getRightChild());
					prevRoot.getRightChild().setLeftChild(d.getLeftChild());
					prevRoot.getRightChild().setRightChild(d.getRightChild());
					prevRoot.getRightChild().getLeftChild().setRightChild(null);*/
				}
			}
			//d.setValue(null);
			root = originalRootD;
			prevRoot = root;
		}
		else if(d.getValue() > root.getValue())
		{
			prevRoot = root;
			root = root.getRightChild();
			deleteNode(d);

		}
		else if(d.getValue() < root.getValue())
		{
			prevRoot = root;
			root = root.getLeftChild();
			deleteNode(d);
		}
	}
	
	Node leafPrevious = new Node();
	public Node findLeafNode(Node lf, boolean firstTime)
	{
		if(firstTime)
		{
			leafPrevious = lf.getLeftChild();
			findLeafNode(lf.getLeftChild().getRightChild(), false);
		}
		else
		{
			if(lf.getRightChild()!=null)
			{
				leafPrevious = lf;
				findLeafNode(lf.getRightChild(), false);
			}
			else
			{
				return lf;
			}
		}
		return lf;
/*		if(lf.getLeftChild() == null && lf.getRightChild() == null)
		{	
			return lf;
		}
		if(lf.getLeftChild() == null)
		{
			findLeafNode(lf.getRightChild(), false);
		}
		if(lf.getRightChild() == null)
		{
			findLeafNode(lf.getLeftChild(), false);
		}
		findLeafNode(lf.getLeftChild(), false);
		return lf;*/ 
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		/*for(int i=0;i<output.length;i++)
		{
			if(output[i] != null)
			{
				sb.append(output[i].getValue());
			}
		}*/
		return sb.toString();
	}
}
