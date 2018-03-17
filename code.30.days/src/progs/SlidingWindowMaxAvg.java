package progs;

public class SlidingWindowMaxAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public double v(int nums[], int k)
	{
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

}
