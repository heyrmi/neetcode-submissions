class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        // We will store integer in this stack
        Deque<Integer> stack = new ArrayDeque<>(); 

        for(int i=0; i<n; i++) {
            while(!stack.isEmpty() && 
            temperatures[i] > temperatures[stack.peek()]) {
                int waitDay = stack.pop();
                result[waitDay] = i-waitDay;
            }
            // current day hasn't found its gerter temp day
            stack.push(i);
        }
        return result;
    }
}
