package arraysProgs;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow {

	public static void main(String[] args) {
		
		int a[] = new int[]{1,4,2,10,23,3,1,0,20};
		int k = 9;
		
		// brute force - O(n*k)
		int max = Integer.MIN_VALUE;
		int n = a.length;
		for(int i =0;i<n-k+1;i++)
		{
			int sum=0;
			
			for(int j=i;j<i+k;j++)
			{
				sum += a[j];
			}
			
			max = max>sum ? max : sum;
		}
		System.out.println(max);
		
		// O(n) - sliding window
		int max2 = Integer.MIN_VALUE;
		int sumT = 0;
		
		for(int i=0;i<n;i++)
		{
			sumT += a[i];
			if(i>=k-1)
			{
				max2 = max2 > sumT ? max2 : sumT;
				sumT = sumT - a[i+1-k];
			}
		}
		System.out.println(max2);
	}
}
