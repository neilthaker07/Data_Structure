package progs;

import java.util.HashSet;
import java.util.Set;

public class TwoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] numbers = new int[]{2, 7, 11, 15};
		int target=13;
		int t1 = 0,t2 = 0;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]>target)
			{
				break;
			}
			
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]+numbers[j] == target)
				{
					t1 = i+1;
					t2 = j+1;
					break;
				}
			}
		}
		//System.out.println(t1 + " "+t2);
		
		
		
		int start = 0, end = numbers.length - 1;
        while(start < end)
        {
        	if(numbers[start] + numbers[end] == target )
        	{
        		System.out.println((start+1)+" "+(end+1));
        		break;
        	}
        	
        	if(numbers[start]+numbers[end] < target )
        	{
        		start++;
        	}
        	else 
        	{
        		end--;
        	}
        }
	}

	
	public boolean containsDuplicate(int[] nums) {

		Set<Integer> set = new HashSet();

		for(int i=0;i<nums.length;i++)
		{
			if(set.contains(nums[i]))
			{
				return true;
			}
			set.add(nums[i]);
		}
		
		return false;
	}
	
	
	public int missinNumber()
	{
		int nums[] = new int[]{3,0,1};
		int sumPos= 0 ;
		int numSum = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			sumPos = sumPos + (i+1);
			numSum += nums[i];
		}
		
		
		return sumPos - numSum;
	}
	
}
