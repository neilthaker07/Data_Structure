package arraysProgs;

import java.util.ArrayList;

public class FlattenNestedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] a = new Object[3];
		a[0]=1;
		a[1]=new Object[]{5,6};
		a[2]=new Object[]{a[1],7};
		
		Object[] e = flattenArray(a);
		for(Object e2 : e)
		{
			System.out.print(e2+" ");
		}
	}
	
	public static Object[] flattenArray(Object[] a)
	{
		return recursiveFun(a, new ArrayList<Integer>());
	}
	
	public static Object[] recursiveFun(Object[] input, ArrayList<Integer> output)
	{
		for(int i = 0; i<input.length;i++)
		{
			if(input[i] instanceof Integer)
			{
				output.add((Integer) input[i]);
			}
			else
			{
				Object x[] = (Object[]) input[i];
				
				recursiveFun(x, output);
			}
		}
		return output.toArray();
	}

}
