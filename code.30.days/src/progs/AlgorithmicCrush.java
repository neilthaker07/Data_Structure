package progs;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmicCrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		int processArraySize = a.nextInt();
		int inputs = a.nextInt();

		long useful[] = new long[inputs * 3];

		for (int j = 0; j < useful.length; j++) 
		{
			useful[j] = a.nextInt();
		}
		
		
		long op[] = new long[processArraySize];
		int count = 0;
		for(int i=0;i<inputs;i++)
		{
			long a1= useful[count];
			count++;
			long a2= useful[count];
			count++;
			long a3= useful[count];
			count++;
			for(long j=a1-1;j<=a2-1;j++)
			{
				op[(int) j] += a3;
			}
		}
		
		Arrays.sort(op);
		System.out.print(op[op.length-1]);
	}
}
