package progs;

import java.util.Arrays;

public class ArrayPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[]{1,5,2,9};
		
		int n = a.length / 2;
		
		Arrays.sort(a);
		int sum = 0;
		int counter= 0 ;
		for(int i=0;i<n;i++)
		{
			sum += a[counter];
			counter+=2;
		}
		
		System.out.println(sum);
		
	}

}
