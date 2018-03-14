package progs;

import java.util.ArrayList;

public class NumsDisappered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums[]= new int[]{4,3,2,7,8,1,2,3};
		ArrayList<Integer> op = new ArrayList<Integer>(); 
		
		for(int i=0;i<nums.length;i++)
		{
			int pos = nums[i]>0 ? nums[i]-1 : (nums[i]*-1)-1;
			if(nums[pos] > 0)
			{
				nums[pos] *= -1;
			}
		}
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i] > 0)
			{
				op.add(i+1);
			}
		}
		
		System.out.println(op.get(0));
		
	}

}
