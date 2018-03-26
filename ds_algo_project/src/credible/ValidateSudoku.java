package credible;

import java.util.HashSet;

public class ValidateSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//isValidSudoku(new char[][]{{},{},{},{},{}});
		int y[] = productExceptSelf(new int[]{9,0,-2});
		System.out.println(y[0]+" "+y[1]+" "+y[2]+" "+y[0]);
		
	}
	
	public static boolean isValidSudoku(char[][] board) {
		for(int i = 0; i<9; i++){
        HashSet<Character> rows = new HashSet<Character>();
        HashSet<Character> columns = new HashSet<Character>();
        HashSet<Character> cube = new HashSet<Character>();
        for (int j = 0; j < 9;j++){
            if(board[i][j]!='.' && !rows.add(board[i][j]))
                return false;
            if(board[j][i]!='.' && !columns.add(board[j][i]))
                return false;
            int RowIndex = 3*(i/3);
            int ColIndex = 3*(i%3);
            if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
                return false;
        }
    }
    return true;
    }
	
	public static int[] productExceptSelf(int[] nums) {
    
		int l = nums.length;
		int ans[] = new int[l];
		
		int left = 1;
		for(int i=0;i<l;i++)
		{
			if(i-1>=0)
			{
				ans[i] = left * nums[i-1];
				left = left * nums[i-1];
			}
			else
			{
				ans[i] = 1;
			}
		}
		
		int right = 1;
		for(int i=l-1;i>=0;i--)
		{
			if(i+1<=l-1)
			{
				right = right * nums[i+1];
				ans[i] = right * ans[i];
			}
		}
		
		return ans;
    }

}
