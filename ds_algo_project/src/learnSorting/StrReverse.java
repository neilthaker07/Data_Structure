package learnSorting;

import java.util.Scanner;

public class StrReverse {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	     String A=sc.next();

	     System.out.println(A);
	     
	     String f[] = new String[(int)(A.length()/2)];
	     String b[] = new String[(int)(A.length()/2)];
	     
	     String a=A;
	     if(A.length()%2!=0)
	     {
	    	a = A.substring(0, (int)(A.length()/2)) + A.substring((int)(A.length()/2) +1);
	     }
	     
	     for(int i=0;i<a.length()/2;i++)
	     {
	    	f[i]=a.substring(i, i+1);
	     }
	     
	     int j=0;
	     for(int i=a.length();i>(int)(a.length()/2);i--)
	     {
	    	b[j]=a.substring(i-1, i);
	    	j++;
	     }
	     
	     for(int i=0;i<(int)(a.length()/2);i++)
	     {
	    	 System.out.println(f[i]);
	    	 System.out.println(b[i]);
	     }
	 
	     int y=0;
	     for(int i=0;i<(int)(a.length()/2);i++)
	     {
	    	 if(!f[i].equals(b[i]))
		     {
	    		 y=2;
	    		 break;
		     }
	     }
	     if(y!=2)
	     {
	    	 System.out.println("YES");
	     }
	     
	}
}
