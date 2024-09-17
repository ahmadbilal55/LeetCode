package BestTimeToBuyAndSellStock;

public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1)
            return 0;
        int buyingPrice = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buyingPrice > prices[i]) {
                buyingPrice = prices[i];

            }
            maxProfit = Math.max(prices[i] - buyingPrice, maxProfit);
        }
        return maxProfit;
    }
}
