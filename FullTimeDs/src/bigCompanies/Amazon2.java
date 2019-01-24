package bigCompanies;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Amazon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int minD(int numRows, int numColumns, List<List<Integer>> lot)
	{
		int destRow=0;
		int destCol=0;
		
		int sourceRow=0;
		int sourceCol=0;
		
		for(int i=0;i<numRows;i++)
		{
			for(int j=0;j<numColumns;j++)
			{
				if(lot.get(i).get(j)==9)
				{
					destRow=i;
					destCol=j;
					break;
				}
			}
		}
		if(destRow==0 && destCol == 0)
			return -1;
		
		boolean visited[][] = new boolean[numRows][numColumns];
		for(int i=0;i<numRows;i++)
		{
			for(int j=0;j<numColumns;j++)
			{
				if(lot.get(i).get(j)==0)
				{
					visited[i][j]=true;
				}
				else
				{
					visited[i][j]=false;
				}
			}
		}
		
		Queue<EachItem> queue = new LinkedList();
		EachItem q1 = new EachItem(sourceRow, sourceCol, 0);
		queue.add(q1);
		
		visited[sourceRow][sourceCol] = true;
		while(!queue.isEmpty())
		{
			EachItem p = queue.remove();
			if(lot.get(p.row).get(p.col) == 9)
			{
				return p.dist;
			}
			
			// moving up 
	        if (p.row - 1 >= 0 && !visited[p.row - 1][p.col]) 
	        { 
	            queue.add(new EachItem(p.row - 1, p.col, p.dist + 1)); 
	            visited[p.row - 1][p.col] = true; 
	        } 
	  
	        // moving down 
	        if (p.row + 1 < numRows && !visited[p.row + 1][p.col]) 
	        { 
	            queue.add(new EachItem(p.row + 1, p.col, p.dist + 1)); 
	            visited[p.row + 1][p.col] = true; 
	        } 
	  
	        // moving left 
	        if (p.col - 1 >= 0 && !visited[p.row][p.col - 1]) 
	        { 
	            queue.add(new EachItem(p.row, p.col - 1, p.dist + 1)); 
	            visited[p.row][p.col - 1] = true; 
	        } 
	         // moving right 
	        if (p.col + 1 < numColumns && !visited[p.row][p.col + 1]) 
	        { 
	            queue.add(new EachItem(p.row, p.col + 1, p.dist + 1)); 
	            visited[p.row][p.col + 1] = true; 
	        } 
	    } 
	    return -1; 
	}

}
class EachItem { 
    int row; 
    int col; 
    int dist; 
    EachItem(int x, int y, int w) 
    {
    	this.row =x;
    	this.col =y;
    	this.dist =w;
    } 
}
