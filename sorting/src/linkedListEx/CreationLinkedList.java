package linkedListEx;

public class CreationLinkedList {
	
	static Node head;
	static Node tail;
	static int size ;

	public static void main(String[] args) {

		CreationLinkedList c = new CreationLinkedList();
		
		c.addNode(5);
		c.addNode(3);
		c.addNode(6);
		c.addNode(1);
		c.addNode(8);
		/*c.addNode(11, 0);
		c.addNode(9, 2);
		c.addAtHead(4);
		c.addAtTail(2);*/
		/*c.removeNode(6);
		c.removeNode(5);
		c.removeNode(8);
		c.removeHead();
		c.removeTail();
		c.removePos(4);*/
		size = c.size();
		System.out.println(c);
		System.out.println("size = "+size);
	}

	public void addNode(int q) 
	{
		Node node = new Node();
		node.setValue(q);
		if(head==null)
		{
			head = node;
			tail = node;
		}
		else{
			tail.setNext(node);
			tail = node;
		}
		size++;
		//System.out.println("NODE : "+node);
		
		/*System.out.println("HEAD  : "+head);
		System.out.println("TAIL : "+tail);
		*/
		//System.out.println("HEAD : "+head.getValue()+" :TAIL: "+tail.getValue());
		/*if(head.getNextRef() != null && tail.getNextRef()!=null)
		{
			System.out.println("REF : "+ head.getNextRef().getValue() + ":::"+tail.getNextRef().getValue());
		}*/
	}
	public void addNode(int q, int index)
	{
		Node node = new Node();
		node.setValue(q);
		if(index==0)
		{
			node.setNext(head);
			head = node;
		}
		else
		{
			int count = 1;
			Node cur=head;
			Node nex=head.getNext();
			while(count!=index)
			{
				cur=nex;
				nex=nex.getNext();
				count++;
			}
			cur.setNext(node);
			node.setNext(nex);
			size++;
		}
	}

	public void addAtHead(int q) 
	{
		Node node = new Node();
		node.setValue(q);
		node.setNext(head);
		head = node;
	}
	
	public void addAtTail(int q)
	{
		Node node = new Node();
		node.setValue(q);
		tail.setNext(node);
		tail=node;
	}
	
	public void removeNode(int nodeVal)
	{
		Node prev = head;
		Node mid = head.getNext();
		Node next = mid.getNext();
		int i=0;
		while(i<size)
		{
			if(nodeVal==head.getValue())
			{
				head=mid;
				mid=next;
			}
			if(nodeVal==mid.getValue())
			{
				prev.setNext(next);
				prev=mid;
				mid=next;
			}
			if(next==tail && nodeVal!=tail.getValue())
			{
				break;
			}
			if(next==tail && nodeVal==tail.getValue())
			{
				mid.setNext(null);
				break;
			}
			prev=mid;
			mid=next;
			next=next.getNext();
			i++;
		}
	}
	
	public void removePos(int pos)
	{
		boolean flag = false ;
		if(pos==0)
		{
			removeHead();
			flag=true;
		}
		if(pos==size-1)
		{
			removeTail();
			flag=true;
		}
		Node prev = head;
		Node next = prev.getNext();
		int i=0;
		if(!flag)
		{
			while(i<size )
			{
				if(i==pos)
				{
					break;
				}
				prev=next;
				// condition
				next=next.getNext();
				i++;
			}
			removeNode(prev.getValue());
		}
		
	}
	
	public void removeHead()
	{
		head=head.getNext();
	}
	
	public void removeTail()
	{
		Node first = head; 
		Node next = head.getNext();
		int i=0;
		while(i<size)
		{
			if(next==tail)
			{
				first.setNext(null);
				break;
			}
			first=next;
			next=next.getNext();
			i++;
		}
	}
	
	public int size()
	{
		Node h = head;
		int count=0;
		while(h.getNext()!=null)
		{
			h=h.getNext();
			count++;
		}
		return count+1;
	}
	
	@Override
	public String toString()
	{
		StringBuilder a = new StringBuilder();
		Node n = head;
		while(n!=null)
		{
			a.append(n);
			n=n.getNext();
		}
		return a.toString();
	}
}

