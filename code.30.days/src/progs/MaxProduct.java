package progs;

import java.util.Arrays;

public class MaxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int[] nums = new int[]{-4,-3,-2,-1,60};
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		int n = nums.length;
		System.out.println(nums[n-1]*nums[n-2]*nums[n-3]);
		*/
		//minCostClimbingStairs();
		//searchInsert();
		plusOne();
	}
	
	public static void minCostClimbingStairs() {
		//int[] cost = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		int[] cost = new int[]{0,0,0,1};
		
		/*int i=0;
		int minCost = 0;
		while(i<cost.length)
		{
			minCost += cost[i];
			if(i+2 >= cost.length || cost[i+1]>=cost[i+2])
			{
				i++;
			}
			i++;
		}
		System.out.println(minCost);*/
		
		
		int [] mc = new int[cost.length + 1];
        mc[0] = cost[0];
        mc[1] = cost[1];
        
        for(int i = 2; i <= cost.length; i++){
            int costV = (i==cost.length)?0:cost[i];
            mc[i] = Math.min(mc[i-1] + costV, mc[i-2] + costV);
        }
        System.out.println(mc[cost.length]);
        
        //return Math.min(f1, f2);
    }
	
	
	public static int searchInsert() {
		
		int[] nums = new int[]{1,3,5,6};
		int target = 2;
		int l = nums.length;
		int start = 0;
		int end = l-1;
		
		while(start <= end)
		{
			int mid = (start + end) / 2;
			if(target == nums[mid])
			{
				System.out.println(mid);
				break;
			}
			
			if(target > nums[mid])
			{
				start = mid+1;
			}
			else 
			{
				end = mid-1;
			}
		}
		System.out.println(start);
		
		return 0;
	}
	
	
	public static int[] plusOne()
	{
		int digits[] = new int[]{9,9,9};
		int carry =0;
		
		int f2[] = new int[digits.length + 1];
		
		for(int i = digits.length-1;i>=0;i--)
		{
			if( i==digits.length-1)
			{
				digits[i]++;
			}
			digits[i] += carry;
			carry = 0;
			
			if(digits[i]>9)
			{
				carry = digits[i]/10;
				digits[i] = digits[i]%10;
			}
			f2[i+1] = digits[i];
		}
		
		if(carry != 0)
		{
			f2[0] = carry;
		}
		
		for(int i=0;i<=digits.length;i++)
		{
			System.out.println(f2[i]);
		}
		return digits;
	}
}
