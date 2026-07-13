class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();

        for (String str : strs) {
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);
            ans.putIfAbsent(key, new ArrayList<>());
            ans.get(key).add(str);
        }

        return new ArrayList<>(ans.values());
    }
}
