class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length; 
        // formula for summation of n numbers is n * (n+1) / 2
        int expectedSum = n * (n+1) / 2;
        int actualSum = 0;

        for(int num: nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
