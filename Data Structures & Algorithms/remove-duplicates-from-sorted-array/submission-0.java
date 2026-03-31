class Solution {
    public int removeDuplicates(int[] nums) {
        // Safety check
        if (nums.length == 0 ) return 0;

        int slow = 0;

        for(int fast=0; fast<nums.length; fast++) {
            if(nums[fast] != nums[slow]) {
                slow++;
            }
            nums[slow] = nums[fast];
            
        } 
        // Since slow is an index thus return slow + 1 for the answer
        return slow + 1;
    }
}