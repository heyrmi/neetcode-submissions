class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1; 

        while(low <= high) {
            int mid = low + (high - low) / 2; 

            if(nums[mid] == target) return mid; 

            // left half is sorted
            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target < nums[mid]) 
                    high = mid - 1; // target is in the sorted left half
                else 
                    low = mid + 1; // target is in the right half
            } 
            // Right half is sorted
            else {
                if(nums[mid] < target && target <= nums[high])
                    low = mid + 1; // target is in the sorted right half
                else 
                    high = mid - 1; // target is in the left half
            }
        }

        return -1;
    }
}
