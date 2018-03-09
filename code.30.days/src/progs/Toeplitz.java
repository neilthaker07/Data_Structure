package progs;

public class Toeplitz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int[][] matrix = new int[3][4];
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[0][3] = 4;
		
		matrix[1][0] = 5;
		matrix[1][1] = 1;
		matrix[1][2] = 2;
		matrix[1][3] = 3;
		
		matrix[2][0] = 9;
		matrix[2][1] = 5;
		matrix[2][2] = 1;
		matrix[2][3] = 25;
		
		*/
		int[][] matrix = new int[3][2];
		matrix[0][0] = 97;
		matrix[0][1] = 97;
		
		matrix[1][0] = 80;
		matrix[1][1] = 97;
		
		matrix[2][0] = 10;
		matrix[2][1] = 80;

		
		if(matrix.length == 1 || matrix[0].length == 1)
		{
			System.out.println(true);
		}
		else
		{
			
			int value = 0;
			int c = 0;
			for(int i=0;i<matrix.length;i++)
			{
				value = matrix[i][c];
				int j=i+1;
				c++;
				
				while(j<matrix.length && c<matrix[0].length)
				{
					if(value != matrix[j][c])
					{
						System.out.println(false);
						break;
					}
					c++;
					j++;
				}
				c=0;
			}
			
			c=0;
			for(int i=1;i<matrix[0].length;i++)
			{
				value = matrix[c][i];
				int j=i+1;
				c++;
				
				while(c<matrix.length && j<matrix[0].length)
				{
					if(value != matrix[c][j])
					{
						System.out.println(false);
						break;
					}
					c++;
					j++;
				}
				c=0;
			}
			System.out.println(true);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
