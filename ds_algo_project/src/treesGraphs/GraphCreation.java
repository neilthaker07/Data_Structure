package treesGraphs;

public class GraphCreation {

	public NodeGraph[] graphNodes;

	public NodeGraph[] getGraphNodes() {
		return graphNodes;
	}

	public void setGraphNodes(NodeGraph[] graphNodes) {
		this.graphNodes = graphNodes;
	}
	
	public GraphCreation wholeGraph()
	{
		NodeGraph ng1 = new NodeGraph();
		NodeGraph ng2 = new NodeGraph();
		NodeGraph ng3 = new NodeGraph();
		NodeGraph ng4 = new NodeGraph();
		NodeGraph ng5 = new NodeGraph();
		NodeGraph ng6 = new NodeGraph();
		
		ng1.value=1;
		ng2.value=2;
		ng3.value=3;
		ng4.value=4;
		ng5.value=5;
		ng6.value=6;
		
		NodeGraph[] c1 = new NodeGraph[]{ng2,ng5,ng6};
		NodeGraph[] c2 = new NodeGraph[]{ng4,ng5};
		NodeGraph[] c3 = new NodeGraph[]{ng2};
		NodeGraph[] c4 = new NodeGraph[]{ng3,ng5};
		
		ng1.adjacent = c1;
		ng2.adjacent = c2;
		ng3.adjacent = c3;
		ng4.adjacent = c4;
		
		NodeGraph[] allNodes = new NodeGraph[]{ng1,ng2,ng3,ng4,ng5,ng6};
		
		GraphCreation gc = new GraphCreation();
		gc.setGraphNodes(allNodes);
		return gc;
	}
}
