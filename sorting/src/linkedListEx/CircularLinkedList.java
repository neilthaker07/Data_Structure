package linkedListEx;

public class CircularLinkedList {

	static int size = 0;
	static Node head= null;
	static Node tail = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreationLinkedList c = new CreationLinkedList();
		c.addNode(1);
		c.addNode(2);
		c.addNode(3);
		c.addNode(4);
		c.addNode(5);
		size=c.size();
		head=c.head;
		tail=c.tail;

		CircularLinkedList cl = new CircularLinkedList();
		cl.findCircleStarting();
	}
	
	public void findCircleStarting()
	{
		Node n=head;
		Node a = null;
		for(int i=0;i<5;i++)
		{
			//System.out.println(n+" : "+n.getNext());
			n=n.getNext();
			if(n.getValue()==3)
			{
				a=n;
			}
			if(n.getValue()==5)
			{
				n.setNext(a);
			}
		}
		// Nodes : 1-2-3-4-5-3
		
		Node s=head;
		Node f=head;
		Node circleStartNode=null;
		boolean collide = false;
		for(int i=0;i<size*2;i++)
		{
			// first get collision node
			if(s.getValue()==f.getValue() && !collide && i>0)
			{
				s=head;
				collide=true;
			}
			// from collision node , set slow to initial node then increase both 1 each time.
			else if(s.getValue()==f.getValue() && collide) 
			{
				circleStartNode=s;
				break;
			}
			else 
			{
				s=s.getNext();
				f= collide==true ? f.getNext() : f.getNext().getNext();
			}
		}
		System.out.println(circleStartNode);
	}
}
