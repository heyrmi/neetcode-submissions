class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;

        Map<Character, Integer> lastSeen = new HashMap<>();

        int left = 0; 
        int maxLength = 0;

        for(int right=0; right < s.length(); right++) {
            char c = s.charAt(right); 
            // if duplicate found remove form left
            if(lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }

            lastSeen.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
