package progs;

import java.util.Scanner;

public class JackLucky {

	static String onceInATram(int x) {
		// Complete this function
		
		int firstNumber = x/1000;
		int firstSum = firstNumber%10 + (firstNumber/10)%10 + firstNumber/100;
		int lastThreeNumber = x % 1000;
		int ans = 0;
		boolean found = false;
		lastThreeNumber++;
		for(int i=lastThreeNumber;i<=999;i++)
		{
			int l1 = i%10;
			int l2 = (i/10)%10;
			int l3 = i/100;
			
			int lastSum = l1+l2+l3;
			
			if(lastSum == firstSum)
			{
				ans = i;
				found = true;
				break;
			}
		}
		if(!found)
		{
			firstNumber++;
			firstSum = firstNumber%10 + (firstNumber/10)%10 + firstNumber/100;
			lastThreeNumber = 0;
			ans = 0;
			for(int i=lastThreeNumber;i<=999;i++)
			{
				int l1 = i%10;
				int l2 = (i/10)%10;
				int l3 = i/100;
				
				int lastSum = l1+l2+l3;
				
				if(lastSum == firstSum)
				{
					ans = i;
					break;
				}
			}
		}
		
		return Integer.toString((firstNumber*1000) + ans);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		String result = onceInATram(x);
		System.out.println(result);
	}

}
