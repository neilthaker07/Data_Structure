package progs;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= new int[]{1,1,0,1,1,1};

		int count = 0;
		int max = 0;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==1)
			{
				count++;
			}
			else
			{
				count = 0;
			}
			
			max = max < count ? count : max;
		}
		
		System.out.println(max);
	}

}
