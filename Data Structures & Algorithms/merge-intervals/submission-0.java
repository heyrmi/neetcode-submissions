class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort based on the start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>(); 
        result.add(intervals[0]);

        // Step 2: Linear Scan
        for(int i = 1; i<intervals.length; i++) {
            int[] last = result.getLast(); 
            int[] curr = intervals[i];

            // if current's start time <= observed's last time
            if(curr[0] <= last[1]) {
                // overlap => extend the end
                last[1] = Math.max(curr[1], last[1]);
            } else {
                // no overlap => new interval
                result.add(curr);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
