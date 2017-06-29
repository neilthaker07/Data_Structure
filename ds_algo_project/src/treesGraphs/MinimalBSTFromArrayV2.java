package treesGraphs;

public class MinimalBSTFromArrayV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = new int[]{1,2,3,4,5,6,7};
		
		MinimalBSTFromArrayV2 bs = new MinimalBSTFromArrayV2();
		Node h = bs.createTree(array,0,array.length-1);
		System.out.println(h.value);
		System.out.println(h.leftChild.value);
	}
	
	// O(n) : create tree along while selecting nodes left and right child.
	
	public Node createTree(int[] a, int s, int e) 
	{
		if(e<s)
		{
			return null;
		}
		int mid = (s+e)/2;
		Node n = new Node();
		n.setValue(a[mid]);
		
		n.leftChild = createTree(a,s,mid-1);
		n.rightChild = createTree(a, mid+1, e);
		
		return n;
	}
}
