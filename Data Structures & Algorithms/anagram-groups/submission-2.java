class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>(); 

        // Method 1: using sorting
        // for(String str: strs) {
        //     char[] strArr = str.toCharArray(); 
        //     Arrays.sort(strArr); 
        //     String key = new String(strArr);
        //     map.putIfAbsent(key, new ArrayList<>());
        //     map.get(key).add(str);
        // }

        // Method 1: using fixed array to store char map
        for(String str: strs) {
            // Because only 26 chars in lowercase english 
            int[] count = new int[26];
            for(char ch: str.toCharArray()) {
                // count the ASCII value of each char
                count[ch - 'a']++;
            } 

            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }


        return new ArrayList<>(map.values());
    }
}
