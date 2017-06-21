package arraysStrings;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyArrayList {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		MyArrayList ma = new MyArrayList();
		ma.add(6);
		ma.add(2);
		ma.add(4);
		ma.add(3);
		/*ma.add(1);
		ma.add(1);
		ma.add(1);
		ma.add(1);
		ma.add(2);
		ma.add(3);
		ma.add(4);*/
		ma.add(5);
		ma.add(25,25);
		ma.add(25);
		ma.add(2,6);
		ma.add(6);
		System.out.println(ma.getElement(5));
		System.out.println(ma.getElementByIndex(1));
		ma.removeByIndex(0);
		ma.removeElement(25);
		System.out.println(ma);
	}
	
	int currentArraySize = 4; 
	int array[] = new int[currentArraySize];
	int counter = 0;
	public void add(int data)
	{
		if(counter+1 > array.length)
		{
			int l[] = array;
			array = new int[(currentArraySize*3/2)+1];
			currentArraySize = (currentArraySize*3/2)+1;
			for(int i=0;i<l.length;i++)
			{
				array[i] = l[i];
			}
		}
		array[counter]=data;
		counter++;
	}

	public void add(int data, int index)
	{
		if(index > currentArraySize)
		{
			int l[] = array;
			array = new int[index+1];
			currentArraySize = index+1;
			for(int i=0;i<l.length;i++)
			{
				array[i] = l[i];
			}
		}
		array[index]=data;
	}
	
	public void removeByIndex(int index)
	{
		if(index>currentArraySize)
		{
			throw new NoSuchElementException();
		}
		array[index]=0;
	}
	
	public void removeElement(int data)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==data)
			{
				array[i]=0;
			}
		}
	}
	
	public int getElement(int data) throws Exception
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==data)
			{
				return i;
			}
		}
		throw new Exception();
	}
	
	public int getElementByIndex(int index) throws Exception
	{
		if(index>currentArraySize)
		{
			throw new Exception();
		}
		return array[index];
	}
	
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		s.append(Arrays.toString(array));
		return s.toString();
	}
}
