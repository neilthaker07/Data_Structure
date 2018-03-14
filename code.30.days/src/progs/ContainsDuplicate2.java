package progs;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[]{5};

		//System.out.println(containsNearbyDuplicate(a, 1));
		System.out.println(findMaxAverage(a, 1));
	}
	
	public static double findMaxAverage(int[] nums, int k) {
	    
			int l = nums.length;
			int p1=0;
			int p2=0;
			double avg = 0;
			boolean f = false;
			double sum = 0;
			while(p2<l)
			{
				if(p2+1 < p1+k)
				{
					sum+=nums[p2];
				}
				else
				{
					sum += nums[p2];
					if(!f)
					{
						avg = sum / k;
						f = true;
					}
					else
					{
						avg = (sum/k) > avg ? (sum/k) : avg;
					}
					
					sum = sum - nums[p1];
					p1++;
					//sum = sum + nums[p2];
				}
				p2++;
			}
			
			return avg;
	    }
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
    
		int l = nums.length;
		
		Set<Integer> set = new HashSet();
		if(l<k)
		{
			for(int i=0;i<l;i++)
			{
				if(set.contains(nums[i]))
				{
					return true;
				}
				set.add(nums[i]);
			}
		}
		else
		{
			int p1=0;
			int p2=0;
			while(p2<l)
			{
				if(p2 <= p1+k)
				{
					if(set.contains(nums[p2]))
					{
						return true;
					}
					set.add(nums[p2]);
				}
				else
				{
					set.remove(nums[p1]);
					p1++;
					
					if(set.contains(nums[p2]))
					{
						return true;
					}
					set.add(nums[p2]);
				}
				p2++;
			}
		}
		
		return false;
    }

}
