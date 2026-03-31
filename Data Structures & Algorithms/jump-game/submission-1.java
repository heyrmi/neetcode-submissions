class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0; 

        for(int i = 0; i < nums.length; i++) {
            // check if we can still move
            if(i > maxReach) return false; // no jumps left
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true; 
    }
}
