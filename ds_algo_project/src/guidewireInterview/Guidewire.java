package guidewireInterview;

public class Guidewire {

	public static void main(String[] args) {

		prev();
		newer();
	}
	
	private static void newer()
	{
		int n = 10;
		int op[] = new int[n];
		if(n!=1)
		{
			int random =(int) (Math.random() * ( 52 - 1 ));
			
			if(n%2==0)
			{
				for(int i=0;i<n;i+=2)
				{
					op[i] = random;
					op[i+1] = random*-1;
					random++;
				}
				/*int c = 0;
				for(int i=n/2; i < n;i++)
				{
					op[i] = op[c] * -1;
					c++;
				}*/
			}
			else
			{
				op[0] = 0;
				for(int i=1;i<n;i++)
				{
					
					op[i] = random;
					op[i+1] = random*-1;
					random++;
				}
				/*int c = 0;
				op[n/2] = 0;
				for(int i=(n/2)+1; i < n;i++)
				{
					op[i] = op[c] * -1;
					c++;
				}*/
			}
			
			System.out.println();
			int sum = 0;
			for(int i=0;i<n;i++)
			{
				System.out.print(op[i]+" ");
				sum += op[i];
			}
			System.out.println();
			System.out.println("sum : "+sum);
		}
		else
		{
			op[0] = 0;
			System.out.println(op[0]);
		}
	
		
	}

	private static void prev() {
		int n = 10;
		int op[] = new int[n];
		if(n!=1)
		{
			int random =(int) (Math.random() * ( 52 - 1 ));
			
			if(n%2==0)
			{
				for(int i=0;i<n/2;i++)
				{
					op[i] = random;
					random++;
				}
				int c = 0;
				for(int i=n/2; i < n;i++)
				{
					op[i] = op[c] * -1;
					c++;
				}
			}
			else
			{
				for(int i=0;i<n/2;i++)
				{
					op[i] = random;
					random++;
				}
				int c = 0;
				op[n/2] = 0;
				for(int i=(n/2)+1; i < n;i++)
				{
					op[i] = op[c] * -1;
					c++;
				}
			}
			
			System.out.println();
			int sum = 0;
			for(int i=0;i<n;i++)
			{
				System.out.print(op[i]+" ");
				sum += op[i];
			}
			System.out.println();
			System.out.println("sum : "+sum);
		}
		else
		{
			op[0] = 0;
			System.out.println(op[0]);
		}
	}
}
