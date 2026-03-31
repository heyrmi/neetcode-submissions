class Solution {
    public boolean validPalindrome(String s) {
        // using approach of two pointers which can solve this problem
        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return isValidPalindrome(s, left, right-1) || isValidPalindrome(s, left+1, right);
            }
            left++; 
            right--;
        }
        return true;
    }

    // base solution working as a helper
    private boolean isValidPalindrome(String s, int left , int right) {
        while(left < right) {
            // if chars match
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }                
            left++;
            right--;
        }
        return true;
    }
}