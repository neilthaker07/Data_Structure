package stackQueue;

import java.util.Arrays;

public class MyQueueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueueArray mq = new MyQueueArray();
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
	int originalQueueSize=5;
	int array[] = new int[originalQueueSize];
	int lastPointer = 0;
	int firstPointer = 0;

	public void addNode(int data)
	{
		if(lastPointer+1 > array.length)
		{
			int l[] = array;
			array = new int[(originalQueueSize*3/2)+1];
			originalQueueSize = (originalQueueSize*3/2)+1;
			for(int i=0;i<l.length;i++)
			{
				array[i] = l[i];
			}
		}
		
		array[lastPointer]=data;
		if(firstData==0)
		{
			firstData = data;
		}
		lastData=array[lastPointer];
		lastPointer++;
	}
	public void removeNode()
	{
		if(firstPointer==0 || firstPointer!=lastPointer)
		{
			array[firstPointer]=0;
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
