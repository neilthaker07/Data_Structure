package progs;

import java.util.Scanner;

public class HackerRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HackerRecursion h = new HackerRecursion();
		Scanner s1 = new Scanner(System.in);
		int i = s1.nextInt();
		System.out.println(h.factorial(i));
	}

	public int factorial(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		return n*factorial(n-1);
	}
	
}
