package progs;

import java.util.Scanner;

public class MoreExceptions {
	
	public static void main(String[] args) {
	    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
	
}

class Calculator
{
	public int power(int n, int p) throws Exception
	{
		if(p==0 && n>0)
		{
			return 1;
		}
		else if(n==0)
		{
			return 0;
		}
		else if(n>0 && p >0)
		{
			int ans = 1;
			for(int i=0;i<p;i++)
			{
				ans *= n;
			}
			return ans;
		}
		else
		{
			throw new Exception("n and p should be non-negative");
		}
	}
}