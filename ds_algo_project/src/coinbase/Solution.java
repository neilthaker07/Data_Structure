package coinbase;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long delta = sc.nextLong();
        
        long all[] = new long[(int) n1];
        for(long t = 0; t < n1; t++) {
        	all[(int)t] = sc.nextLong();
        }
        
        int ans = 0;
        
        for(long i=0;i<all.length;i++)
		{
			for(long j=i+1;j<all.length;j++)
			{
				if(j<all.length && Math.abs(all[(int) j]-all[(int) i])==delta)
				{
					ans++;
				}
			}
		}
        
        System.out.println(ans);*/

		Queue q = new LinkedList();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		q.add(q.poll());
		System.out.println(q);
	}
	
}
