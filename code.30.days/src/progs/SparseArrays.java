package progs;

import java.util.Scanner;

public class SparseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int no = a.nextInt();
		
		String[] array = new String[no];
		for(int i=0;i<no;i++)
		{
			array[i] = a.next();
		}
		
		int no2 = a.nextInt();
		String[] array2 = new String[no2];
		for(int i=0;i<no2;i++)
		{
			array2[i] = a.next();
		}
		
		int out[] = new int[no2];
		for(int k=0;k<no2;k++)
		{
			for(int i=0;i<no;i++)
			{
				if(array[i].equals(array2[k]))
				{
					out[k]++;
				}
			}
		}
		
		for(int i=0;i<no2;i++)
		{
			System.out.println(out[i]);
		}
		
	}

}
