class Solution {
    public int removeDuplicates(int[] nums) {
        // Safety check
        if (nums.length == 0 ) return 0;

        int lastUniqueIndex = 0;

        for(int current=1; current<nums.length; current++) {
            if(nums[current] != nums[lastUniqueIndex]) {
                lastUniqueIndex++;
                nums[lastUniqueIndex] = nums[current];
            }
        } 
        // Since slow is an index thus return slow + 1 for the answer
        return lastUniqueIndex + 1;
    }
}