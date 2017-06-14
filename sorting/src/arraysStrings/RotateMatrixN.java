package arraysStrings;

import java.util.Scanner;

public class RotateMatrixN {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int nbyn = s.nextInt();
		char nums[][] = new char[nbyn][nbyn];
		for(int i=0;i<nbyn;i++)
		{
			for(int j=0;j<nbyn;j++)
			{
				nums[i][j] = (s.next()).charAt(0);
			}
			System.out.println();
		}
		System.out.println("---------------------");
		for(int i=0;i<nbyn;i++)
		{
			for(int j=nbyn-1;j>=0;j--)
			{
				System.out.print(nums[j][i]);
			}
			System.out.println();
		}
		
		
		// storing in array 
		
		System.out.println("---------------------");
		for(int k=0;k<nbyn/2;k++)
		{
			int start = k;
			int end=nbyn-1-k;
			char temp;
			
			for(int i=start;i<end;i++)
			{
				int f = i-start;
				
				temp=nums[start][i];
				nums[start][i]=nums[end-f][start]; // end-f : for getting to be swapped element
				nums[end-f][start]=nums[end][end-f];
				nums[end][end-f]=nums[i][end];
				nums[i][end]=temp;
			}
		}
		for(int i=0;i<nbyn;i++)
		{
			for(int j=0;j<nbyn;j++)
			{
				System.out.print(nums[i][j]);
			}
			System.out.println();
		}
	}
}
