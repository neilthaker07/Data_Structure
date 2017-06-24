package stackQueue;

import java.util.Stack;

public class MinOptimizedStack extends Stack<Integer>
{
	Stack<Integer> s2 ;
	public MinOptimizedStack()
	{
		s2=new Stack<Integer>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinOptimizedStack ms = new MinOptimizedStack();
		ms.push(2);
		ms.pop();
		ms.push(4);
		ms.push(3);
		ms.push(5);
		ms.push(1);
		ms.pop();
		System.out.println(ms.min());
	}
	
	public void push(int value)
	{
		if(value <= min())
		{
			s2.push(value);
		}
		super.push(value);
	}
	
	public Integer pop()
	{
		int value = super.pop();
		if(value == min())
		{
			s2.pop();
		}
		return value;
	}
	
	public int min()
	{
		if(s2.isEmpty())
		{
			return Integer.MAX_VALUE;
		}
		else
		{
			return s2.peek();
		}
	}
}
