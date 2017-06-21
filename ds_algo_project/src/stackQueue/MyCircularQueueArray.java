package stackQueue;

import java.util.Arrays;

public class MyCircularQueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// size 5 circular queue - so no expansion in queue size
		MyCircularQueueArray mq = new MyCircularQueueArray();
		mq.addNode(6);
		mq.addNode(3);
		mq.addNode(1);
		mq.removeNode();
		mq.addNode(2);
		mq.addNode(7);
		mq.removeNode();
		mq.removeNode();
		mq.addNode(8);
		mq.addNode(2);
		mq.addNode(1);
		mq.removeNode();
		mq.addNode(9);
		mq.removeNode();
		mq.removeNode();
		mq.addNode(4);
		mq.addNode(5);
		mq.removeNode();
		System.out.println(mq);
	}

	int firstData ;
	int lastData ;
	int array[] = new int[5];
	int lastPointer = 0;
	int firstPointer = 0;
	
	public void addNode(int data)
	{
		int b = 0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				b++;
			}
		}
		if(b<array.length)
		{
			array[lastPointer]=data;
			if(firstData==0)
			{
				firstData=array[lastPointer];
				firstPointer = lastPointer;
			}
			lastData=array[lastPointer];
			
			if(lastPointer+1==array.length)
			{
				lastPointer=0;
			}
			else
			{
				lastPointer++;
			}
		}
		else
		{
			System.out.println("FULL");
		}
	}
	public void removeNode()
	{
		array[firstPointer]=0;
		if(firstPointer+1==array.length)
		{
			firstData=array[0];
			firstPointer=0;
		}
		else
		{
			firstData=array[firstPointer+1];
			firstPointer++;
		}
	}
	public boolean isEmpty()
	{
		return firstData==0;
	}
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(Arrays.toString(array));
		return sb.toString();
	}
}
