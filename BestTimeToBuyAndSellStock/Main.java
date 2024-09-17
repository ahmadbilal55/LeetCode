package BestTimeToBuyAndSellStock;


public class Main {
    public static void main(String[] args) {
        int[] prices = new int[]{3, 2, 6, 5, 0, 3};
        int maxProfit = new Solution().maxProfit(prices);
        System.out.println("The max profit is " + maxProfit);
    }
}
