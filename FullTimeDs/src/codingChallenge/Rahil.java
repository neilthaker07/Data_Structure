package codingChallenge;

import java.util.HashMap;
import java.util.Map;

public class Rahil {

	public static void main(String[] args) {

		//int a[] = psycoTest(5, new int[]{1,3,5,6,8}, 1, new int[]{2}, 1, new int[]{6});
		//System.out.println(a[0]);
		
		System.out.println(targetSum(8, new int[]{1,2,3,6,7,8,9,1}, 10));
	}
	
	
	static int targetSum(int n, int a[], int target)
	{
		if(a==null || a.length == 0 || n==0)
		{
			return 0;
		}
		Map<Integer, Boolean> map = new HashMap();
		int ans = 0;
		for(int i=0;i<a.length;i++)
		{
			if(map.containsKey(target-a[i]) && map.get(target-a[i]))
			{
				ans++;
				map.put(a[i], false);
				map.put(target-a[i], false);
			}
			else if(!map.containsKey(a[i]))
			{
				map.put(a[i], true);
			}
		}
		return ans;
	}
	
	static int[] psycoTest(int n, int scores[], int q, int ll[], int q2, int ul[])
	{
		if(n==0 || scores==null || scores.length ==0 || q==0 || ll==null || ul==null || ll.length==0 || ul.length==0)
		{
			return null;
		}
		int output[] = new int[q];
		for(int i=0;i<q;i++)
		{
			int lower = ll[i];
			int higher = ul[i];
			
			if(lower>higher)
			{
				output[i]=0;
			}
			else
			{
				int count=0;
				for(int t=0;t<scores.length;t++)
				{
					if(scores[t]>=lower && scores[t]<=higher)
					{
						count++;
					}
				}
				output[i] = count;
			}
		}
		return output;
	}

}
