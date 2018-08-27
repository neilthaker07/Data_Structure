package graph;

import java.util.HashMap;
import java.util.Map;

public class Dijkstra {

	public static void main(String[] args) {
		Dijkstra d = new Dijkstra();
		d.tran();
	}
	
	private Vertex4 vertexList[];
	private boolean adjMatrix[][];
	private int weights[][];
	private final int maxVertex = 10;
	private int vertexCount=0;
	
	public Dijkstra() {
		vertexList = new Vertex4[maxVertex];
		adjMatrix = new boolean[maxVertex][maxVertex];
		weights = new int[maxVertex][maxVertex];
	}
	
	public void tran()
	{
		addVertex(0);
		addVertex(1);
		addVertex(2);
		addVertex(3);
		addVertex(4);
		addVertex(5);
		
		addEdge(1, 2,4);
		addEdge(1, 3,1);
		addEdge(2, 5,4);
		addEdge(3, 4,4);
		addEdge(3, 2,2);
		addEdge(4, 5,4);
		
		Vertex4 start = vertexList[1]; 
		
		traverse(start.value);
		
		System.out.println(outputMap.get(1));
		System.out.println(outputMap.get(2));
		System.out.println(outputMap.get(3));
		System.out.println(outputMap.get(4));
		System.out.println(outputMap.get(5));
	}
	
	public void addVertex(int value)
	{
		vertexList[vertexCount] = new Vertex4(value);
		outputMap.put(value, 0);
		vertexCount++;
	}
	
	public void addEdge(int i, int j, int w)
	{
		adjMatrix[i][j]=true;
		weights[i][j]=w;
	}
	
	public void displayVertex(int v)
	{
		for(int i=0;i<vertexCount ;i++)
		{
			if(vertexList[i].value==v)
			{
				System.out.println(vertexList[i].value);
				break;
			}
		}
	}
	Map<Integer, Integer> outputMap = new HashMap<Integer, Integer>();
	public void traverse(int s)
	{
		int min = Integer.MAX_VALUE;
		int minJ = 0;
		for(int j=1;j<vertexCount;j++)
		{
			if(adjMatrix[s][j]) // edge exists 
			{
				int x = outputMap.get(s) + weights[s][j];

				if(outputMap.get(j)==0 || outputMap.get(j) > x)
				{
					min = min > x ? x : min;
					minJ = min == x ? j : minJ;
					
					outputMap.put(j, x);
				}
			}
		}
		if(minJ>0)
		{
			traverse(minJ);
		}
	}
}

class Vertex3
{
	public boolean visited;
	public int value;
	public Vertex3(int value)
	{
		this.value = value;
	}
}