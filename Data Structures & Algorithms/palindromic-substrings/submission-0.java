class Solution {
    public int countSubstrings(String s) {
        int count = 0; 
        for(int i = 0; i<s.length(); i++) {
            count += expandFromCenter(s, i, i); // odd lengths
            count += expandFromCenter(s, i, i+1); // even lengths
        }
        // since we now have all the count, return
        return count; 
    }

    private int expandFromCenter(String s, int left, int right) {
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            // move away from center
            left--;
            right++;
        }
        return count;
    }
}
