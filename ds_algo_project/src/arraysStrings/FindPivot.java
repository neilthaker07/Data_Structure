package arraysStrings;

public class FindPivot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[]{2,4,9,6,5,3,7};
		
		int leftSum = 0;
		for(int i = 0;i<a.length;i++)
		{
			int rightSum = 0;
			
			for(int j=i+1;j<a.length;j++)
			{
				/*if(rightSum > leftSum)
				{
					break;
				}*/
				rightSum+=a[j];
			}
			if(rightSum == leftSum)
			{
				System.out.println("yes pos: "+i);
			}
			leftSum+=a[i];
		}
		
	}

}
