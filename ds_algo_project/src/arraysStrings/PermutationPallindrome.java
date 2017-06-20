package arraysStrings;

import java.util.Scanner;

public class PermutationPallindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int l = s.length();
		
		System.out.println("Permutation palindrome : "+multipleOn(s, l));
		//System.out.println("Permutation palindrome : "+multiplePermutate(s, l));
		//System.out.println("Is pallindrome? : "+pallindromeString(s));
	}

	private static boolean multipleOn(String s, int l) 
	{
		// O(n)
		boolean[] bb = new boolean[128];
		for(int i =0;i<l;i++)
		{
			bb[(int)s.charAt(i)] = (bb[(int)s.charAt(i)] == false) ? true : false;
		}
		if(l%2==0) 
		{
			for(int i=0;i<l;i++)
			{
				if(bb[(int)s.charAt(i)]==true)
				{
					return false;
				}
			}
		}
		else
		{
			int coun = 0;
			for(int i=0;i<l;i++)
			{
				if(bb[(int)s.charAt(i)]==true)
				{
					coun++;
				}
			}
			if(coun>1)
			{
				return false;
			}
		}
		return true;
	}
	
	private static boolean multiplePermutate(String s, int l) {
		int cz[] = new int[128]; // O(n square)
		for(int i=0;i<l;i++)
		{
			char ch = s.charAt(i);
			cz[(int)ch]++;
			
			for(int j=0;j<l;j++)
			{
				if(j!=i)
				{
					char ch2 = s.charAt(j);
					if(ch==ch2)
					{
						cz[(int)ch]--;
					}
				}
			}
		}
		
		int cm = 0;
		int cp = 0;
		for(int i=0;i<128;i++)
		{
			if(cz[i]<0)
			{
				cm++;
			}
			else if(cz[i]>0)
			{
				cp++;
			}
		}
		if(cm>1)
		{
			return false;
		}
		else if(cp>1)
		{
			return false;
		}
		return true;
	}

	private static boolean pallindromeString(String s) {
		int half = (int)(s.length()/2);
		char c1[] = new char[half];
		char c2[] = new char[half];
		for(int i=0;i<half;i++)
		{
			c1[i]=s.charAt(i);
		}
		int h = 0;
		for(int i=s.length()-1;i>half;i--)
		{
			c2[h]=s.charAt(i);
			h++;
		}
		
		if(new String(c1).equals(new String(c2)))
		{
			return true;
		}
		return false;
	}
}
