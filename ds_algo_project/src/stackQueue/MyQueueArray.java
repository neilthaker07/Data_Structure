package stackQueue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueueArray<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueueArray<Integer> mq = new MyQueueArray<Integer>();
		mq.addNode(1);
		mq.addNode(2);
		mq.removeNode();
		mq.addNode(3);
		mq.addNode(4);
		
		System.out.println(mq.first.data);
		System.out.println(mq.last.data);
	}

	private class Node<T>
	{
		private T data;
		public Node(T data) {
			// TODO Auto-generated constructor stub
			this.data=data;
		}
	}
	
	Node<T> first ;
	Node<T> last ;
	ArrayList<Node<T>> a = new ArrayList<Node<T>>();
	
	public void addNode(T item)
	{
		Node<T> t = new Node<T>(item);
		a.add(t);
		if(first==null)
		{
			first=t;
		}
		if(last==null)
		{
			last=first;
		}
		else
		{
			last=t;
		}
	}
	public T removeNode()
	{
		if(first==null)
		{
			throw new NoSuchElementException();
		}
		T t = a.get(0).data;
		a.remove(0);
		first=a.get(0);
		return t;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
}
