package recursionDp;

import java.util.Scanner;

public class RemoveAdjacentDups {

	public static void main(String a[])
	{
		RemoveAdjacentDups r = new RemoveAdjacentDups();
		Scanner sc1 = new Scanner(System.in);
		int numberOfTests = sc1.nextInt();
		
		String u[] = new String[numberOfTests];
		for(int i=0;i<numberOfTests;i++)
		{
			String input = sc1.next();
			u[i]=r.removeAdjacentDuplicate(input);
		}
		for(int i=0;i<numberOfTests;i++)
		{
			System.out.println(u[i]);
		}
	}
	
	public String removeAdjacentDuplicate(String s)
	{
		char a[] = s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(i<a.length-1)
			{
				if(a[i] == a[i+1])
				{
					a[i]='\0';
					a[i+1]='\0';
					i++;
				}
			}
		}
		return new String(a);
	}
}