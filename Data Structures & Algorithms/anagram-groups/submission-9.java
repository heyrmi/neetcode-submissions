class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Maps a character frequency pattern to all words
        // that share that exact pattern.
        Map<String, List<String>> groups = new HashMap<>();

        for (String str : strs) {
            // Build a frequency table for the current word.
            int[] count = new int[26];

            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }

            // Two words are anagrams if their character frequencies match.
            // This frequency array becomes a unique signature for the word.
            String key = Arrays.toString(count);

            // Create the group if we are seeing this signature for the first time.
            groups.putIfAbsent(key, new ArrayList<>());

            // Add the current word to its anagram group.
            groups.get(key).add(str);
        }

        // Return all the grouped anagrams.
        return new ArrayList<>(groups.values());
    }
}