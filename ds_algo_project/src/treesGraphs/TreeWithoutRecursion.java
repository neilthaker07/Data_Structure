package treesGraphs;

public class TreeWithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeWithoutRecursion mt = new TreeWithoutRecursion();
		mt.treeCreation();
		mt.preOrder(mt.root);
		
		//System.out.println("*-----------------------*");
		//mt.root = mt.n1;
		//mt.preOrder(mt.root);
		//System.out.println("*-----------------------*");
	}
	
	DoublyNodes root = new DoublyNodes();

	DoublyNodes n1 = new DoublyNodes();
	DoublyNodes n2 = new DoublyNodes();
	DoublyNodes n3 = new DoublyNodes();
	DoublyNodes n4 = new DoublyNodes();
	DoublyNodes n5 = new DoublyNodes();
	DoublyNodes n6 = new DoublyNodes();
	DoublyNodes n7 = new DoublyNodes();
	
	public void treeCreation()
	{
		n1.setValue(4);
		n2.setValue(2);
		n3.setValue(3);
		n4.setValue(1);
		n5.setValue(20);
		n6.setValue(13);
		n7.setValue(30);
		
		addNode(n1);
		addNode(n2);
		addNode(n3);
		addNode(n4);
		/*addNode(n5);
		addNode(n6);
		addNode(n7);*/
	}
	
	public void addNode(DoublyNodes n)
	{
		DoublyNodes originalRoot1 = new DoublyNodes();
		DoublyNodes originalRoot2 = new DoublyNodes();
		
		if(root.getValue() == null)
		{
			root = n;
		}
		else
		{
			if(root.getRight()==null && n.getValue() > root.getValue())
			{
				root.setRight(n);
				n.setLeft(root);
			}
			else if(root.getLeft()==null && n.getValue() < root.getValue())
			{
				root.setLeft(n);
				n.setRight(root);
			}
			else
			{
				if(n.getValue() > root.getValue())
				{
					originalRoot1 = root;
					while(root.getRight()!=null)
					{
						if(root.getValue() < n.getValue() &&  root.getRight() == null)
						{
							root.setRight(n);
							n.setLeft(root);
							break;
						}
						else if(root.getValue() < n.getValue() && root.getRight().getValue() > n.getValue())
						{
							root.setRight(n);
							n.setLeft(root);
							break;
						}
						root = root.getRight();
					}
					root = originalRoot1;
				}
				else if(n.getValue() < root.getValue())
				{
					originalRoot2 = root;
					while(root.getLeft()!=null || root.getRight()!=null)
					{
						if(root.getLeft().getValue() > n.getValue() &&  root.getLeft().getLeft() == null)
						{
							root.getLeft().setLeft(n);
							n.setRight(root.getLeft());
							break;
						}
						else if(root.getValue() > n.getValue() && root.getLeft().getValue() < n.getValue())
						{
							root.getLeft().setRight(n);
							n.setRight(root);
							n.setLeft(root.getLeft());
							root.setLeft(n);
							break;
						}
						root = root.getLeft();
					}
					root = originalRoot2;
				}
			}
		}
	}

	public void preOrder(DoublyNodes n)
	{
		if(n!=null)
		{
			System.out.println(n.getValue());
		}
		if(n.getLeft()!=null)
		{
			preOrder(n.getLeft());
		}
		if(n.getRight()!=null)
		{
			preOrder(n.getRight());
		}
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