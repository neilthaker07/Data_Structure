package stackQueue;

import java.util.Stack;

public class MyQueueUse2Stacks {

	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueueUse2Stacks m2 = new MyQueueUse2Stacks();
		
		m2.addQ(5);
		m2.addQ(77);
		m2.addQ(6);
		m2.addQ(3);
		m2.addQ(8);
		m2.removeQ();
		m2.removeQ();
		
		m2.showOuptput();
	/*	System.out.println(m2.s1);
		System.out.println(m2.s2);*/
		
	}

	public void showOuptput() 
	{
		if(s1.size()==0)
		{
			int l = s2.size();
			for(int i=0;i<l;i++)
			{
				s1.push(s2.pop());
			}
		}
		System.out.println(s1);
	}
	
	public void addQ(int value)
	{
		if(s2.size()>0)
		{
			int l = s2.size();
			for(int i=0;i<l;i++)
			{
				s1.push(s2.pop());
			}
		}
		s1.push(value);
	}
	
	public Integer removeQ()
	{
		if(s1.size()>0)
		{
			int l =s1.size();
			for(int i=0;i<l;i++)
			{
				s2.push(s1.pop());
			}
		}
		s2.pop();
		return 0;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s1.size();i++)
		{
			sb.append(s1.get(i)+" ");
		}
		return sb.toString();
	}
}
