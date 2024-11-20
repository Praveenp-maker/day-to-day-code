package logics;

import java.util.Arrays;

public class minCoin {

	public int coinChange(int[] coins, int amount) {
        int[] minCoins = new int[amount + 1];
        Arrays.fill(minCoins, amount + 1);
        minCoins[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
            	System.out.println("i,j=>"+ i +" "+ j);
                if (i - coins[j] >= 0) {
                    minCoins[i] = Math.min(minCoins[i], 1 + minCoins[i - coins[j]]);
              System.out.println( "   minCoins[i]"+ minCoins[i]);
                }
            }
        }

        return minCoins[amount] != amount + 1 ? minCoins[amount] : -1;        
    }

	
	
	public static void main(String[] args) {

		
		minCoin obj =new minCoin();
		
		
		int arr[] = {1,2,5,10};
		
		int target =11;
		
		
		System.out.println(obj.coinChange(arr, target));

	}

}
