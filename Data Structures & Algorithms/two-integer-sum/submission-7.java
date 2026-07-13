class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Stores: number -> index where we have already seen that number.
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            // The number we need to pair with the current number
            // to reach the target.
            int complement = target - num;

            // If we've already seen the complement, we have found
            // the two numbers whose sum equals the target.
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Remember the current number so future elements can use it
            // as their complement.
            map.put(num, i);
        }

        // Problem guarantees a solution, but this keeps the compiler happy.
        return new int[] {};
    }
}