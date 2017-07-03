package treesGraphs;

public class FirstCommonAncestor {

	public static void main(String[] args) {
		
		FirstCommonAncestor tree = new FirstCommonAncestor();
		NodeLocal n1 = new NodeLocal(90);
		NodeLocal n2 = new NodeLocal(70);
		NodeLocal n3 = new NodeLocal(100);
		NodeLocal n4 = new NodeLocal(30);
		NodeLocal n5 = new NodeLocal(80);
		NodeLocal n6 = new NodeLocal(95);
		NodeLocal n7 = new NodeLocal(200);
		NodeLocal n8 = new NodeLocal(20);
		NodeLocal n9 = new NodeLocal(40);
		NodeLocal n10 = new NodeLocal(92);
		NodeLocal n11 = new NodeLocal(150);
		NodeLocal n12 = new NodeLocal(400);
		
		n1.setLeft(n2);
		n1.setRight(n3);
		
		n2.setLeft(n4);
		n2.setRight(n5);
		n2.setParent(n1);
		
		n3.setLeft(n6);
		n3.setRight(n7);
		n3.setParent(n1);

		n4.setLeft(n8);
		n4.setRight(n9);
		n4.setParent(n2);

		n5.setParent(n2);
		
		n6.setParent(n3);
		n6.setLeft(n10);
		
		n7.setLeft(n11);
		n7.setRight(n12);
		n7.setParent(n3);
		
		n8.setParent(n4);
		
		n9.setParent(n4);
		
		n10.setParent(n6);
		
		n11.setParent(n7);
		
		n12.setParent(n7);
		
		tree.getCommonAncestor(n8, n11);
	}

	public void getCommonAncestor(NodeLocal n1, NodeLocal n2)
	{
		NodeLocal t1=n1;
		NodeLocal t2=n2;
		if(n1 == null || n2==null)
		{
			System.out.println("Insert correct nodes.");
		}
		else
		{
			boolean a = checkEachOtherAncestor(n1, n2);
			boolean b = false;
			if(!a)
			{
				while(n1.parent!=null)
				{
					while(n2.parent!=null)
					{
						if(n1.parent == n2.parent)
						{
							System.out.println("Common Ancestor found "+n1.parent.data);
							b = true;
							break;
						}
						n2=n2.parent;
					}
					n2=t2;
					if(b)
					{
						break;
					}
					n1=n1.parent;
				}
				n1=t1;
			}
		}
	}

	private boolean checkEachOtherAncestor(NodeLocal n1, NodeLocal n2) 
	{
		NodeLocal t1=n1;
		while(t1.parent!=null)
		{
			if(t1.parent == n2)
			{
				System.out.println("node2 is ancestor of n'ode1.");
				return true;
			}
			t1=t1.parent;
		}
		
		NodeLocal t2=n2;
		while(t2.parent!=null)
		{
			if(t2.parent == n1)
			{
				System.out.println("node1 is ancestor of node2.");
				return true;
			}
			t2=t2.parent;
		}
		return false;
	}
}