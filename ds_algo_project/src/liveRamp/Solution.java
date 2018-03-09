package liveRamp;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[]{1,3,2};
		int prefixPerm = 0;
		int indexes = 0;
		int values= 0;
		for(int p=0;p<a.length;p++)
		{
			values += a[p];
			indexes+=p+1;
			
			if(values==indexes)
			{
				prefixPerm++;
			}
		}
		
		System.out.println(prefixPerm);
	}
}