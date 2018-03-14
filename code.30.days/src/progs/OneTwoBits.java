package progs;

public class OneTwoBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] bits = new int[]{1,1,1,0};
		int n= bits.length;
		int i=0;
		
		while(i < n-1)
		{
			if(bits[i] == 0 )
			{
				i++;
			}
			else
			{
				i+=2;
			}
		}
		
		if(i==n-1)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		
		/*if(bits.length == 1 && bits[0]==0)
		{
			System.out.println(true);
		}
		else 
		{
			int a1= 10;
			int a2 = 11;
			int c1 = 0,c2=0;
			for(int i=0;i<bits.length;i++)
			{
				if( i+1 < bits.length
					&&	((bits[i]*10)+bits[i+1] == a1)  || ((bits[i]*10)+bits[i+1] == a2))
				{
					i++;
					c1++;
				}
				else
				{
					c2++;
				}
			}
		}*/
	}

}
