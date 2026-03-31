class Solution {
    public int search(int[] nums, int target) {
        int low =0, high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) / 2; 

            if(nums[mid] == target) {
                return mid;
            }

            // Lets determine which part of array is sorted
            if(nums[low] <= nums[mid]) {
                // left half [low .. mid] is sorted
                if(target >= nums[low] && target < nums[mid]) {
                    // target falls into sorted left half
                    high = mid - 1;
                } else {
                    // target can be in the right half
                    low = mid + 1;
                }
            } else {
                // right part of the array is sorted
                if(target > nums[mid] && target <= nums[high]) {
                    // target is definitely in the sorted right half
                    low = mid + 1; 
                } else {
                    // target can be in the left half
                    high = mid - 1;
                }
            }
        }  

        return -1;          
    }
}
