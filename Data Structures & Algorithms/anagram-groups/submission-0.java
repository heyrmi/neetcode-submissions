class Solution {
    //best solution
    public List<List<String>> groupAnagrams(String[] strs) {
        //ans map
        Map<String, List<String>> ans = new HashMap<>();

        for(String str: strs) {
            //interger array to store character count
            int[] count  = new int[26];
            //character count in each array of string in strs
            for(char c: str.toCharArray()) {
                count[c - 'a']++;
            }

            //key
            String key = Arrays.toString(count);

            if(!ans.containsKey(key)) 
                ans.put(key, new ArrayList<>());
            
            ans.get(key).add(str);
        }
        return new ArrayList<>(ans.values());
    }
}
