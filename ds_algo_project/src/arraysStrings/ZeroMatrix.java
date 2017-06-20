package arraysStrings;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * INPUT 
 *  4 3
7 8 0
9 1 2
6 6 6
0 9 0

OUTPUT
------------------
7 8 0 
9 1 2 
6 6 6 
0 9 0 
------------------
-----------
0 0 0 
0 1 0 
0 6 0 
0 0 0 

 * 
 */

public class ZeroMatrix {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int nums[][] = new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				nums[i][j] = s.nextInt();
			}
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("------------------");
		
		/*ArrayList<Integer> no1 = new ArrayList<Integer>();
		ArrayList<Integer> no2 = new ArrayList<Integer>();
		*/
		boolean[] b1=new boolean[n];
		boolean[] b2=new boolean[m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(nums[i][j]==0)
				{
					/*no1.add(i);
					no2.add(j);*/
					b1[i]=true;
					b2[j]=true;
					break;
				}
			}
		}
		// TIME COMPLEXITY: O(mn) = O(N) ; where m is rows and n is cols , N=m*n
		// SPACE COMPLEXITY : O(mn) , using bit vector it can be O(n) , using books algo it can be O(1) - no need to store 0 value element
		for(int p=0;p<n;p++)
		{
			if(b1[p])
			{
				nullifyCol(m, nums,p);
			}
		}
		for(int p=0;p<m;p++)
		{
			if(b2[p])
			{
				nullifyRow(n, nums,p);
			}
		}
		
		System.out.println("-----------");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void nullifyCol(int m, int[][] nums,int p) 
	{
		for(int i=0;i<m;i++) 
		{
			nums[p][i]=0; // so p is fixed and change value of i for whole column to make every row element 0.
		}
		/*for(int ff=0;ff<no2.size();ff++)
		{
			nums[i][no2.get(ff)]=0;
		}*/
	}
	
	private static void nullifyRow(int n, int[][] nums,int p) 
	{
		for (int i = 0; i < n; i++)
		{
			nums[i][p]=0;
		}
		/*
		 * for(int ff=0;ff<no2.size();ff++) { nums[no1.get(ff)][i]=0; }
		 */
	}
}
