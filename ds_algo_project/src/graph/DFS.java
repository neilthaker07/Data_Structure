package graph;

import java.util.Stack;

public class DFS {

	private Vertex vertexList[];
	private boolean adjMatrix[][];
	private final int maxVertex = 10;
	private Stack stack;
	private int vertexCount=0;

	public DFS()
	{
		vertexList = new Vertex[maxVertex];
		adjMatrix = new boolean[maxVertex][maxVertex];
		stack = new Stack();
	}
	
	public void addVertex(int value)
	{
		vertexList[vertexCount] = new Vertex(value);
		vertexCount++;
	}
	
	public void addEdge(int i, int j)
	{
		adjMatrix[i][j]=true;
		adjMatrix[j][i]=true;
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
	
	public void traverse()
	{
		addVertex(0);
		addVertex(1);
		addVertex(2);
		addVertex(3);
		addVertex(4);
		addVertex(5);
		
		addEdge(1, 2);
		addEdge(1, 3);
		addEdge(2, 4);
		addEdge(2, 5);
		
		//displayVertex(1);
		recursion(1);
	}

	private void recursion(int i) 
	{
		if(!vertexList[i].visited)
		{
			vertexList[i].visited = true;
			stack.add(vertexList[i].value);
			System.out.println(vertexList[i].value);
		}
		for(int j=1;j<vertexCount;j++)
		{
			if(adjMatrix[vertexList[i].value][j] && !vertexList[j].visited)
			{
				vertexList[j].visited = true;
				stack.add(vertexList[j].value);
				System.out.println(vertexList[j].value);
				recursion(vertexList[j].value);
			}
		}
		stack.pop();
	}

	public static void main(String[] args) {
		DFS a = new DFS();
		a.traverse();
	}
}

class Vertex
{
	public boolean visited;
	public int value;
	public Vertex(int value)
	{
		this.value = value;
	}
}