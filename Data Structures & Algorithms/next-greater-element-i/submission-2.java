class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        // this is being used to store the next greater element 
        // 1 -> 3, 3 -> 4
        Map<Integer, Integer> nge = new HashMap<>(); 

        for(int num: nums2) {
            // Pop all elements smaller than current
            while(!stack.isEmpty() && num > stack.peek()) {
                nge.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Anything still in the stack has no greter element so we add -1 to them
        int[] result = new int[nums1.length];

        for(int i = 0; i<nums1.length; i++) {
            result[i] = nge.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}