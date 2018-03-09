package firstSample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Flower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, HashSet<Integer>> map = new HashMap<Integer, HashSet<Integer>>();
		int len = 9;
		
		int a[][] = new int[4][2];
		a[0] = new int[]{1,10};
		a[1] = new int[]{1,6};
		a[2] = new int[]{2,8};
		a[3] = new int[]{3,5};
		
		for(int i=0;i<len;i++)
		{
			map.put(i, new HashSet<Integer>());
		}
		
		for(int i=0;i<len;i++)
		{
			
			for(int j=0;j<4;j++)
			{
				if(a[j][0] > i && a[j][1]<len)
				{
					HashSet<Integer> y = map.get(i);
					y.add(j);
					map.put(i, y);
				}
			}
			
			
			
		}
		
		
		
		

	}

}
