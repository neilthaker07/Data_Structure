package progs;

import java.util.Scanner;

public class DifferenceHack 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) 
		{
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}

}

class Difference 
{
	Difference(int[] elements)
	{
		this.elements = elements;
	}
	
	private int[] elements;
	public int maximumDifference;
	
	public void computeDifference()
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<elements.length;i++)
		{
			min = elements[i] > min ? min : elements[i];
			max = elements[i] < max ? max : elements[i];
		}
		
		maximumDifference = max-min;
	}

}