package stackQueue;

import java.util.ArrayList;

public class Node {

	private int value;
	private Node above;
	private Node below;
	
	public Node getAbove() {
		return above;
	}

	public void setAbove(Node above) {
		this.above = above;
	}

	public Node getBelow() {
		return below;
	}

	public void setBelow(Node below) {
		this.below = below;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public String toString()
	{
		StringBuilder a = new StringBuilder();
		a.append(value+" ");
		return a.toString();
	}
}

/*
ArrayList<Stack> stackList = new ArrayList<Stack>();
int capacity;

public StackOfPlates(int capacity)
{
	this.capacity = capacity;
}

public Stack getLastStack()
{
	if(stackList.size()==0)
	{
		return null;
	}
	return stackList.get(stackList.size()-1);
}

public void push(int value)
{
	if(capacity>=s1.size())
	{
		super.push(value);
	}
	else
	{
		Stack st = new Stack(3);
		st.push(value);
		a.add(st);
	}
}

public int pop()
{
	
}
public int popAt()
{
	
}





}

class Stack
{
private int capacity;
public Node top, bottom;
public int size = 0;

public Stack(int capacity)
{
	this.capacity = capacity;
}
public boolean isFull() 
{
	return size == capacity;
}
public boolean isEmpty()
{
	return size==0;
}

public boolean push(int value)
{
	if(capacity < size) 
		return false;
	size++;
	Node n = new Node();
	n.setValue(value);
	if(size==1)
	{
		bottom=n;
	}
	
	
	
	
	top=n;
	return true;
}

public int pop()
{
	Node t = top;
	top=top.below;
	size--;
	return t.value;
}
}*/