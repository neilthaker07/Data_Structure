package progs;

public class BuyStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	public int maxProfitPart2(int[] prices) {

		int maxprofit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1])
				maxprofit += prices[i] - prices[i - 1];
		}
		return maxprofit;
	}
	
	public int maxProfitPart1(int[] prices) {

		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minprice)
				minprice = prices[i];
			else if (prices[i] - minprice > maxprofit)
				maxprofit = prices[i] - minprice;
		}

		return maxprofit;

	}
	
	
	// DP
	public int maxProfitPart3(int[] prices) {
		
		int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        int release1 = 0, release2 = 0;
        
        for(int i:prices){                              // Assume we only have 0 money at first
            
        	release2 = Math.max(release2, hold2+i);     // The maximum if we've just sold 2nd stock so far.
            hold2    = Math.max(hold2,    release1-i);  // The maximum if we've just buy  2nd stock so far.
            
            release1 = Math.max(release1, hold1+i);     // The maximum if we've just sold 1nd stock so far.
            hold1    = Math.max(hold1,    -i);          // The maximum if we've just buy  1st stock so far. 
        }
        return release2; ///Since release1 is initiated as 0, so release2 will always higher than release1.
	}
	
	// DP
	public int maxProfitTranPart4(int[] prices, int fee) {
		int cash = 0, hold = -prices[0];
		for (int i = 1; i < prices.length; i++) {
			cash = Math.max(cash, hold + prices[i] - fee);
			hold = Math.max(hold, cash - prices[i]);
		}
		return cash;
	}
	
}
