package narsimKar;

import java.util.Arrays;

public class SortGreaterLess38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[]{1,2,3,4,5};
		
		for(int i=1;i<a.length;i+=2)
		{
			if(a[i] < a[i-1])
			{
				int t=a[i];
				a[i]=a[i-1];
				a[i-1]=t;
			}
		}
		for(int i=1;i<a.length;i+=2)
		{
			if(a[i] < a[i+1])
			{
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		
		System.out.println(Arrays.toString(a)); // 1<3>2<5>4  in O(n)
		// O(nlogn) : Sort first then swap the adjacent elements.
	}

}
