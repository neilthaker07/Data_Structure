package stackQueue;

import java.util.EmptyStackException;

public class MyStack<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack<Integer> ms = new MyStack<Integer>();
		ms.push(1);
		ms.push(2);
		ms.push(3);
		ms.push(4);
		ms.pop();
		
		System.out.println(ms.peek());
	}

	private static class StackNode<T>
	{
		private StackNode<T> next;
		private T data;
		
		public StackNode(T data)
		{
			this.data=data;
		}
	}
	private StackNode<T> top;
	
	public void push(T item)
	{
		StackNode<T> t = new StackNode<T>(item);
		t.next = top;
		top=t;
	}
	
	public T pop()
	{
		if(top == null)
		{
			throw new EmptyStackException();
		}
		T item = top.data;
		top=top.next;
		return item;
	}

	public T peek()
	{
		if(top == null)
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