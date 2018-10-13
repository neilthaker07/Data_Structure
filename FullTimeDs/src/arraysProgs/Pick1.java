package arraysProgs;

public class Pick1 {

	public static void main(String[] args) {
		int a[] = new int[]{-1,2,1,3,9};
		System.out.println(p(a));
		
		a = new int[]{9,8,7,6,5,4,3,2,1};
		System.out.println(p(a));
		
		a = new int[]{1,2,3,4,5,6,7,2};
		System.out.println(p(a));
		
		a = new int[]{11,4,3,6,2,1};
		System.out.println(p(a));
		
		a = new int[]{4,8,2,1,0,3};
		System.out.println(p(a));
		
		a = new int[]{4};
		System.out.println(p(a));
		
		a = new int[]{4,8};
		System.out.println(p(a));
		
		a = new int[]{};
		System.out.println(p(a));
		
	}
	
	public static int p(int a[])
	{
		if(a.length==0)
		{
			return -1;
		}
		
		int start = 0;
		int end=a.length-1;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			
			boolean x = false;
			boolean y = false;
			
			if(mid+1<=end)
			{
				if(a[mid]>a[mid+1])
				{
					x=true;
				}
			}
			else
			{
				x=true;
			}
			
			if(mid-1>=start)
			{
				if(a[mid]>a[mid-1])
				{
					y=true;
				}
			}
			else
			{
				y=true;
			}
			
			if(x && y)
				return mid;
			
			if(mid-1<start)
			{
				start=mid+1;
			}
			else if(mid+1>end)
			{
				end=mid-1;
			}
			else if(a[mid+1]>a[mid-1])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
	}
}
