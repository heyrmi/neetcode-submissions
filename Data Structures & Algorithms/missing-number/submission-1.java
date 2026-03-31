class Solution {
    public int missingNumber(int[] nums) {
        int numsSum = 0;
        int realSum = 0;
        int length = nums.length;

        for(int num: nums) {
            numsSum += num;
        }

        for(int i = 0; i <= length; i++) {
            realSum += i;
        }

        return realSum - numsSum;
    }
}
