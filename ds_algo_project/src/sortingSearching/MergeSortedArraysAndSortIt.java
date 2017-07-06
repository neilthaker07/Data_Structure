package sortingSearching;

import java.util.Arrays;

public class MergeSortedArraysAndSortIt {
	
	public static void main(String[] args) {
		
		int a1[] = new int[]{5,12,19};
		int a2[] = new int[]{2,9};
		
		MergeSortedArraysAndSortIt t = new MergeSortedArraysAndSortIt();
		t.mergeSortedArrays(a1, a2);
	}
	
	public int[] mergeSortedArrays(int a1[], int a2[])
	{
		int a3[] = new int[a1.length+a2.length];
		
		int k=0;
		int l=0;
		int p=0;
		if(a1.length==0)
		{
			a3=a2;
		}
		else if(a2.length==0)
		{
			a3=a1;
		}
		else
		{
			for(int i=k;i<a1.length;i++)
			{
				for(int j=l;j<a2.length;j++)
				{
					if(a1[i]>a2[j])
					{
						a3[p] = a2[j];
						p++;
						l++;
					}
					else if(a1[i]<a2[j])
					{
						a3[p] = a1[i];
						p++;
						k++;
						break;
					}
				}
				if(k==a1.length-1 && l==a2.length)
				{
					a3[a3.length-1]=a1[a1.length-1];
				}
				else if(l==a2.length-1 && k==a1.length)
				{
					a3[a3.length-1]=a2[a2.length-1];
				}
				
				if(k==a1.length && l<a2.length)
				{
					for(int u=l;u<a2.length;u++)
					{
						a3[p] = a2[u];
						p++;
					}
					break;
				}
				else if(l==a2.length && k<a1.length)
				{
					for(int u=k;u<a1.length;u++)
					{
						a3[p] = a1[u];
						p++;
					}
					break;
				}
			}
		}
		System.out.println(Arrays.toString(a3));
		return a3;
	}
}