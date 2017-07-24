package narsimKar;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplUsingQueues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackImplUsingQueues q = new StackImplUsingQueues();
		q.push(6);
		q.push(2);
		System.out.println(q.pop());
		q.push(1);
		q.push(3);
		q.push(4);
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
	}
	
	Queue<Integer> q1 = new LinkedList<Integer>();
	Queue<Integer> q2 = new LinkedList<Integer>();
	
	public void push(int n)
	{
		q1.add(n);
	}
	
	public int pop()
	{
		if(q1.size()==0)
		{
			return 0;
		}
		int l = q1.size()-1;
		for(int i=0;i<l;i++)
		{
			q2.add(q1.remove());
		}
		int x = q1.remove();
		while(!q2.isEmpty())
		{
			q1.add(q2.remove());
		}
		return x;
	}

}
