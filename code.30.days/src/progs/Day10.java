package progs;

import java.util.*;
// 13 -> binary is 1101 : so 2
// 4 -> 100 : so 1
// 5 -> 101 :so 1 - only consecutive 1 
public class Day10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		String a = Integer.toBinaryString(n);
		
		char c[] = a.toCharArray();
		int var1 = 0;
		int var2 = 0;
		
		for(int i=0;i<c.length;i++)
		{
			if(var2==0 && c[i]=='1')
			{
				var2++;
			}
			
			if(c[i]=='1')
			{
				var1++;
			}
			else
			{
				var1=0;
			}
			
			if(var1>var2)
			{
				var2=var1;
			}
		}
		System.out.println(var2);
	}
}