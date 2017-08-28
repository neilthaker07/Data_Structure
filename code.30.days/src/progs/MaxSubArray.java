package progs;

public class MaxSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
		
		int sum = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			int t = a[i];
			if(t > sum)
			{
				sum = t;
			}
			for(int j=i+1;j<a.length;j++)
			{
				t += a[j];
				if(t > sum)
				{
					sum = t;
				}
			}
		}
		System.out.println(sum);
		
		
	}

}
