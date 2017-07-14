package progs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arrays2d {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 6; j++) 
			{
				arr[i][j] = in.nextInt();
			}
		}
		
		int[] ans = new int[16];
		int count = 0;
		for (int i = 0; i < 6; i++) 
		{
			for (int j = 0; j < 6; j++) 
			{
				if(j+2<6 && i+2 < 6)
				{
					ans[count] = arr[i][j]+arr[i][j+1] + arr[i][j+2]
						+ arr[i+1][j+1]  
						+ arr[i+2][j]+arr[i+2][j+1] + arr[i+2][j+2];
					
					count++;
				}
			}
		}
		//System.out.println(Arrays.toString(ans));
		Arrays.sort(ans);
		System.out.println(ans[ans.length-1]);
	}
}
