package sortingSearching;

public class Ch10No10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ch10No10 c = new Ch10No10();
		c.track(4);
		c.track(1);
		c.track(5);
		c.track(7);
		c.track(9);
		c.track(3);
	}
	
	public void track(int n)
	{
		if(root==null)
		{
			root = new RankNode(n);
		}
		else
		{
			root.insert(n);
		}
	}
	
	public int getRank(int no)
	{
		return root.getRank(no);
	}
	
	
	RankNode root = null;
	class RankNode 
	{
		public int left_size=0;
		public RankNode left, right;
		public int data=0;
		public RankNode(int d)
		{
			data=d;
		}
		public void insert(int d)
		{
			if(d<=data)
			{
				if(left!=null) left.insert(d);
				else left = new RankNode(d);
				left_size++;
			}
			else
			{
				if(right!=null) right.insert(d);
				else right = new RankNode(d);
			}
		}
		
		public int getRank(int d)
		{
			if(d==data)
			{
				return left_size;
			}
			else if(d<data)
			{
				if(left==null) return -1;
				else return left.getRank(d);
			}
			else
			{
				int right_rank = right==null ? -1 : right.getRank(d);
				if(right_rank==-1) return -1;
				else return left_size + 1 + right_rank;
			}
		}
	}
}
