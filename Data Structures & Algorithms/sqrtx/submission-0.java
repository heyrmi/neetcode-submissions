class Solution {
    public int mySqrt(int x) {
        if(x < 2) 
            return x; // sqrt (0) = 0, sqrt(1) = 1
        
        long left = 1, right = x/2; // for all other values sqrt (x) <= x/2

        while(left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if(square == x) {
                return (int) mid;   // perfect quare
            } else if (square < x) {
                left = mid + 1;     // increase from left 
            } else {
                right = mid - 1;    // decrease from right
            }
        }
        // when loop ends right < left, so right is the floor(sqrt(x))
        return (int) right;
    }
}