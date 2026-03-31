class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<> (); 

        for(int i =0; i<strs.length; i++) {
            // Sort the string and make it a key
            char[] charArr = strs[i].toCharArray(); 
            Arrays.sort(charArr);
            String key = new String(charArr);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(strs[i]);
        }
        return new ArrayList<>(anagrams.values());
    }
}
