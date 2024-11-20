package backoffice;

public class BuySell {

	
	    public int maxProfit(int[] prices) {
	        int buyPrice = prices[0];
	        int profit = 0;

	        for (int i = 1; i < prices.length; i++) {
	            if (buyPrice > prices[i]) {
	                buyPrice = prices[i];
	            }

	            profit = Math.max(profit, prices[i] - buyPrice);
	        }

	        return profit;        
	    }
	
	
	
	public static void main(String[] args) {
	
		BuySell obj =new BuySell();
		int num[] = {7,1,5};
		System.out.println(obj.maxProfit(num));

	}

}
