package recursionDp;

import java.util.Stack;

public class TowersOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowersOfHanoi t = new TowersOfHanoi();
		t.s1.push(3);
		t.s1.push(2);
		t.s1.push(1);
		t.process();
	}
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();
	Stack<Integer> s3 = new Stack<Integer>();
	
	public void process()
	{
		makeBufferStack();
		moveTopOfMainStackToDest();
		moveBufferStackToDest();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	}
	int originalSizeS1 = s1.size();
	public void makeBufferStack()
	{
		for(int i=0;i<s1.size()-1;i++)
		{
			if(s2.isEmpty() || s1.peek() < s2.peek())
			{
				s2.push(s1.pop());
			}
			else if(s3.isEmpty() || s1.peek() < s3.peek())
			{
				s3.push(s1.pop());
			}
			else if(!s3.isEmpty() && s2.peek() < s3.peek())
			{
				s3.push(s2.pop());
				s2.push(s1.pop());
			}
		}
		
		while(!s3.isEmpty())
		{
			if(s3.peek() < s1.peek())
			{
				s1.push(s3.pop());
			}
			else if(s3.peek() < s2.peek())
			{
				s2.push(s3.pop());
			}
		}
		
		while(s1.size()!=1)
		{
			if(s1.peek() < s2.peek())
			{
				s2.push(s1.pop());
			}
			else if(s1.peek() < s3.peek())
			{
				s3.push(s1.pop());
			}
		}
	}
	public void moveTopOfMainStackToDest()
	{
		if(s3.isEmpty() || s1.peek() < s3.peek())
		{
			s3.push(s1.pop());
		}
	}
	public void moveBufferStackToDest()
	{
		if(s3.isEmpty() || s2.peek() < s3.peek())
		{
			s3.push(s2.pop());
		}
	}
}