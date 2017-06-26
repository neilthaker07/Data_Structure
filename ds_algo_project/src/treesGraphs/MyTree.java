package treesGraphs;

public class MyTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyTree mt = new MyTree();
		mt.treeCreation();
		
		System.out.println(mt);
	}

	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void treeCreation()
	{
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		Node n6 = new Node();
		Node n7 = new Node();
		n1.setValue(4);
		n2.setValue(6);
		n3.setValue(8);
		n4.setValue(2);
		n5.setValue(3);
		n6.setValue(1);
		n7.setValue(5);
		
		addNode(n1);
		addNode(n2);
		addNode(n3);
		addNode(n4);
		addNode(n5);
		addNode(n6);
		addNode(n7);
	}
	Node root = new Node();
	Node originalRoot = new Node();
	Node[] output = new Node[100];
	int count = 0;
	
	public void addNode(Node n)
	{
		if(root.getValue() == null)
		{
			root = n;
			output[count]=root;
			count++;
		}
		else
		{
			if(root.getRightChild()==null && n.getValue() > root.getValue())
			{
				root.setRightChild(n);
				output[count]=n;
				count++;
			}
			else if(root.getLeftChild()==null && n.getValue() < root.getValue())
			{
				root.setLeftChild(n);
				output[count]=n;
				count++;
			}
			else
			{
				if(n.getValue() > root.getValue())
				{
					originalRoot = root;
					root=root.getRightChild();
					addNode(n);
					root = originalRoot;
				}
				else if(n.getValue() < root.getValue())
				{
					originalRoot = root;
					root=root.getLeftChild();
					addNode(n);
					root = originalRoot;
				}
				output[count]=n;
				count++;
			}
		}
	}
	
	public void searchNode()
	{
		
	}
	
	public void deleteNode()
	{
		
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<output.length;i++)
		{
			if(output[i] != null)
			{
				sb.append(output[i].getValue());
			}
		}
		return sb.toString();
	}
}
