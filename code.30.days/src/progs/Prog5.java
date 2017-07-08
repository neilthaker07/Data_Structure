package progs;

import java.util.*;
/*
2
Hacker
Rank
Hce akr
Rn ak
*/
public class Prog5 {

    public static void main(String[] args) {

    	Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String l[] = new String[n];
        for(int i=0;i<n;i++)
        {
        	String a = in.next();
        	l[i]=a;
        }
        
        for(int i=0;i<n;i++)
        {
        	String process = l[i];
        	char evens[] = new char[process.length()%2==0 ? process.length()/2 : (process.length()/2) + 1];
        	char odds[] = new char[process.length()%2==0 ? process.length()/2 : (process.length()/2) ];
        	int e = 0;
        	int d = 0;
        	for(int j=0;j<process.length();j++)
        	{
        		if(j%2==0)
        		{
        			evens[e] = process.charAt(j);
        			e++;
        		}
        		else
        		{
        			odds[d] = process.charAt(j);
        			d++;
        		}
        	}
        	
        	for(int k=0;k<evens.length;k++)
        	{
        		System.out.print(evens[k]);
        	}
        	System.out.print(" ");
        	for(int k=0;k<odds.length;k++)
        	{
        		System.out.print(odds[k]);
        	}
        	System.out.println();
        }
    
    }
}