package stackQueue;

import java.util.NoSuchElementException;

public class CircularQueue<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue<Integer> mq = new CircularQueue<Integer>();
		mq.addNode(1);
		mq.addNode(2);
		mq.addNode(3);
		mq.removeNode();
		mq.removeNode();
		//mq.removeNode();
		
		if(mq.first!=null && mq.last!=null)
		{
			System.out.println(mq.first.data);
			System.out.println(mq.last.data);
		}
	}
	
	private class Node<T>
	{
		private T data;
		private Node<T> next;
		public Node(T data)
		{
			this.data=data;
		}
	}
	Node<T> first;
	Node<T> last;
	
	public void addNode(T item)
	{
		Node<T> n = new Node<T>(item);
		if(first==null)
		{
			first=n;
			last=n;
		}
		else
		{
			last.next=n;
			last=n;
		}
		last.next=first;
	}
	
	public T removeNode()
	{
		if(first==null)
			throw new NoSuchElementException();
		T f = null;
		if(first!=last)
		{
			f=first.data;
			first=first.next;
			last.next=first;
		}
		else
		{
			first=null;
			last=null;
			System.out.println("whole queue empty");
		}
		return f;
	}
	
	public boolean isNull()
	{
		return first==null;
	}
}
