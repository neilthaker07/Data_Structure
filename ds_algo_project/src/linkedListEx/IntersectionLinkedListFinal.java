package linkedListEx;

public class IntersectionLinkedListFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntersectionLinkedListFinal l1 = new IntersectionLinkedListFinal();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		
		l1.head=null;
		
		IntersectionLinkedListFinal l2 = new IntersectionLinkedListFinal();
		l2.add(9);
		
		
		if(l2.tail!=l1.tail)
		{
			System.out.println("Not intersecting");
		}
		else
		{
			int l = l1.size > l2.size ? l1.size : l2.size ;
		}
		
		
	}
	Node head;
	Node tail;
	int size ;
	Node temp;
	
	public void add(int q)
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

		if(q==4)
		{
			temp = node;
		}
		if(q==5)
		{
			temp.setNext(node);
		}
		if(q==6)
		{
			temp.getNext().setNext(node);;
		}
		
		if(q==9)
		{
			node.setNext(temp);
		}
		size++;
	}
}
