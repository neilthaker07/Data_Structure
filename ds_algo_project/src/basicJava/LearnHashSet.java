package basicJava;

import java.util.HashSet;
import java.util.Scanner;

public class LearnHashSet {

	public static void main(String[] args) {
		LearnHashSet r = new LearnHashSet();
		Scanner sc1 = new Scanner(System.in);
		int numberOfLines = Integer.parseInt(sc1.nextLine()); 
		
		String u[] = new String[numberOfLines];
		for(int i=0;i<numberOfLines;i++)
		{
			String input = sc1.nextLine();
			u[i]=input;
		}
		r.hash(u);
	}
	
	private void hash(String q[])
	{
		int count[]=new int[q.length];
		HashSet<String> s = new HashSet<String>();
		for(int i=0;i<q.length;i++)
		{
			String g[] = q[i].split("\\s+");
			boolean b= false;
			if(!s.contains(g[0]) || !s.contains(g[1]))
			{
				if(i>0)
				{
					b=true;
					count[i]=count[i-1]+1;
				}
				if(!s.contains(g[0]))
				{
					s.add(g[0]);
				}
				if(!s.contains(g[1]))
				{
					s.add(g[1]);
				}
			}
			if(i==0)
			{
				count[i]++;
			}
			else if(!b)
			{
				count[i]=count[i-1];
			}
		}
		for(int i=0;i<q.length;i++)
		{
			System.out.println(count[i]);
		}
	}
}
