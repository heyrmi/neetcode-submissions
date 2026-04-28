class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length -1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while(left <= right) {
            if(leftMax <= rightMax) {
                // process left side
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
                left++;
            } else {
                // process right side
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }
        }

        return water; 
    }
}
