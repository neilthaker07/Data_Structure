package stackQueue;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStackArray ms = new MyStackArray();
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		ms.pop();
		ms.pop();
		ms.push(5);
		ms.push(6);
		ms.push(7);
		ms.push(8);
		ms.push(9);
		ms.pop();
		System.out.println(ms.peek());
		System.out.println(ms);
	}

	int topOfArray;
	int currentStackSize = 4; 
	int array[] = new int[currentStackSize];
	int counter = 0;

	public void push(int data)
	{
		if(counter+1 > array.length)
		{
			int l[] = array;
			array = new int[(currentStackSize*3/2)+1];
			currentStackSize = (currentStackSize*3/2)+1;
			for(int i=0;i<l.length;i++)
			{
				array[i] = l[i];
			}
		}
		array[counter]=data;
		topOfArray=data;
		counter++;
	}
	public void pop()
	{
		if(topOfArray==0)
		{
			throw new EmptyStackException();
		}
		counter--;
		array[counter]=0;
		topOfArray=array[counter-1];
	}
	
	public int peek()
	{
		if(topOfArray==0)
		{
			throw new EmptyStackException();
		}
		return topOfArray;
	}
	public boolean isNull()
	{
		return topOfArray==0;
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(Arrays.toString(array));
		return sb.toString();
	}
}
