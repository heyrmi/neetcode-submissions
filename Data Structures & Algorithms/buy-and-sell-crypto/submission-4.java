class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for(int price: prices) {
            // calculcate min price for each instance
            // minPrice = Math.min(minPrice, price);
            if(price < minPrice) {
                minPrice = price;
            }
            // calculate maxProfit for each instance 
            // maxProfit = Math.max(maxProfit, price - minPrice);
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
