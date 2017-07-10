package sortingSearching;

public class MaxHeapify {

	public static void main(String[] args) {

		MaxHeapify a = new MaxHeapify();
		a.maxHeapify();
	}
	int[] array = new int[]{0,9,1,5,4,3,2,8};
	HeapTree root=null;
	HeapTree node=null;
	
	public void maxHeapify()
	{
		createBinaryTree();
	}

	private void createBinaryTree() 
	{
		for(int i=1;i<array.length/2;i++)
		{
			if(root==null)
			{
				root = new HeapTree(array[i]);
				root.index = i;
				root.left = new HeapTree(array[2*i]);
				root.left.index = 2*i;
				root.right = new HeapTree(array[(i*2)+1]);
				root.left.index = (2*i)+1;
				node = root;
			}
			else
			{
				node.index = i;
				node.left = new HeapTree(array[2*i]);
				node.right = new HeapTree(array[(i*2)+1]);
			}
		}
		
		print(root);
	}

	private void print(HeapTree node) 
	{
		if(node.left != null)
		{
			print(node.left);
		}
		
		System.out.println(node.data);
		
		if(node.right!=null)
		{
			print(node.right);
		}
	}

}
class HeapTree
{
	HeapTree(int data)
	{
		this.data = data;
	}
	public int data;
	public int index;
	public HeapTree left;
	public HeapTree right;
	
	/*public HeapTree getNode(int index)
	{
		//return 
	}*/
}