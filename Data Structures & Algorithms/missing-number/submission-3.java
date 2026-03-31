class Solution {
    public int missingNumber(int[] nums) {
        int numsSum = 0;
        int totalSum = 0;

        // Find the total sum
        for (int i = 0; i <= nums.length; i++) {
            totalSum += i;
        }

        // Find the sum of values in nums
        for (int num : nums) {
            numsSum += num;
        }

        return totalSum - numsSum;
    }
}
