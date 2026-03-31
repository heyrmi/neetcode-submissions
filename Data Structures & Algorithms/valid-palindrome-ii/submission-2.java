class Solution {
    public boolean validPalindrome(String s) {
       return isPalindrome(s, 0, s.length() - 1, true);
    }

    private boolean isPalindrome(String s, int left, int right, boolean canDelete) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                if(!canDelete) return false;
                return isPalindrome(s, left+ 1, right, false)
                || isPalindrome(s, left, right-1, false);
            }
            left++; 
            right--;
        }
        return true;
    }
}