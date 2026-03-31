class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0; 
        int maxSum = Integer.MIN_VALUE;

        for (int num: nums) {
            // running sum 
            currentSum += num;

            //maxSum 
            maxSum = Math.max(maxSum, currentSum);

            // if the sum drops below 0, drop it and start sub array from next index
            if(currentSum < 0) 
                currentSum = 0;
        }
        return maxSum;
    }
}
