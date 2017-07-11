package linkedListEx;

public class LinkedListCycleCheck {

	Node head;
	Node tail;
	int size ;
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		LinkedListCycleCheck ls= new LinkedListCycleCheck();
		ls.add(5);
		ls.add(4);
		ls.add(9);
		ls.add(1);
		ls.add(3);
		ls.add(2);
		ls.add(8);
		
		Node p1 = ls.head.getNext();
		Node p2 = ls.head.getNext().getNext();
		
		System.out.println(ls.cycle(p1, p2));
	}

	private boolean cycle(Node p1, Node p2) {
		int c=1;
		while(p1!=null && p2!=null && p2.getNext()!=null)
		{
			if(p1==p2)
			{
				return true;
			}
			p1=p1.getNext();
			p2=p2.getNext().getNext();
			c++;
		}
		System.out.println(c);
		return false;
	}

	void add(int q)
	{
		Node node = new Node();
		node.setValue(q);
		
		if(q==8)
		{
			node.setNext(head.getNext());
		}
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
	}
}
