class Solution {
    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        int prev = 1; // number of ways to reach the step 1
        int curr = 2; // number of ways to reach the step 2
        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }
}
