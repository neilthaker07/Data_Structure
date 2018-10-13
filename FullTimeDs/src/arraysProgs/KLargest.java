package arraysProgs;

import java.util.PriorityQueue;


public class KLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int[]{9,6,1,4,2,5,3};
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for(int q : a)
		{
			pq.offer(q);
			if(pq.size()>3)
				pq.poll();
		}
		System.out.println(pq); // K largest 
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
		for(int q : a)
		{
			pq2.offer(q);
		}
		System.out.println(pq2.poll()+" "+pq2.poll()+" "+pq2.poll()); // K smallest
	}
}
