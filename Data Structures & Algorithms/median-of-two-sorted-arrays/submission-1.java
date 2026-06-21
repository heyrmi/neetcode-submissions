class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Always binary search on the shorter array
        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;
        int half = (m + n + 1) / 2;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = half - cut1;

            int maxLeft1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int minRight1 = (cut1 == m) ? Integer.MAX_VALUE : nums1[cut1];
            int maxLeft2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int minRight2 = (cut2 == n) ? Integer.MAX_VALUE : nums2[cut2];

            if (maxLeft1 > minRight2) {
                high = cut1 - 1; // cut1 too far right
            } else if (maxLeft2 > minRight1) {
                low = cut1 + 1; // cut1 too far left
            } else {
                // Valid partition
                int leftMax = Math.max(maxLeft1, maxLeft2);
                if ((m + n) % 2 == 1)
                    return leftMax;
                int rightMin = Math.min(minRight1, minRight2);
                return (leftMax + rightMin) / 2.0;
            }
        }
        return 0.0; // unreachable for valid inputs
    }
}
