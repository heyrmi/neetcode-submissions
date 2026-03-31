class Solution {
    public int candy(int[] ratings) {
               int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1); // baseline: every child gets at least one candy

        // Left-to-right: if a child rates higher than their left neighbor,
        // give them one more candy than that neighbor.
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right-to-left: if a child rates higher than their right neighbor,
        // they need at least one more candy than that neighbor.
        // Use max() to keep the higher value from the left-to-right pass.
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int total = 0;
        for (int candy : candies)
            total += candy;

        return total;

    }
}