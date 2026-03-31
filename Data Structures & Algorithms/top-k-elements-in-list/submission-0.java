class Solution {
    //hashmap solution
    public int[] topKFrequent(int[] nums, int k) {
        //frequency array
        Map<Integer, Integer> freqMap = new HashMap<>(); 

        // initial entry
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // add this in the Heap to get the max count
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a,b) -> freqMap.get(b) - freqMap.get(a)
        );

        //add all elements to the heap
        maxHeap.addAll(freqMap.keySet());

        int[] ans = new int[k];
        for(int i=0; i<k && !maxHeap.isEmpty(); i++){
            ans[i] = maxHeap.poll();
        }

        return ans;
    }
}
