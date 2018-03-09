package progs;

public class Meet {

	public static void main(String[] args) {
		int a[] = new int[]{2,3,44,5,6};
		System.out.println(maxProfit(a));
	}
	
	public static int maxProfit(int a[])
	{
		/*int diff = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					int temp = a[j]-a[i];
					
					diff = diff > temp ? diff : temp ;
				}
			}
		}      O(n square)    */
		
		
		
		// O(n)
		int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < minprice)
                minprice = a[i];
            else if (a[i] - minprice > maxprofit)
                maxprofit = a[i] - minprice;
        }
		
		/*System.out.println(" MiN : "+min+" "+i1);
		System.out.println(" MAX : "+max+" "+i2);*/
		
		return maxprofit;
	}
}