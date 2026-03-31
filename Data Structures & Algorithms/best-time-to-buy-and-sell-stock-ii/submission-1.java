class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 1; i < prices.length; i++) {
            // collect all the positives
            if(prices[i] > prices[i-1]) {
                profit+= (prices[i] - prices[i-1]);
            }
            // ignore all the negatives
        }
        // return the profit gained by all positives
        return profit;
    }
}