package treesGraphs;

import java.util.HashSet;

public class DepthFirstSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepthFirstSearch dfs = new DepthFirstSearch();
		dfs.processDFS();
	}
	
	public void processDFS()
	{
		GraphCreation gc1 = new GraphCreation();
		GraphCreation sg = gc1.wholeGraph();
		
		NodeGraph[] allNodes = new NodeGraph[6];
		allNodes = sg.getGraphNodes();
		
		NodeGraph ng = allNodes[0];
		getExeOrder(ng);
	}
	
	HashSet<Integer> visited = new HashSet<Integer>(); 
	public void getExeOrder(NodeGraph ng)
	{
		if(ng.value!=null)
		{
			System.out.println(ng.value);
			visited.add(ng.value); // DFS : always save visited node
			NodeGraph ch[] = ng.adjacent;

			if(ch != null)
			{
				for(int i=0;i<ch.length;i++)
				{
					if(!visited.contains(ch[i].value))
					{
						getExeOrder(ch[i]);
					}
				}
			}
		}
	}
}