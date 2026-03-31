class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] charFreq = new int[26];

        for(char ch: s.toCharArray()) {
            charFreq[ch - 'a']++;
        }

        for(char ch: t.toCharArray()) {
            charFreq[ch - 'a']--;
        }

        for(int i = 0; i<charFreq.length; i++) {
            if(charFreq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
