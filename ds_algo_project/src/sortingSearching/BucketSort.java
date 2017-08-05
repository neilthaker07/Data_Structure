package sortingSearching;

import java.util.Arrays;
import java.util.Hashtable;

public class BucketSort {
	
	int array[] = new int[]{5,2,1,8,9,4};
	public static void main(String[] args) {
		BucketSort c = new BucketSort();
		c.process();
	}
	
	public void process()
	{
		// nos. should be distributed and no. of bucket should be known. 
		// O(n)
		
		Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
		for(int i=0;i<10;i++) // 10 buckets
		{
			h.put(i,0);
		}
		
		for(int i=0;i<array.length;i++)
		{
			h.put(array[i],array[i]);
		}
		
		int op[] = new int[array.length];
		int c=0;
		for(int i=0;i<10;i++)
		{
			int t = h.get(i);
			if(t>0)
			{
				op[c]=t;
				c++;
			}
		}
		System.out.println(Arrays.toString(op));
		
	}

}
