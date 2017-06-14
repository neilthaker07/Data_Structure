package learnSorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] anArray;
		anArray = new int[size];
			
		for (int i = 0; i < size; i++)
		{	
			anArray[i] = s.nextInt();
		}
		
		for(int i = 0; i< size; i++)
		{
			System.out.print(anArray[i]+" ");
		}
		
		for(int i = 1; i < size; i++)
		{
			for(int j = i; j > 0; j--)
			{
				int k = j/2;
				//System.out.println(k);
				
				if (anArray[j] < anArray[j-1])  
				{
					swapValues(anArray, j);
				}
			}
		}
		System.out.println();
		for(int i = 0; i < size; i++)
		{
			System.out.print(anArray[i]+" ");
		}
		
	}

	private static void swapValues(int[] anArray, int i) {
		int temp = anArray[i];
		anArray[i] = anArray[i-1];
		anArray[i-1] = temp;
	}

}
