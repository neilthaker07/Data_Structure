package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	private Vertex vertexList[];
	private boolean adjMatrix[][];
	private final int maxVertex = 10;
	private Queue<Integer> queue;
	private int vertexCount=0;

	public BFS()
	{
		vertexList = new Vertex[maxVertex];
		adjMatrix = new boolean[maxVertex][maxVertex];
		queue = new LinkedList<Integer>();
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
		noRecursion(1);
	}

	private void noRecursion(int i) 
	{
		queue.add(vertexList[i].value);
		vertexList[i].visited = true;
		while(!queue.isEmpty())
		{
			for(int j=1;j<vertexCount;j++)
			{
				if(adjMatrix[vertexList[queue.peek()].value][j] && !vertexList[j].visited)
				{
					queue.add(vertexList[j].value);
					vertexList[j].visited = true;
				}
			}
			System.out.println(queue.remove());
		}
	}

	public static void main(String[] args) {
		BFS a = new BFS();
		a.traverse();
	}
}

class Vertex2
{
	public boolean visited;
	public int value;
	public Vertex2(int value)
	{
		this.value = value;
	}
}
