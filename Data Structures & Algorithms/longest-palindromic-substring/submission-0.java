class Solution {
    public String longestPalindrome(String s) {
        if(s.isEmpty() || s.length() == 1) return s; 

        int start = 0, maxLen = 0; 
        for(int i=0; i<s.length(); i++) {
            int len1 = expand(s, i , i); // odd lengths
            int len2 = expand(s, i , i+1); // even lengths
            int len = Math.max(len1, len2);

            if(len > maxLen) {
                maxLen = len;
                // start = center - first half length
                start = i - (len - 1) / 2;
            }
        }

        return s.substring(start, start + maxLen);
    }

    private static int expand(String s, int left, int right) {
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // since indexes will be out of bounds: (right-1) - (left+1) + 1
        return right - left - 1; 
    }
}
