package arraysStrings;

import java.util.Scanner;

public class UniqueCharInString {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		String s = a.next();
		
		char[] c = s.toCharArray();
		boolean b[] = new boolean[128];
		System.out.println("Uniqueness: "+charCheck(s, c, b));
	}

	private static boolean charCheck(String s, char[] c, boolean[] b) 
	{
		//int checker = 0;
		for(int i=0;i<s.length();i++)
		{
			// space complexity O(1/8)
			/*int value = s.charAt(i)-'a';
			if((checker & (1 << value)) > 0)
			{
				return false;
			}
			checker |= (1 << value);*/
			if(b[(int)c[i]]==true)
			{
				return false;
			}
			else
			{
				b[(int)c[i]]=true;
			}
		}
		return true;
	}
}
// Time complexity : O(n), space complexity : O(1)