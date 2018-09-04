package arraysProgs;

public class MaxAvgSubarray {

	public static void main(String[] args) {
		
		int a[] = new int[]{1,12,-5,-6,50,60};
		int k = 4;
		int n=a.length;
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n-k+1;i++)
		{
			int sum = 0;
			for(int j=i;j<i+k;j++)
			{
				sum += a[j];
			}
			max = max > sum ? max : sum;
		}
		
		System.out.println((double)max/k);
		
		int sum = 0;
		int max2 = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(i+1<k)
			{
				sum+=a[i];
			}
			else 
			{
				sum += a[i];
				if(i-k >=0 )
				{
					sum = sum - a[i-k];
				}
				
				max2 = max2 > sum ? max2 : sum;
			}
		}
		System.out.println((double)max2/k);
	}

}
