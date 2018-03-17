package progs;

public class FlowerBed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canPlaceFlowers(new int[]{1,0,1,0,0}, 1));
	}
	
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		
		int count = 0;

		for(int i=0;i<flowerbed.length && count<n ;i++)
		{
			int prev = (i==0) ? 0 : flowerbed[i-1];
			int next = (i==flowerbed.length-1) ? 0 : flowerbed[i+1]; 
			if(flowerbed[i] == 0) {
				if(prev ==0 && next ==0)
				{
					flowerbed[i] = 1;
					count++;
				}
			}
		}
		
		
		return count == n ;
	}

}
