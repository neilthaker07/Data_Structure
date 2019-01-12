package bigCompanies;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class GoogleQue {

	public static void main(String[] args) {
		
		calculateRate("USD","CHN");
	}
	
	static int calculateRate(String from, String to)
	{
		Graph g = new Graph(5);
		g.addEdge(0, 1, 5);
		g.addEdge(0, 2, 6);
		g.addEdge(2, 3, 2);
		g.addEdge(4, 3, 3);
		
		Set<String> visited = new HashSet();
		return processGraph(from, to, from, 1, 1,visited, g);
	}
	
	static int processGraph(String from, String to, String curr, int originalVal, int currVal, Set<String> visited, Graph g)
	{
		visited.add(curr);
		if(curr.equals(to))
		{
			return originalVal;
		}
		
		//adjacents
		if(adj!=null)
		{
			while(adj.hasNext())
			{
				n = adj.next();
				if(visited.contains(n))
				{
					currVal = n.val;
					originalVal = originalVal * currVal;
					return processGraph(from, to, n, originalVal, currVal, visited);
				}
			}
			// same else code - divide currVal
			originalVal = originalVal / currVal;
		}
		else
		{
			//same else code - divide currVal
			originalVal = originalVal / currVal;
		}
		return originalVal;
	}
}

//Directed weighted graph
class Graph
{
	LinkedList<Edge> adjacencylist[];
	int vertices;
	Graph(int vertices)
	{
		this.vertices = vertices;
        adjacencylist = new LinkedList[vertices];
		for(int i=0;i<vertices;i++)
		{
			adjacencylist[i] = new LinkedList<Edge>();
		}
	}
	
	void addEdge(int v, int w, int weight)
	{
		Edge edge = new Edge(v, w, weight);
        adjacencylist[v].add(edge); //for directed graph
	}
	
	static class Edge {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }	
}