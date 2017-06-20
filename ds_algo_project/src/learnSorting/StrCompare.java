/* SAMPLE INPUT
 * 
 * welcometojava
 * 3
 * 
 * 
 * OUTPUT
 * ava
 * wel
 */

package learnSorting;

import java.util.Scanner;

public class StrCompare {

	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		String b1 = a.nextLine();
		System.out.println(b1);
		int b2 = a.nextInt();
		System.out.println(b2);
		
		String l[] = new String[b1.length()-b2+1];
		System.out.println(l.length);
		
		for(int i=0;i<l.length;i++)
		{
			l[i] = b1.substring(i, i+b2);
			System.out.println(l[i]);
		}
		
		String uso[] = l;
		for(int i=0;i<uso.length;i++)
		{
			for(int j=i;j<uso.length;j++)
			{
				if(j+1<uso.length)
				{
					int comp = uso[i].compareTo(uso[j+1]);
					if(comp > 0)
					{
						String temp = uso[i];
						uso[i] = uso[j+1];
						uso[j+1] = temp;
					}
				}
			}
		}
		
		System.out.println("FINAL");
		for(int i=0;i<uso.length;i++)
		{
			System.out.println(uso[i]);
		}
		
		System.out.println("first : "+uso[0]);
		System.out.println("last : "+uso[uso.length-1]);
		
		
	}
}