package narsimKar;

public class LinkedListInsertion {

	public static void main(String[] args) {
		LinkedListInsertion l = new LinkedListInsertion();
		
		Node n1 = new Node();
		n1.data = 9;

		l.head = n1;
		
		Integer a= l.head.next==null ? null : l.head.next.data;
		System.out.println(l.head.data+" --> "+ a);
		
		
		while(l.head.next!=null)
		{
			System.out.println(l.head.data+" --> "+ l.head.next.data);
		}
	}
	
	public void insert(Node head, int data)
	{
		
	}

	Node head = null;
}
class Node {
    int data;
    Node next;
 }
