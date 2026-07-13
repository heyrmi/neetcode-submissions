class Solution {
    public boolean isAnagram(String s, String t) {
        // Anagrams must contain the same number of characters.
        if (s.length() != t.length())
            return false;

        // Frequency table for all lowercase English letters ('a' to 'z').
        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // Increase the count for the current character in s.
            count[s.charAt(i) - 'a']++;

            // Decrease the count for the corresponding character in t.
            // If s and t are anagrams, these increments and decrements
            // will perfectly cancel each other out.
            count[t.charAt(i) - 'a']--;
        }

        // Any non-zero value means the frequency of that character
        // differs between the two strings.
        for (int frequencyDifference : count) {
            if (frequencyDifference != 0)
                return false;
        }

        return true;
    }
}