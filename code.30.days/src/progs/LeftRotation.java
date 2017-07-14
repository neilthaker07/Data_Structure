package progs;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		int arrayLength = a.nextInt();
		int rotate = a.nextInt();
		
		int[] array = new int[arrayLength];
		for(int i=0;i<arrayLength;i++)
		{
			array[i] = a.nextInt();
		}
		
		for(int i=0;i<rotate;i++)
		{
			int temp = array[0];
			for(int j=1;j<arrayLength;j++)
			{
				array[j-1]=array[j];
			}
			array[arrayLength-1] = temp;
		}
		
		for(int i=0;i<arrayLength;i++)
		{
			System.out.print(array[i]+ " ");
		}
	}

}
