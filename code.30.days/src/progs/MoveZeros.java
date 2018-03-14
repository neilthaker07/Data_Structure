package progs;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[]{0,1,0,3,12};
		
		int zeroPointer = 0;
		int zeroCounter = 0;
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]!=0)
			{
				if(zeroCounter > 0)
				{
					nums[zeroPointer] = nums[i];
					nums[i] = 0;
				}
				zeroPointer++;
			}
			else
			{
				zeroCounter++;
			}
		}
	}

}
