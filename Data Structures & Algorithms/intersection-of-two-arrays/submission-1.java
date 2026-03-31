class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> seen = new HashSet<>(); 
        
        for(int num: nums1) seen.add(num);

        Set<Integer> result = new HashSet<>();

        for(int num: nums2) {
            if(seen.contains(num)) result.add(num);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    
    }
}