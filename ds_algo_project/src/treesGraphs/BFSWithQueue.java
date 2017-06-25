package treesGraphs;

import stackQueue.MyQueue;

public class BFSWithQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFSWithQueue bfs = new BFSWithQueue();
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
	public void getExeOrder(NodeGraph ng)
	{
		MyQueue<NodeGraph> mq = new MyQueue<NodeGraph>();
		ng.visited = true;
		mq.add(ng);
		
		while(!mq.isNull())
		{
			NodeGraph ntemp = mq.remove();
			System.out.println(ntemp.value);
			if(ntemp.adjacent != null)
			{
				for(NodeGraph nngg : ntemp.adjacent)
				{
					if(!nngg.visited)
					{
						nngg.visited = true;
						mq.add(nngg);
					}
				}
			}
		}
	}
}
