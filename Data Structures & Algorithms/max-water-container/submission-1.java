class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1; 
        int maxArea = Integer.MIN_VALUE;

        while(left < right) {
            // area = width (indexes) * min (left, right) heights
            int width = right - left; 
            int minHeight = Math.min(heights[left], heights[right]);
            
            int area = width * minHeight;

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }

            maxArea = Math.max(maxArea, area);
        }

        return maxArea; 
    }
}
