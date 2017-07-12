package recursionDp;

public class MulitplicationWithPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulitplicationWithPlus mp = new MulitplicationWithPlus();
		System.out.println(mp.mul(2,2));
	}

	public int mul(int a, int b)
	{
		return iterative(a,b,0);
	}
	
	public int iterative(int a, int b, int ans)
	{
		if(a==0 || b==0)
		{
			ans=0;
		}
		if(a==1)
		{
			ans=b;
		}
		else if(b==1)
		{
			ans=a;
		}
		else
		{
			// O(n)
			for(int i=0;i<b;i++)
			{
				ans+=a;
			}
			
			// O(logn)
			int c =b;
			if(b%2!=0)
			{
				b=b-1;
			}
			int g2 = recurse(a,b,1,0);
			if(c%2!=0)
			{
				g2 = g2+a;
			}
			System.out.println("recursion multiplication : "+g2);
		}
		return ans;
	}
	int count = 0;
	public int recurse(int a, int b, int n,int ans1)
	{
		if(ans1==0)
		{
			ans1 += a;
		}
		else
		{
			ans1 = ans1+ans1;
		}
		
		if(b!=1 && b%2!=0)
		{
			count++;
		}
		b/=2;
		if(b<1)
		{
			int u = count;
			for(int i=0;i<u;i++)
			{
				count++;
			}
			for(int l=0;l<count;l++)
			{
				ans1+=a;
			}
			return ans1;
		}
		return recurse(a, b, n, ans1);
	}
}