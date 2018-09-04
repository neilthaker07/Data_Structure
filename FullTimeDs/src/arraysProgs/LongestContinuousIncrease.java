package arraysProgs;

public class LongestContinuousIncrease {

	public static void main(String[] args) {
		
		//int a[] = new int[]{5,4,2,1,8,9,11,1,5,4,9,10,11,15,19,20,21,8,1,0};
		int a[] = new int[]{4,3,2,1};
		
		int max = 1;
		int t = a.length > 0 ? 1 : 0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[i-1])
			{
				t++;
				max = t>max ? t : max;
			}
			else
			{
				t=1;
			}
		}
		
		System.out.println(max);
	}

}
