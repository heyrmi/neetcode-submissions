class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length -1); 
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if(low >= high) return;

        int pivotIndex = partition(nums, low, high);

        // since the pivot is in correct place 
        quickSort(nums, low, pivotIndex-1);
        quickSort(nums, pivotIndex + 1, high);
    }
    
    private int partition(int[] nums, int low, int high) {
        // picking the last value as pivot
        int pivot = nums[high];
        int i = low;

        for(int j = low; j<high; j++) {
            // swap smaller values then pivot to the left
            if(nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        } 

        // swap the pivot element too
        swap(nums, i, high);
        return i;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}