class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>(); 
        Arrays.sort(nums);
        int n = nums.length; 

        for(int i = 0; i < n - 3; i++) {
            // skip duplicate for the first element 
            if(i > 0 && nums[i] == nums[i-1]) continue; 

            for(int j = i + 1; j < n - 2; j++) {
                // Skip duplicate for the 2nd element 
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                int low = j + 1; 
                int high = n - 1; 

                long remaining  = (long) target - nums[i] - nums[j];

                while(low < high) {
                    long sum = nums[low] + nums[high];

                    if(sum < remaining) {
                        low++; 
                    } else if(sum > remaining) {
                        high--;
                    } else {
                        // found quadruplet
                        result.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));

                        while(low < high && nums[low] == nums[low + 1]) low++; 
                        while(low < high && nums[high] == nums[high - 1]) high--;

                        low++; 
                        high--;  
                    }
                }
            }
        }

        return result;
    }
}