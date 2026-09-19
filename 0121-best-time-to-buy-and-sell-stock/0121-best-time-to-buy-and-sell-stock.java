class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;

        int max_profit = 0;
        int buy = Integer.MAX_VALUE;

        for(int price : prices) {
            buy = Math.min(price,buy);
            max_profit = Math.max(price-buy,max_profit);
        }

        return max_profit;
    }
}