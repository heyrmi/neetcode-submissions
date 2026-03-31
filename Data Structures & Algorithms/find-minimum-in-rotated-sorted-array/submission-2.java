class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while(low < high) {
            int mid = low + (high - low) / 2; 

            if(nums[mid] > nums[high]) {
                // Min is in the right half (exluding mid)
                low = mid + 1; 
            } else {
                // Min is in the left half
                high = mid; 
            }
        }
        return nums[high];
    }
}
