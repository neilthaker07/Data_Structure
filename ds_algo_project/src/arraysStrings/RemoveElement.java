package arraysStrings;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[]{2, 3, 3, 2, 1, 1, 3, 2};
		int m = 3;
		int n=a.length;
		
		int i=0;
		while(i<n)
		{
			if(a[i]==m)
			{
				a[i]=a[n-1];
				n--;
			}
			else
			{
				i++;
			}
			
		}
		
		//System.out.println(i);
		for(int k = 0;k<i;k++)
		{
			System.out.print(a[k]+" ");
		}
	}
}
