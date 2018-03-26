package progs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashingProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//numJewelsInStones("aA", "aAAbbbb");
		//System.out.println(climbStairs(5));
		//System.out.println(uniqueNumPosition(new int[]{5,7,7,3,3,9,5}));
		//System.out.println(findPairs(new int[]{1,2,3,4,1,4,6,6}, 2));
		
		System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
		
	}

	public static int findPairs(int[] nums, int k) {
    
		int l = nums.length;
		
		Map<Integer,Integer> map = new HashMap();
		for(int i=0;i<l;i++)
		{
			if(map.containsKey(nums[i]))
			{
				int count = map.get(nums[i]);
				count++;
				map.put(nums[i], count); 
			}
			else
			{
				map.put(nums[i], 1);
			}
		}
		
		int op = 0;
		for(int i=0;i<l;i++)
		{
			if(k==0)
			{
				int y = nums[i];
				if(map.containsKey(y) && map.get(y) > 1)
				{
					map.put(y,0);
					op++;
				}
			}
			else if(k>0)
			{
				int y = nums[i]+k;
				if(map.containsKey(y) && map.get(y) > 0)
				{
					map.put(y,0);
					op++;
				}
			}
			else
			{
				return 0;
			}
		}
		
		return op;
    }
	
	public static int rob2(int[] a1)
	{
		int a=0;
		int b=0;
		
		for (int i=0; i<a1.length; i++)
	    {
	        if (i%2==0)
	        {
	            a = Math.max(a+a1[i], b);
	        }
	        else
	        {
	            b = Math.max(a, b+a1[i]);
	        }
	    }
		    
		return Math.max(a, b);
	}
	
	
	public static int numJewelsInStones(String J, String S) {
    
		Set<Character> jewel = new HashSet();
		for(char c : J.toCharArray())
		{
			jewel.add(c);
		}
		
		int ans = 0;
		for(char c:S.toCharArray())
		{
			if(jewel.contains(c))
			{
				ans++;
			}
		}
		return ans;
    }
	
	
	public static int uniqueNumPosition(int a[])
	{
		if(a.length==1)
		{
			return 0;
		}
		
		if(a.length==2 && a[0]!= a[1])
		{
			return 0;
		}
		
		Map<Integer, ArrayList<Integer>> map = new HashMap();
		for(int i=0;i<a.length;i++)
		{
			ArrayList temp = map.containsKey(a[i]) ? map.get(a[i]) : new ArrayList();
			if(temp.size() > 0)
			{
				int count = (int)temp.get(1);
				temp.remove(1);
				count++;
				temp.add(1, count);
				map.put(a[i], temp);
			}
			else
			{
				temp.add(0, i);
				temp.add(1, 1);
				map.put(a[i], temp);
			}
		}
		
		int op1 = 0;
		for(int j=0;j<a.length;j++)
		{
			if(map.get(a[j]).get(1) == 1)
			{
				op1 = j;
				break;
			}
		}
		return op1;
	}
	
	public static int climbStairs(int n) {
		
		/*
		 * Time limit exceeds
		 * 
		 * if(n==0)
		{
			return 0;
		}
		if(n==1)
		{
			return 1;
		}
		if(n==2)
		{
			return 2;
		}
		
		return climbStairs(n-1)+ climbStairs(n-2);*/
		
		if (n == 1) {
			return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
	
	public static int findUnsortedSubarray(int[] nums) {
		
		
		int len=nums.length;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        int start=-1, end=-1;
        
        for(int i=0; i<len; i++){
            max = Math.max(max, nums[i]); //from left to right, search the current max
            min = Math.min(min, nums[len-i-1]);  //from right to left, search the current min 
            
            if(nums[i] < max)  
                end = i;
            if(nums[len-i-1] > min)
                start = len-i-1;
        }
        
        if(start==-1) //the entire array is already sorted
            return 0;
        
        return end-start+1;
		
		/*
		int l = nums.length;
		
		int sl = 0;
		int cl = 0;
		int temp = 0;
		boolean flag = false;
		
		for(int i=0;i<l;i++)
		{
			
			if(i+1 < l && nums[i+1] < nums[i])
			{
				sl+=2;
				temp = nums[i];
				cl+=2;
				flag = true;
			}
			else if(i+1 < l && nums[i+1] < temp)
			{

				sl++;
				temp = nums[i];
				cl++;
				flag = true;
			
			}
			else
			{
				
				flag = false;
			}
			
		}
		
		return 0;*/
	}
	
	
	public static char nextGreatestLetter(char[] letters, char target) {
        
		int l =letters.length;
		
		if(l==0)
		{
			return '\0';
		}
		
		int asciiLast = letters[l-1];
		if((int)target > (int)asciiLast)
		{
			return letters[0];
		}
		
		int start = 0;
		int end = l;
		while(start<end)
		{
			int mid = start + (end-start) / 2; 
			
			if(target >= letters[mid])
			{
				start = mid + 1;
			}
			else
			{
				end = mid;
			}
		}
		return letters[start % l];
    }
	
}
