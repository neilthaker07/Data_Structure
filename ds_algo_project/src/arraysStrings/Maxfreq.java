package arraysStrings;

import java.util.HashMap;
import java.util.Map;

public class Maxfreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[]{1,2,2,3,1};
		int freq = 0;
		int n=a.length;
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++)
		{
			map.put(a[i], map.containsKey(a[i]) ? map.get(a[i])+1 : 1);
		}
		
		int pos[]=new int[]{};
		for(int i=0;i<n;i++)
		{
			if(freq <= map.get(a[i]))
			{
				pos[0] = i;
				freq = map.get(a[i]);
			}
		}
		
		System.out.println(freq);
		/*
		//System.out.println(i);
		for(int k = 0;k<n;k++)
		{
			System.out.print(a[k]+" ");
		}*/
	}

}
