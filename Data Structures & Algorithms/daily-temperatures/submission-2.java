class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        // store indexes in this stack for temperatures
        Deque<Integer> stack = new ArrayDeque<>();

        for(int currentDay = 0; currentDay < n; currentDay++) {
            // i is the current day here
            while(!stack.isEmpty() && temperatures[currentDay] > temperatures[stack.peek()]) {
                int waitDay = stack.pop(); 
                result[waitDay] = currentDay - waitDay; 
            }
            stack.push(currentDay);
        }
        return result; 
    }
}
