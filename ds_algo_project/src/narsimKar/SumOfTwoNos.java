package narsimKar;

import java.util.Hashtable;

public class SumOfTwoNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[]{2,4,3,5,6,7};
		int sum = 8;
		
		Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(h.get(sum-a[i])==null)
			{
				h.put(a[i], a[i]);
			}
			else
			{
				System.out.println(sum-a[i] + " :: "+ a[i]);
			}
		}
	}
}
