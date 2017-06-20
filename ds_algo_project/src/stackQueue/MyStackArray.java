package stackQueue;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStackArray<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStack<Integer> ms = new MyStack<Integer>();
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		ms.pop();
		ms.pop();
		System.out.println(ms.peek());
	}

	private class Node<T>
	{
		private T data;
		public Node(T data)
		{
			this.data=data;
		}
	}
	private Node<T> top;
	ArrayList<T> a = new ArrayList<T>();
	
	public void push(T item)
	{
		Node<T> i = new Node<T>(item);
		a.add(i.data);
		top=i;
	}
	public T pop()
	{
		if(top==null)
		{
			throw new EmptyStackException();
		}
		T t= a.get(a.size()-1);
		a.remove(a.size()-1);
		return t;
	}
	public T peek()
	{
		if(top==null)
		{
			throw new EmptyStackException();
		}
		return top.data;
	}
	public boolean isNull()
	{
		return top==null;
	}
}
