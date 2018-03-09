package coinbase;

import java.util.Scanner;

public class Solution1 {

	public static void main(String a[])
	{
		
		Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        for(int t = 1; t <= n; t++) {
            /*int t1 = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(t1+b);*/
        	
        	if(t%15==0)
        	{
        		System.out.println("BooHoo");
        	}
        	else if(t%5==0)
        	{
        		System.out.println("Hoo");
        	}
        	else if(t%3==0)
        	{
        		System.out.println("Boo");
        	}
        	else
        	{
        		System.out.println(t);
        	}
        	
        }
		
		
		
	}
}
