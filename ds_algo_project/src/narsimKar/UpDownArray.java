package narsimKar;

public class UpDownArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find k : 9 > k-1, >k+1 : logn
		//int a[] = new int[]{1,2,4,5,6,8,9,3,2};
		int a[] = new int[]{6,8,4,3,2,1};
		
		int left = 0;
		int right = a.length-1;
		while(left<=right)
		{
			int mid = (left + right) / 2;
			if(a[mid]>a[mid+1] && a[mid]>a[mid-1])
			{
				System.out.println("BANG : "+ a[mid]);
				break;
			}
			else if(a[mid]<a[mid+1])
			{
				left = mid+1;
			}
			else if(a[mid]>a[mid+1])
			{
				right = mid-1;
			}
		}
		
		/*for(int i=1;i<1000;i++)
		{
			System.out.println("rule '"+i+"' when productObject: Product(type=='diamond') then	productObject.setDiscount(500); end");
		}*/
		
	}
}
