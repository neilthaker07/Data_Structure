package linkedListEx;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k[] = new int[2];
		k[0]=1;
		k[1]=2;
		for(int i=0;i<2;i++)
		{
			System.out.println(k[i]);
		}
		
		int l[] = k;
		k = new int[5];
		for(int i=0;i<l.length;i++)
		{
			k[i] = l[i];
		}

		for(int i=0;i<2;i++)
		{
			System.out.println(k[i]);
		}
		/*
		for(int i=0;i<k.length;i++)
		{
			System.out.println(k[i]);
		}*/
		
	}
}