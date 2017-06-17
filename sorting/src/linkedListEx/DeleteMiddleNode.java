package linkedListEx;

public class DeleteMiddleNode {

	static int size = 0;
	static CreationLinkedList c = new CreationLinkedList();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c.addNode(5);
		c.addNode(5);
		c.addNode(7);
		c.addNode(2);
		c.addNode(4);
		c.addNode(1);
		size = c.size();

		deleteMiddle();
		System.out.println(c);
		System.out.println("size = "+size);
	}
	
	public static void deleteMiddle()
	{
		// O(1) space and time - O(n)
		int pos = (size%2==0) ? (size/2)-1 : size/2; 
		c.removePos(pos);
		size--;
	}
}
