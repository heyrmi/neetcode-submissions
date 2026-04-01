class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1 Detect cycle 
        int slow = nums[0];
        int fast = nums[0];
        
        // Loop 1: chase until collision
        do {
            slow = nums[slow];          // jump once
            fast = nums[nums[fast]];    // jump twice
        } while(slow != fast);

        // Loop 2: find exact entry 
        slow = nums[0];  // reset slow only
        while(slow != fast) {
            slow = nums[slow]; // both jump once
            fast = nums[fast];
        }

        return slow; 
    }
}
