package sortingSearching;

import java.util.Arrays;

public class CountingSort {

	int array[] = new int[]{5,2,1,8,9,4};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountingSort c = new CountingSort();
		c.process();
	}

	public void process()
	{
		// Range of nos. should be known.
		// O(n)
		int array2[] = new int[10];
		for(int i=0;i<array.length;i++)
		{
			array2[array[i]]+=1;
		}
		
		for(int i=0;i<array2.length;i++)
		{
			if(i-1>=0)
			{
				array2[i] = array2[i] + array2[i-1]; 
			}
		}
		
		int array3[] = new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			array3[array2[array[i]]-1] = array[i];
		}
		
		System.out.println(Arrays.toString(array3));
	}
}
