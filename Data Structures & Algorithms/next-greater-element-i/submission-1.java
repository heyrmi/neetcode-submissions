class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        Map<Integer, Integer> ngeMap = new HashMap<>();

        // Step 1: Add all the next greater element to the map using stack
        for(int num: nums2) {
            // But also remove it
            while(!stack.isEmpty() && num > stack.peek()) {
                ngeMap.put(stack.pop(), num);
            }
            // Add to stack 
            stack.push(num);
        }

        // Now all elements remaining in stack does not have any next greater element
        int[] result = new int[nums1.length];
        for(int i=0; i<nums1.length; i++) {
            result[i] = ngeMap.getOrDefault(nums1[i], -1);
        }
        return result;
    }
}