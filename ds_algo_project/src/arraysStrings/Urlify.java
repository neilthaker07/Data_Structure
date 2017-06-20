package arraysStrings;

import java.util.Scanner;

public class Urlify {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int spaces = 0;
		for(int i =0;i<s.length();i++)
		{
			if(s.toCharArray()[i]==' ')
			{
				spaces++;
			}
		}
		
		/*s = s.replace(" ", "%20");
		System.out.println(s);*/
		int nl = s.length()+2*spaces;
		char[] c = new char[nl]; 
		int i2=0;
		for(int i=0;i<s.length();i++)  // O(n) - n is length of string
		{
			if(s.charAt(i)==' ')
			{
				c[i2]='%';
				c[i2+1]='2';
				c[i2+2]='0';
				i2+=3;
			}
			else
			{
				c[i2]=s.charAt(i);
				i2++;
			}
		}
		System.out.println(new String(c));
	}
}
