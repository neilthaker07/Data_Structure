package graph;

public class UndirectedGraph 
{
	int vertexCount = 0;
	int adjMatrix[][] ;
	
	public UndirectedGraph(int vertexCount) 
	{
		this.vertexCount = vertexCount;
		adjMatrix = new int[vertexCount][vertexCount];
	}

	public static void main(String[] args) 
	{
		UndirectedGraph u = new UndirectedGraph(5);
		u.addEdge(1, 2);
		u.addEdge(3, 2);
		u.addEdge(4, 3);
		u.addEdge(4, 5);
		u.removeEdge(2, 3);
		System.out.println(u.isEdge(1, 3));
		System.out.println(u.isEdge(2, 3));
	}
	
	public void addEdge(int i,int j)
	{
		if(i<vertexCount && j< vertexCount && i>0 && j >0)
		{
			adjMatrix[i][j]=1;
			adjMatrix[j][i]=1;
		}
	}
	
	public void removeEdge(int i,int j)
	{
		if(i<vertexCount && j< vertexCount && i>0 && j >0)
		{
			adjMatrix[i][j]=0;
			adjMatrix[j][i]=0;
		}
	}
	
	public boolean isEdge(int i,int j)
	{
		if(i<vertexCount && j< vertexCount && i>0 && j >0)
		{
			return adjMatrix[i][j]==1 ? true : false;
		}
		return false;
	}
}
