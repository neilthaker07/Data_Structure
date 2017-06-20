package stackQueue;

import java.util.NoSuchElementException;

public class MyQueue<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue<Integer> mq = new MyQueue<Integer>();
		mq.add(1);
		mq.add(2);
		mq.add(3);
		mq.remove();
		
		System.out.println(mq.first.data);
		System.out.println(mq.last.data);
	}

	private class QueueNode<T>
	{
		private T data;
		private QueueNode<T> next;
		public QueueNode(T data) {
			// TODO Auto-generated constructor stub
			this.data=data;
		}
	}

	private QueueNode<T> first;
	private QueueNode<T> last;
	
	public void add(T item)
	{
		QueueNode<T> t = new QueueNode<T>(item);
		if(last==null)
		{
			last=t;
			last.next=null;
		}
		else
		{
			last.next=t;
			last=t;
		}
		if(first==null)
		{
			first=last;
		}
	}
	
	public T remove()
	{
		if(first==null)
		{
			throw new NoSuchElementException();
		}
		T data = first.data;
		first=first.next;
		return data;
	}
	
	public boolean isNull()
	{
		return first==null; 
	}
}
