class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0; 

        int left = 0, maxLength = 0; 
        Map<Character, Integer> lastSeen = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if(lastSeen.containsKey(ch) && lastSeen.get(ch) >= left) {
                left = lastSeen.get(ch) + 1;
            }

            lastSeen.put(ch, right);

            maxLength = Math.max(maxLength, right - left + 1); 
        }

        return maxLength;
    }
}
