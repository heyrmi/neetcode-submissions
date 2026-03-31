class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0; 
        }
        int left = 0;
        int right = nums.length -1; 
        int valToRemove = val;
        int count = 0;

        while (left <= right) {
            if(nums[left] != valToRemove) {
                left++;
                count++;
            }
            else if (nums[left] == valToRemove) {
                int temp = nums[right];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
        return count;  
    }
}