class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length -1);
    }

    private void quickSort(int[] nums, int low, int high) {
        if(low >= high) return;
        
        int pivotIndex = partition(nums, low, high);
        quickSort(nums, low, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, high);
    }

    private int partition(int[] nums, int low, int high) {
        int pivot = nums[high];
        int i = low; 

        for(int j=low; j<high; j++) {
            if(nums[j] < pivot) {
                swap(nums, i, j);
                i++;
            }
        }

        swap(nums, i, high);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}