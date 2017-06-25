package treesGraphs;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BreadthFirstSearch bfs = new BreadthFirstSearch();
		bfs.processBFS();
	}
	
	public void processBFS()
	{
		GraphCreation gc1 = new GraphCreation();
		GraphCreation sg = gc1.wholeGraph();
		
		NodeGraph[] allNodes = new NodeGraph[6];
		allNodes = sg.getGraphNodes();
		
		NodeGraph ng = allNodes[0];
		getExeOrder(ng);
	}
	int nodesCount=0;
	public void getExeOrder(NodeGraph ng)
	{
		if(ng.value!=null && nodesCount < 6)
		{
			if(!ng.visited)
			{
				System.out.println(ng.value);
				nodesCount++;
				ng.visited = true;
			}
			NodeGraph ch[] = ng.adjacent;
			if(ch != null)
			{
				for(int i=0;i<ch.length;i++)
				{
					if(!ch[i].visited)
					{
						System.out.println(ch[i].value);
						nodesCount++;
						ch[i].visited = true;
					}
				}
				for(int i=0;i<ch.length;i++)
				{
					getExeOrder(ch[i]);
				}
			}
		}
	}
}