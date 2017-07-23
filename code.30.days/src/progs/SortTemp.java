package progs;

import java.util.Scanner;

public class SortTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		// Write Your Code Here
		int numberOfSwaps = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(j+1<a.length && a[j] > a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					numberOfSwaps++;
				}
			}
		}

		System.out.println("Array is sorted in "+ numberOfSwaps + " swaps.");
		System.out.println("First Element: "+a[0]);
		System.out.println("Last Element: "+a[a.length-1]);
	}

}
