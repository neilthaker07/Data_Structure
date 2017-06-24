package stackQueue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class StackOfPlates
{
	int capacity = 3;
	int originalCapacity = 3;
	Integer array[] = new Integer[capacity];
	int counter = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StackOfPlates sp = new StackOfPlates();
		sp.push(5);
		sp.push(2);
		sp.push(7);
		sp.push(8);
		sp.push(3);
		System.out.println(sp.pop());
		sp.popAtIndex(4);
		System.out.println(sp);
	}
	
	public void push(int value)
	{
		if(counter < capacity)
		{
			array[counter] = value;
		}
		else
		{
			Integer l[] = new Integer[capacity]; 
			l = array;
			array = new Integer[capacity + originalCapacity];
			for(int i = 0; i < capacity ; i++)
			{
				array[i] = l[i];
			}
			capacity = capacity + originalCapacity;
			array[counter] = value;
		}
		counter++;
	}
	
	public Integer pop()
	{
		counter--;
		Integer popped = array[counter]; 
		array[counter] = null;
		return popped;
	}
	
	public Integer popAtIndex(int index)
	{
		int popped = 0;
		if(index < counter)
		{
			int tempCounter = counter;
			tempCounter = index;
			popped = array[tempCounter];
			array[tempCounter]=null; // pop element from specific position.
			counter--;
			for(int i=tempCounter;i<counter;i++)
			{
				array[i]=array[i+1];
			}
			array[counter] = null; // remove last element
		}
		else
		{
			throw new NoSuchElementException();
		}
		return popped;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(Arrays.toString(array));
		return sb.toString();
	}
}