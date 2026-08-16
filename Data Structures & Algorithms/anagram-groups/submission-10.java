class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for (String str : strs) {
            // char freqMap to check the exact chars in the strings
            int[] anagramKey = new int[26];

            for (char ch : str.toCharArray()) {
                anagramKey[ch - 'a']++;
            }

            String key = Arrays.toString(anagramKey);

            anagramsMap.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramsMap.values());
    }
}
