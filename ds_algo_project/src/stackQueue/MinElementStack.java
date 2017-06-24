package stackQueue;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MinElementStack {

	Integer topOfArray;
	int currentStackSize = 10; 
	Integer array[] = new Integer[currentStackSize];
	int counter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinElementStack ms = new MinElementStack();
		ms.push(7);
		ms.push(4);
		ms.push(9);
		ms.push(2);
		System.out.println(ms.getMin());
		ms.pop();
		ms.pop();
		System.out.println(ms.getMin());
		System.out.println(ms);
	}
	
	private int getMin() {
		int min = 5000;
		for(int i=0;i<currentStackSize;i++)
		{
			if(array[i]!=null && min > array[i])
			{
				min = array[i];
			}
		}
		return min;
	}

	public void push(int data)
	{
		{
			array[counter]=data;
			topOfArray=data;
			counter++;
		}
		//else
		{
		/*	b[bcounter]=data;
			btop=data;
			bcounter++;*/
		}
	}
	
	public int pop()
	{
		if(topOfArray==null)
		{
			throw new EmptyStackException();
		}
		counter--;
		int r = array[counter];
		array[counter]=null;
		if(counter-1>0 || counter-1==0)
		{
			topOfArray=array[counter-1];
		}
		else
		{
			topOfArray=null;
		}
		return r;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(Arrays.toString(array));
		return sb.toString();
	}

}
