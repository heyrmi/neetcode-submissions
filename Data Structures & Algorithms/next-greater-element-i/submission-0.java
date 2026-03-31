class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for(int i = 0; i<nums1.length; i++) {
            // Step 1: Find nums1[i] in nums2
            int j = 0; 
            while(nums2[j] != nums1[i]) { 
                j++;
            }

            // Step 2: Find the next greater element from jth location
            result[i] = -1; // default value if no greater element is present
            for(int k = j; k < nums2.length; k++) {
                if(nums2[k] > nums1[i]) {
                    result[i] = nums2[k];
                    break;
                }
            }
        }
        return result;
    }
}