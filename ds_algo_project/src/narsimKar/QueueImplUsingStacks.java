package narsimKar;

import java.util.Stack;

public class QueueImplUsingStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		QueueImplUsingStacks q = new QueueImplUsingStacks();
		q.enq(5);
		q.enq(3);
		q.enq(1);
		System.out.println(q.deq());
		q.enq(6);
		System.out.println(q.deq());
		q.enq(4);
		System.out.println(q.deq());
		System.out.println(q.deq());
		System.out.println(q.deq());
		System.out.println(q.deq());
	}
	
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	public void enq(int n)
	{
		s1.push(n);
	}
	
	public int deq()
	{
		if(s1.isEmpty())
		{
			return 0;
		}
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		int x = s2.pop();
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
		
		return x;
	}

}
