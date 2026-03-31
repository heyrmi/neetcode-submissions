class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // Lets sort the array first
        Arrays.sort(nums);

        // Lets loop from 0 to nums.length - 2
        for(int i=0; i<nums.length - 2; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;

            // if the first value if +ve then we will not get any match
            if(nums[i]> 0) break;
            int left = i+1; 
            int right = nums.length - 1; 

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum ==0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the second element
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for the third element
                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } else if(sum> 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return result;
    }
}
