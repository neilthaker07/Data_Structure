package arraysStrings;

public class LongContinuousSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = new int[]{1};
		int maxSeq = 1;
		
		if(a.length ==0)
		{
			maxSeq = 0;
		}
		
		if(a.length == 1)
		{
			maxSeq = 1;
		}
		int op = 0;
		
		int temp = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(temp<a[i])
			{
				maxSeq++;
				temp = a[i];
			}
			else
			{
				temp = a[i];
				maxSeq=1;
			}
			
			if(op<maxSeq)
			{
				op = maxSeq;
			}
		}
		
		System.out.println(op);
		
	}

}
