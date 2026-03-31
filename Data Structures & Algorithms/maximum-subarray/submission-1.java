class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int num: nums) {
            // add nums to running sum
            currentSum += num;
            // find the maxSum
            maxSum = Math.max(currentSum, maxSum);

            // if the sum drops below 0 drop it and start the subarray from next index
            if(currentSum < 0) 
                currentSum = 0;
            
        }
        return maxSum;
    }
}
