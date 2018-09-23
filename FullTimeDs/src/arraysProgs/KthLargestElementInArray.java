package arraysProgs;

import java.util.PriorityQueue;

public class KthLargestElementInArray {

	public static int find(int [] A, int k)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int i=0;i<A.length;i++)
		{
			pq.offer(A[i]);
		}
		int n = -1;
		int y=A.length-k;
		
		while(y>=0)
		{
			n = pq.poll();
			y--;
		}
		return n;
	}
	
	public static void main(String[] args) 
	{
		int[] A = { 1, 2, 10, 20, 40, 32, 44, 51, 6 };
		int k = 5;
		System.out.println("smallest element:" + find(A,k));
	}
	
	

}
