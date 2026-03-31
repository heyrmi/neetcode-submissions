class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        Map<Character, Integer> lastSeen = new HashMap<>();

        int windowStart = 0, maxLength = 0;

        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char ch = s.charAt(windowEnd);

            if(lastSeen.containsKey(ch) && lastSeen.get(ch) >= windowStart) {
                windowStart = lastSeen.get(ch) + 1; 
            }

            lastSeen.put(ch, windowEnd); 

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        } 
        return maxLength;
    }
}
