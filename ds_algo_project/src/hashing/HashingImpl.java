package hashing;

import java.util.Hashtable;

public class HashingImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static final int LOAD_FACTOR = 20;
	public MyHashTable createHashTable(int size)
	{
		MyHashTable h = null;
		h.size = size / LOAD_FACTOR;
		h.count = 0;
		h.table = new MyHashTableNode(h.size);
		
		if(h.table.size<0)
		{
			return null;
		}
		for(int i=0;i<h.table.size;i++)
		{
			h.table.next = null;
			h.table.count = 0;
		}
		
		return h;
	}
	
	
	// COMPELTE THIS FROM JAVA BOOK.
	public void insert(MyHashTable h, int data)
	{
		int index=0;
	}
	
}

class MyHashNode
{
	MyHashNode key;
	int value;
	MyHashNode next;
}
class MyHashTable
{
	int size;
	int count;
	MyHashTableNode table;
}
class MyHashTableNode
{
	public MyHashTableNode(int size)
	{
		this.size = size;
	}
	int size;
	int count;
	MyHashNode next;
}
