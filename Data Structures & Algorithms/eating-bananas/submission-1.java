class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // search in the space of [1, larget pile]
        int left = 1, right = 0; 
        for(int pile: piles) {
            right = Math.max(right, pile);
        }

        int minimumSpeed = right;

        while(left <= right) {
            int candidateSpeed = left + (right - left) / 2; 

            // Calculate total hours needed for this speed
            long totalHourNeeded = 0; 
            for(int pile: piles) {
                totalHourNeeded += Math.ceil((double) pile/ candidateSpeed);
            }

            if(totalHourNeeded <= h) {
                // this speed works, lets keep it and try going more slower
                minimumSpeed = candidateSpeed;
                right = candidateSpeed - 1; 
            } else {
                // too slow must eat faster
                left = candidateSpeed + 1; 
            }
        }
        return minimumSpeed; 
    }
}
