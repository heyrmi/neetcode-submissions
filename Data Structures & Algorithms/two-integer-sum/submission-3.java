class Solution {
    public int[] twoSum(int[] nums, int target) {
        // We will store the number, index in the hashmap
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                ans[0] = map.get(diff);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
