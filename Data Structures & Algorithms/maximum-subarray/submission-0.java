class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length; 
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            int currentSum = 0;
            for(int j = i; j < n; j++) {
                currentSum += nums[j];
                maxSum = Math.max(currentSum, maxSum);
            }
        }
        return maxSum;
    }
}
