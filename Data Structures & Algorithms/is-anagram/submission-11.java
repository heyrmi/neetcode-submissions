class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charFreq = new int[26];

        // Append chars from one string (say s)
        for (char ch : s.toCharArray()) {
            charFreq[ch - 'a']++;
        }

        // Remove chars from one string (say t)
        for (char ch : t.toCharArray()) {
            charFreq[ch - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charFreq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
