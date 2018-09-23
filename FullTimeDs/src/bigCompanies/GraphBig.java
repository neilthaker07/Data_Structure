package bigCompanies;

import java.util.LinkedList;

public class GraphBig {
	
	private int v;
	private LinkedList<Integer> adj[] ;
	
	public GraphBig(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	
	public static void main(String[] args) {
		GraphBig g = new GraphBig(2);
		g.addEdge(0, 1);
	}

}
