class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        // for(int num: nums) {
        //     freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        // }
        // // Sort by frequency and then limit by k and return top k
        // int[] result = freqMap.entrySet().stream().sorted((a, b)-> b.getValue() - a.getValue()).limit(k).mapToInt(Map.Entry::getKey).toArray();
        // return result;

        for(int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // heap with sorting based on the value of map that too in descending
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        heap.addAll(freqMap.entrySet());

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = heap.poll().getKey();
        }
        return result;
    }
}
