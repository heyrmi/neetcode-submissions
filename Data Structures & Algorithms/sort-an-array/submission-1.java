class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int low, int high) {
        if (low >= high)
            return;

        int pivotIndex = partition(nums, low, high);

        quickSort(nums, low, pivotIndex - 1);
        quickSort(nums, pivotIndex + 1, high);
    }

    // Rearrranges array: element < pivot | pivot | element >= pivot
    private int partition(int[] nums, int low, int high) {
        // choose last element as our pivot
        int pivot = nums[high];

        // represents position where the next element smaller than pivot should be placed
        int i = low;

        for (int j = low; j < high; j++) {
            if (nums[j] < pivot) {
                // move smaller number to smaller than pivot section
                swap(nums, i, j);
                // smaller than pivot grows by 1 position
                i++;
            }
        }
        //  At this point: [elements < pivot][elements >= pivot][pivot] so put pivot at index i
        swap(nums, i, high);
        return i;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}