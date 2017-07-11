package recursionDp;

public class MagicIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MagicIndex mp = new MagicIndex();
		System.out.println(mp.isMagicAvailable());
	}

	int array[] = new int[]{-5,-2,-1,0,3,5};
	
	public boolean isMagicAvailable()
	{
		if(array[0] > 0)
		{
			return false;
		}
		else if(array[0]==0)
		{
			return true;
		}
		return recursive(0,array.length-1);
	}

	private boolean recursive(int l, int r) 
	{
		int mid = (l+r) / 2;
		if(l>r)
		{
			return false;
		}
		
		if(array[mid]==mid)
		{
			return true;
		}
		else if(array[mid] > mid)
		{
			return recursive(l, mid-1); 
		}
		else if(array[mid] < mid)
		{
			return recursive(mid+1, r);
		}
		else
		{
			for(int j=l;j<r;j++)
			{
				if(array[j] == j)
				{
					return true;
				}
			}
		}
		return false;
	}
}