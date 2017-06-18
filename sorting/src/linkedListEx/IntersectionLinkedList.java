package linkedListEx;

public class IntersectionLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreationLinkedList l1 = new CreationLinkedList();
		l1.addNode(1);
		l1.addNode(2);
		l1.addNode(3);
		l1.addNode(4);
		l1.addNode(5);
		l1.addNode(6);
		
		CreationLinkedList l2 = new CreationLinkedList();
		l2.addNode(9);
		l2.addNode(4);
		l2.addNode(5);
		l2.addNode(6);
		
		// tail compare
		if(l1.tail.getValue()!=l2.tail.getValue())
		{
			System.out.println("No intersection");
		}
		
		Node l1Head = l1.head;
		Node l2Head = l2.head;
		
		if(l1.size>l2.size)
		{
			int r = l1.size-l2.size;
			for(int i=0;i<r;i++)
			{
				l1Head=l1Head.getNext();
			}
		}
		else if(l1.size<l2.size)
		{
			int r = l2.size-l1.size;
			for(int i=0;i<r;i++)
			{
				l2Head=l2Head.getNext();
			}
		}

		while(l1Head.getValue()!=l2Head.getValue())
		{
			if(l1Head !=null)
			{
				l1Head=l1Head.getNext();
				l2Head=l2Head.getNext();
			}
		}
		System.out.println(l1Head.getValue());
	}
}
