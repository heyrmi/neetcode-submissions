class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        lowest_price = prices[0]
        max_profit = 0

        for curr_price in prices:
            if curr_price < lowest_price:
                lowest_price = curr_price
            max_profit = max(max_profit, curr_price - lowest_price)
        return max_profit