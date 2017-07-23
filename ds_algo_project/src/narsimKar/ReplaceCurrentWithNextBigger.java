package narsimKar;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReplaceCurrentWithNextBigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[] = new int[]{3,1,6,2,8,7};
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=0;i<n.length;i++)
		{
			if(q.isEmpty() || q.peek()>n[i])
			{
				q.add(n[i]);
			}
			else
			{
				int temp = q.size();
				int op = n[i];
				int c = i-1;
				for(int j=0;j<temp;j++)
				{
					n[c] = op;
					c--;
					q.remove();
				}
				q.add(n[i]);
			}
		}
		
		System.out.println(Arrays.toString(n));
		
	}

}
