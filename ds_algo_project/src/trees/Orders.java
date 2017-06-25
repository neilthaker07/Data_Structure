package trees;

public class Orders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orders o = new Orders();
		CustomTree cc = o.createTree();

		o.inOrder(cc);
		o.preOrder(cc);
		o.postOrder(cc);
	}

	public CustomTree createTree()
	{
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		
		n1.value=5;
		n2.value=3;
		n3.value=7;
		n4.value=1;
		
		n1.childLeft = n2;
		n1.childRight = n3;
		n3.childLeft = n4;

		Node allNodes[] = new Node[]{n1,n2,n3,n4};
		
		CustomTree cc = new CustomTree();
		cc.setNode(allNodes);
		return cc;
	}
	int count =0;
	public void inOrder(CustomTree ct)
	{
		Node[] n = ct.getNode();
		for(int i =0;i<n.length;i++)
		{
			inOrderProcessing(n[i]);
		}
	}

	private void inOrderProcessing(Node n) 
	{
		if(n != null && count < 4)
		{
			if(n.childLeft!=null)
			{
				inOrderProcessing(n.childLeft);
			}
			System.out.println(n.value);
			count++;
			if(n.childRight!=null)
			{
				inOrderProcessing(n.childRight);
			}
		}
	}
	
	public void preOrder(CustomTree ct)
	{
		Node[] n = ct.getNode();
		for(int i =0;i<n.length;i++)
		{
			preOrderProcessing(n[i]);
		}
	}
	
	private void preOrderProcessing(Node n)
	{
		if(n != null && count < 8)
		{
			count++;
			System.out.println(n.value);
			if(n.childLeft!=null)
			{
				preOrderProcessing(n.childLeft);
			}
			if(n.childRight!=null)
			{
				preOrderProcessing(n.childRight);
			}
		}
	}
	public void postOrder(CustomTree ct)
	{
		Node[] n = ct.getNode();
		for(int i =0;i<n.length;i++)
		{
			postOrderProcessing(n[i]);
		}
	}
	
	private void postOrderProcessing(Node n)
	{
		if(n != null && count < 12)
		{
			if(n.childLeft!=null)
			{
				postOrderProcessing(n.childLeft);
			}
			if(n.childRight!=null)
			{
				postOrderProcessing(n.childRight);
			}
			count++;
			System.out.println(n.value);
		}
	}
}

class CustomTree
{
	public Node[] nodes;
	
	public Node[] getNode() {
		return nodes;
	}

	public void setNode(Node[] nodes) {
		this.nodes = nodes;
	}
}