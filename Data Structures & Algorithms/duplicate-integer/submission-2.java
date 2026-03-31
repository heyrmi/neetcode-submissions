class Solution {
    public boolean hasDuplicate(int[] nums) {
        // use set
        Set<Integer> set = new HashSet<>();

        for(int num: nums) {
            if(set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        // if no duplicate found return true
        return false;
    }
}