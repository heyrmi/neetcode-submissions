class Solution {
    public boolean isPalindrome(String s) {
        if( s == null || s.length() == 0) {
            return false;
        }

        // Remove non alphanumeric chars and then use 2 pointers and make the chars small case. 
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // then use 2 pointers to check 
        int left = 0; 
        int right = cleaned.length() -1;

        while(left <= right) {
            if(cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
