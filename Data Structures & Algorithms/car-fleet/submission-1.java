class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length; 

        // store positon and speed for every car
        int[][] cars = new int[n][2];
        for(int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Deque<Double> stack = new ArrayDeque<>(); 

        Arrays.sort(cars, (a,b) -> b[0] - a[0]);

        for(int i = 0; i<n; i++) {
            // time taken for each car time = distance / speed (distance = target - position)
            double time = (double) (target - cars[i][0]) / cars[i][1];

            // if this car is slower than the fleet ahead then add it since its a new fleet
            if(stack.isEmpty() || time > stack.peek()) {
                stack.push(time);
            }

            // if the time taken is less than that then it gets absorbed by other fleets
        }
        return stack.size(); 
    }
}
