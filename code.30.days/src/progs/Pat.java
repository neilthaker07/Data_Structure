package progs;

public class Pat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int first = 615;
		int offset = 8;
		int a[][] = new int[25][45];
		for(int i=0;i<25;i++)
		{
			int count = 1;
			for(int j=0;j<45;j++)
			{
				if(i==0)
				{
					a[i][j] = first;
					if(count%3!=0)
					{
						first += 15;
					}
					else
					{
						first += 70;
					}
					
				}
				else
				{
					a[i][j] = first+offset;
					if(count%3!=0)
					{
						first += 15;
					}
					else
					{
						first += 70;
					}
					
				}
				offset += 8;
				count++;
			}
			
			count = 1;
			
		}
		
		for(int i=0;i<25;i++)
		{
			for(int j=0;j<45;j++)
			{
				System.out.print(a[i][j]+" , ");
			}
			System.out.println();
			System.out.println();
		}
		
	}

}
