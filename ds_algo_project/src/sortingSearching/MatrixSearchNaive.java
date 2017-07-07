package sortingSearching;

public class MatrixSearchNaive {

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
		
		MatrixSearchNaive m = new MatrixSearchNaive();
		System.out.println(m.search(mat));
	}
	
	int search = 19;
	int r=4;
	int c=5;
	int count = 0;
	// searching from first row and last col
	public boolean search(int mat[][])
	{
		int row=0;
		int col = mat[0].length-1;
		while(row<mat.length && col>=0)
		{
			if(mat[row][col] == search)
			{
				return true;
			}
			else if(mat[row][col] > search)
			{
				col--;
			}
			else
			{
				row++;
			}
		}
		return false;
	}
}