package progs;

public class BuyStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int maxprofit = 0;
		int[] prices =new int[]{3,4,6,4,3,2,99,90,88};
		
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        System.out.println(maxprofit);
		
		
	}

}
