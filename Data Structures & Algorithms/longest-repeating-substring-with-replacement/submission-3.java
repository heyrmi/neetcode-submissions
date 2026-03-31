class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26]; 
        int left = 0, maxFreq = 0, maxLength = 0;

        for(int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            // Number of char to replace = windowSize - maxFreq
            int windowSize = right - left + 1; 
            int replace = windowSize - maxFreq;
            if(replace > k) {
                freq[s.charAt(left) - 'A']--;
                left++; 
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
