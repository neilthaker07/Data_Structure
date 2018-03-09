package arraysStrings;

public class LargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[]{3,3,6,1,0};

		int largest = 0;
		int pos = 0;
		for(int i=0;i<a.length;i++)
		{
			if(largest < a[i] )
			{
				largest = a[i];
				pos = i;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(pos != i && largest < a[i]*2)
			{
				System.out.println(-1);
				break;
			}
		}
		
		System.out.println("every time "+1);
		
	}

}
