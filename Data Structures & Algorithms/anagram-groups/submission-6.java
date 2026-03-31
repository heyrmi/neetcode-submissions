class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        // for(String str: strs) {
        //     // sort and store the key
        //     char[] charArr = str.toCharArray(); 
        //     Arrays.sort(charArr);
        //     String key = Arrays.toString(charArr);
        //     result.putIfAbsent(key, new ArrayList<>());
        //     result.get(key).add(str);
        // }

        for(String str: strs) {
            int[] charFreq = new int[26];
            for(char ch: str.toCharArray()) {
                charFreq[ch - 'a']++;
            }

            String key = Arrays.toString(charFreq);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(str);
        }
        return new ArrayList<>(result.values());
    }
}
