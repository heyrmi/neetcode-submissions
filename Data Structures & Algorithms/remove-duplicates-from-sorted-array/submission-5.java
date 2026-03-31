class Solution {
    public int removeDuplicates(int[] nums) {
        // lets start from 1 and look on the left side 
        // if the value maches its duplicate
        // if it does not matches then we are seeing it for the first time. 
        int left = 1; 

        for(int right = 1; right < nums.length; right++) {
            if(nums[right] != nums[left - 1]) {
                nums[left] = nums[right];
                left++;
            }
        }  

        return left;
    }
}