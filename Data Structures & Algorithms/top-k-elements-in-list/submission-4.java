class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>(); 


        // Add every number
        for(int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // then filter the ones occuring n times
        return freqMap.entrySet()
                .stream()
                .sorted((a,b) -> b.getValue() - a.getValue()) // sort map on value in descending
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray(); 


    }
}
