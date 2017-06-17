package linkedListEx;

public class PartitionElement {

	static int size = 0;
	
	static Node head1= null;
	static Node tail1 = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreationLinkedList c = new CreationLinkedList();
		c.addNode(3);
		c.addNode(5);
		c.addNode(8);
		c.addNode(5);
		c.addNode(10);
		c.addNode(2);
		c.addNode(1);
		size = c.size();
		head1=c.head;
		tail1=c.tail;
		
		PartitionElement pe = new PartitionElement();
		c.head = pe.partition(5);
		
		System.out.println(c);
	}
	
	public Node partition(int p)
	{
		Node h = head1;
		Node prev = null;
		boolean partitionExists = false;
		for(int i=0;i<size;i++)
		{
			if(h.getValue() < p)
			{
				if(prev!=null)
				{
					prev.setNext(h.getNext());
					h.setNext(head1);
					head1=h;
					h=prev.getNext();
				}
				else
				{
					h=h.getNext();
				}
			}
			else if(h.getValue() > p/* && h!=null*/)
			{
				if(prev!=null)
				{
					prev.setNext(h.getNext());
				}
				tail1.setNext(h);
				tail1=h;
				tail1.setNext(null);
				if(prev!=null)
				{
					h=prev.getNext();
				}
				else
				{
					head1=h.getNext();
					h=head1;
				}
			}
			else if(h!=null && h.getValue() == p)
			{
				prev=h;
				h=h.getNext();
				partitionExists=true;
			}
		}
		
		if(partitionExists)
		{
			Node partitionNode=head1;
			prev=null;
			for(int i=0;i<size;i++)
			{
				if(partitionNode!=null && partitionNode.getValue()==p)
				{
					if(prev!=null)
					{
						prev.setNext(partitionNode.getNext());
					}
					else
					{
						head1=partitionNode.getNext();
					}
					tail1.setNext(partitionNode);
					tail1=partitionNode;
					tail1.setNext(null);
					if(prev!=null)
					{
						partitionNode = prev.getNext();
					}
					else
					{
						partitionNode=head1;
					}
				}
				else
				{
					prev=partitionNode;
					partitionNode=partitionNode.getNext();
				}
			}
		}
		
		/*System.out.println(head1);
		System.out.println(head1.getNext());
		System.out.println(tail1);*/
		
		return head1;
	}
}
