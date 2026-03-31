class Solution {
    public boolean canJump(int[] nums) {
        int maximumReach = 0; 
        for(int i=0; i<nums.length; i++) {
            if(i > maximumReach) return false; // we are stranded here
            // index on which you are standing + how far we are allowed to go
            int currentReach = i + nums[i];
            maximumReach = Math.max(maximumReach, currentReach); 
        }
        return true;
    }
}
