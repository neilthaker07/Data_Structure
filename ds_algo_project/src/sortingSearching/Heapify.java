package sortingSearching;

import java.util.LinkedList;
import java.util.Queue;

public class Heapify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heapify a = new Heapify();
		a.createMaxHeap();
		a.heapify(a.root);
	}
	
	public void createMaxHeap()
	{
		MaxHeap a1 = new MaxHeap(31);
		MaxHeap a2 = new MaxHeap(1);
		MaxHeap a3 = new MaxHeap(21);
		MaxHeap a4 = new MaxHeap(9);
		MaxHeap a5 = new MaxHeap(10);
		MaxHeap a6 = new MaxHeap(12);
		MaxHeap a7 = new MaxHeap(18);
		MaxHeap a8 = new MaxHeap(3);
		MaxHeap a9 = new MaxHeap(2);
		MaxHeap a10 = new MaxHeap(8);
		MaxHeap a11 = new MaxHeap(7);
		
		a1.left = a2;
		a1.right= a3;
		
		a2.left = a4;
		a2.right= a5;
		a2.parent=a1;
		
		a3.left = a6;
		a3.right= a7;
		a3.parent=a1;
		
		a4.left = a8;
		a4.right= a9;
		a4.parent=a2;
		
		a5.left = a10;
		a5.right= a11;
		a5.parent=a2;
		
		a6.parent=a3;
		a7.parent=a3;
		
		a8.parent=a4;
		a9.parent=a4;
		
		a10.parent=a5;
		a11.parent=a5;
		
		root=a1;
		change = a2;
	}
	MaxHeap root ;
	MaxHeap change;
	
	public void heapify(MaxHeap root)
	{
		if(root == null)
		{
			System.out.println("No Heap available");
		}
		else
		{
			MaxHeap temp = root;
			temp = getChangeNode(temp);
			if(temp==null)
			{
				System.out.println("Given node not in Max heap.");
			}
			else
			{
				MaxHeap t2 = temp;
				while(t2.left!=null || t2.right!=null)
				{
					if(t2.right.data > t2.left.data)
					{
						int p = t2.data;
						t2.data = t2.right.data;
						t2.right.data = p;
						
						t2=t2.right;
					}
					else
					{
						int p = t2.data;
						t2.data = t2.left.data;
						t2.left.data = p;
						
						t2=t2.left;
					}
				}
				System.out.println("Heapify Done : "+ t2.data);
			}
		}
	}
	Queue<MaxHeap> q = new LinkedList<MaxHeap>();
	private MaxHeap getChangeNode(MaxHeap temp) 
	{
		q.add(temp);
		
		while(!q.isEmpty())
		{
			temp = q.remove();
			if(temp==change)
			{
				return temp;
			}
			if(temp.left!=null)
			{
				q.add(temp.left);
			}
			if(temp.right!=null)
			{
				q.add(temp.right);
			}
		}
		return null;
	}
}

class MaxHeap
{
	MaxHeap left;
	MaxHeap right;
	MaxHeap parent;
	int data;
	public MaxHeap(int data)
	{
		this.data = data;
	}
}