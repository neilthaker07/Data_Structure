package sortingSearching;

import java.util.Arrays;

public class MatrixSearch {

	int search = 19;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat[][] = new int[4][5];
		mat[0][0] = 2; 
		mat[0][1] = 5;
		mat[0][2] = 9;
		mat[0][3] = 11;
		mat[0][4] = 12;
		
		mat[1][0] = 3;
		mat[1][1] = 10;
		mat[1][2] = 19;
		mat[1][3] = 20;
		mat[1][4] = 30;
		
		mat[2][0] = 4;
		mat[2][1] = 11;
		mat[2][2] = 20;
		mat[2][3] = 25;
		mat[2][4] = 40;
		
		mat[3][0] = 5;
		mat[3][1] = 12;
		mat[3][2] = 21;
		mat[3][3] = 29;
		mat[3][4] = 50;
		
		MatrixSearch m = new MatrixSearch();
		System.out.println(Arrays.toString(m.search(mat,0,3,0,4)));
	}

	int r=4;
	int c=5;
	int count = 0;
	public int[] search(int mat[][], int startRow, int endRow, int startCol, int endCol)
	{
		if(search==0 || count > 50)
		{
			return new int[]{-1};
		}
		
		int midRow = (startRow+endRow)%2!=0 ? ((startRow+endRow)/2) + 1 :(startRow+endRow)/2;
		int midCol = (startCol+endCol)%2!=0 ? ((startCol+endCol)/2) + 1 :(startCol+endCol)/2;
		int midValue = mat[midRow][midCol];
		count++;
		
		if(search == midValue)
		{
			return new int[]{midRow,midCol}; 
		}
		else
		{
			int t[]=searchRowOrColSection(mat, startRow,endRow, startCol, midCol);
			if(t[0]!=-1)
			{
				return t;
			}
			else if(search < midValue)
			{
				return search(mat, startRow, midRow, startCol, midCol);
			}
			else
			{
				return search(mat, midRow, endRow, midCol, endCol);
			}
		}
	}
	
	public int[] searchRowOrColSection(int mat[][], int startRow, int endRow, int startCol, int endCol)
	{
		for(int i=startRow;i<=endRow;i++)
		{
			for(int j=startCol;j<=endCol;j++)
			{
				if(mat[i][j] == search)
				{
					return new int[]{i,j}; 
				}
			}
		}
		return new int[]{-1};
	}
}
