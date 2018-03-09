package progs;

public class ReshapeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] nums = new int[2][2];
		nums[0][0] = 1;
		nums[0][1] = 2;
		nums[1][0] = 3;
		nums[1][1] = 4;
		
		System.out.println();
		int r = 2;
		int c = 2;
		
		int sum = 0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i].length;
		}
		System.out.println(sum);

		if(r*c==sum)
		{
			int[][] op = new int[r][c];
			int i1=0,i2=0;
			for(int i=0;i<nums.length;i++)
			{
				for(int j=0;j<nums[i].length;j++)
				{
					op[i1][i2] = nums[i][j];

					if( (i2+1) % c == 0 )
					{
						i1++;
						i2=0;
					}
					else
					{
						i2++;
					}
					
				}
			}
			for(int k=0;k<op.length;k++)
			{
				for(int h=0;h<op[k].length;h++)
				{
					System.out.print(op[k][h]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println(nums);
		}
	}
	
}
