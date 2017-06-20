package arraysStrings;

import java.util.Scanner;

public class CheckSubstring {

	// check rotation of string
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String a = s.next();
		String b = s.next();
	
		System.out.println(checkRotation(a, b));
		//System.out.println(a.contains(b));
		
	}
/*
 * incomplete method
 * 
	private static boolean isSubstring(String a, String b)
	{
		int h = 0;
		int s=0;
		for(int i=0;i<a.length();i++)
		{
			for(int j=s;j<b.length();j++)
			{
				if(a.charAt(i) == b.charAt(j))
				{
					s=j+1;
					h++;
					break;
				}
			}
			
		}
		
		return false;
	}
*/

	private static boolean checkRotation(String a, String b) {
		String aa = a.concat(a);
		if(a.length() == b.length() && aa.contains(b))
		{
			return true;
		}
		return false;
	}	
}
