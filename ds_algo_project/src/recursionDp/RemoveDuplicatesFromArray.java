package recursionDp;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoveDuplicatesFromArray a = new RemoveDuplicatesFromArray();
		a.process();
		System.out.println(Arrays.toString(a.array));
	}
	String array[] = new String[]{"abc","acb","bac","bca","bac","cab"};
	
	public void process()
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					array[j] =null;
				}
			}
		}
	}
}
