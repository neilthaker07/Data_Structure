package arraysProgs;

public class StockGreedy {

	public static void main(String[] args) {
		System.out.println(getMaxProfit(new int[]{1,2,5,10,4,8,6}));
		System.out.println(getMaxProfit(new int[]{4,3,2,1}));
		System.out.println(getMaxProfit(new int[]{1,2,3,4}));
		System.out.println(getMaxProfit(new int[]{1,2,5,10,4,8,9,1,10}));
	}
	
	static int getMaxProfit(int a[])
	{
		int i=0;
		int profit = 0;
		while(i<a.length)
		{
			int max = a[i];
			int maxIndex = i;
			
			int j=i+1;
			while(j<a.length)
			{
				if(max<a[j])
				{
					max = a[j];
					maxIndex = j;
				}
				j++;
			}
			
			int sum = 0;
			int k = i;
			while(k<maxIndex)
			{
				sum += a[k];
				k++;
			}
			
			if(maxIndex-i > 0)
			{
				profit += a[maxIndex]*(maxIndex-i) - sum;
			}
			i = k+1;
		}
		return profit;
	}

}
