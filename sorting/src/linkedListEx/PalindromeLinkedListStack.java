package linkedListEx;

import java.util.Stack;

public class PalindromeLinkedListStack {

	static int size = 0;
	static Node head= null;
	static Node tail = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreationLinkedList c = new CreationLinkedList();
		c.addNode(1);
		c.addNode(2);
		c.addNode(3);
		c.addNode(3);
		c.addNode(2);
		c.addNode(1);
		
		size=c.size();
		head=c.head;
		tail=c.tail;

		PalindromeLinkedListStack pl = new PalindromeLinkedListStack();
		System.out.println(pl.palindromeCheck());
	}
	
	// fast runner slow runner technique using stack
	public boolean palindromeCheck()
	{
		Node slow = head;
		Node fast = head;
		
		Stack<Integer> s = new Stack<Integer>();
		while(fast!=null)
		{
			s.push(slow.getValue());
			slow=slow.getNext();
			if(fast.getNext()!=null)
			{
				fast=fast.getNext().getNext();
			}
			else
			{
				fast=null;
			}
		}
		if(size%2!=0)
		{
			s.pop();
		}
		while(slow!=null)
		{
			if(slow.getValue()!=s.pop())
			{
				return false;
			}
			slow=slow.getNext();
		}
		return true;
	}
}
