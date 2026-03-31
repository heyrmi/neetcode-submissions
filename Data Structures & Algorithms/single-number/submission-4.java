class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // int result;
        // for(int num: nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }


        // for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
        //     if(entry.getValue() == 1) {
        //         return entry.getKey();
        //     }
        // }
        // return -1; 

        // Set<Integer> set = new HashSet<>(); 

        // for(int num: nums) {
        //     if(!set.add(num)) { // add return false if already present
        //         set.remove(num);
        //     }
        // }

        // return set.iterator().next(); 

        int result = 0; 
        for(int num: nums) {
            result ^= num;
        }
        return result;
    }
}
