class Solution {
    public String longestPalindrome(String s) {
        if (s.isEmpty() || s.length() == 1) return s; // no work needed

        int start = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            // every character can be a palindrome center, try both types:
            int len1 = expand(s, i, i);     // odd:  single center  e.g. "aba"
            int len2 = expand(s, i, i + 1); // even: double center  e.g. "abba"
            int len = Math.max(len1, len2);  // best palindrome centered at i

            if (len > maxLen) {
                maxLen = len;
                // back-calculate where palindrome starts:
                // center index - left half length = start
                // integer division naturally handles odd vs even
                start = i - (len - 1) / 2;
            }
        }

        // start + maxLen = exclusive end index, which is what substring() expects
        return s.substring(start, start + maxLen);
    }

    private static int expand(String s, int left, int right) {
        // keep expanding outward as long as characters match on both sides
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // loop exits one step too far on each side (left--, right++ overshot)
        // actual palindrome is between (left+1) and (right-1) inclusive
        // length = (right-1) - (left+1) + 1  =  right - left - 1
        return right - left - 1;
    }
}