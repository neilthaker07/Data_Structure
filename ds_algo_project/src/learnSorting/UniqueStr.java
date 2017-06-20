package learnSorting;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueStr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		/*char[] cc = s.toCharArray();
		Arrays.sort(cc);
		System.out.println(new String(cc));
		
		boolean bb[]= new boolean[128];
		for(int i=0;i<s.length();i++)
		{
			int v = s.charAt(i);
			System.out.println(v);
			if(bb[v])
			{
				bb[v]=false;
			}
			bb[v]=true;
		}*/
		/*
		String a1 = "abc";
		System.out.println(a1.toCharArray());
		*/
		
		int[] letters = new int[128];
		
		char[] cc = s.toCharArray();
		for(char c : cc)
		{
			letters[c]++;
			System.out.println(letters[c]);
		}
		/*for(int i=97;i<100;i++)
		{
			System.out.println(letters[i]);
		}*/
		for(int i=0;i<s.length();i++)
		{
			int c = (int) s.charAt(i);
			letters[c]--;
			
			//System.out.println((int)s.charAt(i));
		}
		
	}
}
