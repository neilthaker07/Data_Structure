package stackQueue;

import java.util.Arrays;
import java.util.EmptyStackException;

public class OneArrayThreeStacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OneArrayThreeStacks ms1 = new OneArrayThreeStacks();
		ms1.push(1, 0);
		ms1.push(22, 1);
		ms1.push(13, 1);
		ms1.push(333, 2);
		ms1.push(13, 1);
		ms1.push(90, 2);
		ms1.push(23, 0);
		ms1.push(25, 1);
		ms1.push(26, 1);
		ms1.push(27, 1);
		ms1.push(28, 1);
		ms1.push(53, 1);
		System.out.println(ms1.peek(0));
		System.out.println(ms1.peek(1));
		System.out.println(ms1.peek(2));
		ms1.pop(0);
		ms1.pop(0);
		ms1.push(88, 0);
		System.out.println(ms1);
	}

	int topOfArray[]=new int[3];
	int currentStackSize = 9; 
	int array[] = new int[currentStackSize];
	int counter[]= new int[]{0,currentStackSize/3,currentStackSize*2/3};
	int counterForNewArray[] = new int[]{0,currentStackSize/3,currentStackSize*2/3};
	int previousCounter[]= new int[]{0,currentStackSize/3,currentStackSize*2/3};
	int latestCounter[]= new int[]{0,currentStackSize/3,currentStackSize*2/3};
	
	public void push(int data, int stackNo)
	{
		boolean newCreated = false;
		if( (stackNo==0 && counter[stackNo]+1 > array.length/3)
			|| (stackNo==1 && counter[stackNo]+1 > array.length*2/3)
					|| (stackNo==2 && counter[stackNo]+1 > array.length) )
		{
			int l[] = array;
			int tempArray[]=new int[3];
			tempArray = counterForNewArray;
			array = new int[currentStackSize+9];
			
			currentStackSize = currentStackSize+9;
			previousCounter = counter;
			counter = new int[]{0,currentStackSize/3,currentStackSize*2/3};
			counterForNewArray = new int[]{0,currentStackSize/3,currentStackSize*2/3};
			latestCounter = counter;

			int j = counterForNewArray[0];
			int k=1;
			for(int i=0;i<l.length;i++)
			{
				if(k<3 && i==tempArray[k])
				{
					j=counterForNewArray[k];
					latestCounter[k]=j;
					k++;
				}
				array[j] = l[i];
				j++;
			}
			newCreated = true;
		}
		if(newCreated)
		{
			counter[0] = previousCounter[0];
			counter[1] = previousCounter[1]+3;
			counter[2] = previousCounter[2]+3*2;
			
			array[counter[stackNo]]=data;
			//counter[stackNo] = previousCounter[stackNo];
			topOfArray[stackNo]=data;
			counter[stackNo]++;
		}
		else
		{
			array[counter[stackNo]]=data;
			topOfArray[stackNo]=data;
			counter[stackNo]++;
		}
	}
	public void pop(int stackNo)
	{
		if(topOfArray[stackNo]==0)
		{
			throw new EmptyStackException();
		}
		counter[stackNo]--;
		array[counter[stackNo]]=0;
		if(counter[stackNo] > 0)
		{
			topOfArray[stackNo]=array[counter[stackNo]-1];
		}
		else
		{
			topOfArray[stackNo]=0;
		}
	}
	
	public int peek(int stackNo)
	{
		if(topOfArray[stackNo]==0 || topOfArray[stackNo]<0)
		{
			throw new EmptyStackException();
		}
		return topOfArray[stackNo];
	}
	public boolean isNull(int stackNo)
	{
		return topOfArray[stackNo]==0;
	}
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(Arrays.toString(array));
		return sb.toString();
	}
}
