package arraysStrings;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		String s1 = a.next();
		String s2 = a.next();
		
		System.out.println(checkPermu(s1,s2));
	}
	
	private static boolean checkPermu(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		else
		{
			/*int[] letters = new int[128];
			char cx[] = s1.toCharArray();
			for(char c : cx) // O(n)
			{
				letters[c]++;
			}
			for(int i=0;i<s2.length();i++)
			{
				int c = (int) s2.charAt(i);
				letters[c]--;
				if(letters[c]<0)
				{
					return false;
				}
			}
			*/
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1); // O(nlogn)
			Arrays.sort(c2);
			
			//if(Arrays.equals(c1, c2))  Big O (n square)
			if(new String(c1).equals(new String(c2)))
			{
				return true;
			}
			return false;
		}
	}
}
