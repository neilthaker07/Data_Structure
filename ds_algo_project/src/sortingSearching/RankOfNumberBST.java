package sortingSearching;

public class RankOfNumberBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RankOfNumberBST a = new RankOfNumberBST();

		a.add(5);
		a.add(3);
		a.add(1);
		a.add(2);
		
		a.root.inOrder(a.root);
	}
	
	public void add(int n)
	{
		RankBST rb = new RankBST();
		rb.no = n;
		bstAddNode(n, rb);
	}

	public void bstAddNode(int n, RankBST rb) 
	{
		if(root == null)
		{
			root = rb;
		}
		else
		{
			if(n == root.no)
			{
				root.counts++;
			}
			else if(n < root.no)
			{
				root = root.left;
				bstAddNode(n, root);
			}
			else if(n > root.no)
			{
				root = root.right;
				bstAddNode(n, root);
			}
		}
	}
	
	RankBST root ;
	class RankBST
	{
		int no = 0;
		RankBST left = null;
		RankBST right = null;
		int counts = 1;
		
		public RankBST() {
			// TODO Auto-generated constructor stub
		}
		
/*		public String toString()
		{
			StringBuilder sb = new StringBuilder();
			return sb.toString();
		}*/

		int countt = 0;
		private void inOrder(RankBST rb) 
		{
			if(rb != null && countt < 4)
			{
				if(rb.left!=null)
				{
					inOrder(rb.left);
				}
				System.out.println(rb.no);
				countt++;
				if(rb.right!=null)
				{
					inOrder(rb.right);
				}
			}
		}
	}
}
