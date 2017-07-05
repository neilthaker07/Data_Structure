package recursionDp;

public class RobotInGrid {

	public static void main(String[] args) {
		int rows = 4;
		int cols = 6;
		int array[][] = new int[rows][cols];
		array[0][4] = 11;
		array[1][1] = 11;
		array[1][3] = 11;
		array[3][0] = 11;
		array[3][2] = 11;
		
		for(int i=0;i< rows;i++)
		{
			
			for(int j=0;j<cols;j++)
			{
				if(array[i][j]==11)
				{
					break;
				}
				else
				{
					if(array[i+1][j]==0)
					{
						
					}
				}
				
			}
			
			
			
		}
	}
}
