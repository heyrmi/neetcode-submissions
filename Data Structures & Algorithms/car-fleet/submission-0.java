class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length; 

        // Store position and speed 
        int[][] cars = new int[n][2];
        for(int i = 0; i<n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Deque<Double> stack = new ArrayDeque<>(); 

        // Sort the cars beased on the position
        Arrays.sort(cars, (a, b) -> b[0] - a[0]); 

        for(int i =0; i<n; i++) {
            // calculate the time for each car
            double time = (double) (target - cars[i][0]) / cars[i][1];
            
            // if this car is slower than the fleet ahead then 
            // add it since its a new fleet
            if(stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }

            // if car is fast then it catches up to others abosorbing in a regular fleet. 
        }

        return stack.size();
    }
}
