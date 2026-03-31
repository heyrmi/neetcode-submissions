class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); 

        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Option 1 use hashmap 

        return map.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();

        // Option 2 use heap
        // PriorityQueue<Map.Entry<Integer, Integer>> heap = 
        //     new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());


        // heap.addAll(map.entrySet());

        // int[] ans = new int[k];

        // for(int i =0; i<k; i++) {
        //     ans[i] = heap.poll().getKey();
        // }

        // return ans;
    }
}
