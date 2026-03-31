class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // Sort by frequency and then limit by k and return top k
        int[] result = freqMap.entrySet().stream().sorted((a, b)-> b.getValue() - a.getValue()).limit(k).mapToInt(Map.Entry::getKey).toArray();
        return result;
    }
}
