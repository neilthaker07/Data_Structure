package stackQueue;

import java.util.Stack;

public class MinStack extends Stack<NodeWithMin> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack a = new MinStack();
		a.push(4);
		a.push(2);
		a.push(3);
		a.push(6);
		a.push(5);
		System.out.println(a.min());
	}

	public void push(int value)
	{
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}
	
	public int min()
	{
		if(this.isEmpty())
		{
			return Integer.MAX_VALUE; //error value
		}
		else
		{
			return peek().min;
		}
	}
}

class NodeWithMin
{
	public int value;
	public int min;

	public NodeWithMin(int value, int min)
	{
		this.value = value;
		this.min = min;
	}	
}