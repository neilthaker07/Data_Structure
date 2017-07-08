package sortingSearching;

public class RankOfNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RankOfNumberArray a = new RankOfNumberArray();
		System.out.println(a.getRank(7));
	}
	int array[] = new int[]{5,4,2,2,3,1,5,9,8};
	
	int c=0;
	boolean increase= false;
	
	public int getRank(int search)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<search || (increase && array[i]==search))
			{
				c++;
			}
			else if(array[i]==search)
			{
				increase = true;
			}
		}
		return c;
	}
}
